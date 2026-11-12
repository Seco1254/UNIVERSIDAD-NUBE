# Examen 2 de DPOO — revisión (presentado el jueves 12 de noviembre de 2026)

Fotos del enunciado: `examen2_pagina1_p1.jpg`, `examen2_pagina2_p2-p4.jpg`, `examen2_pagina3_p5-p7.jpg`. Sin código que escribir (salvo las pruebas de la 7, que se pueden hacer en Java o en palabras). El profe dijo que calificaría «medio suave»: importa más saber usar los conceptos que saberse los nombres.

Las respuestas del estudiante las contó de memoria en el chat; la revisión compara con una respuesta modelo.

| # | Pts | Tema | Respuesta del estudiante | Revisión |
|---|---|---|---|---|
| 1 | 1 | Caso La Esquina: 2 RF, 2 RNF, todas las restricciones | RF: llevar la cuenta exacta de lo pedido por mesa; llevar la cuenta de las personas y enlazarla con mesas y pedido. RNF: $600 USD al mes; no mostrarle al cliente lo que la sede no puede cumplir | RF1 bien. RF2 bien si apunta al aforo (el portero no sabía cuántos había). «$600 al mes» es una **restricción**, no un RNF. «No prometer lo que no se cumple» está más cerca de un RF o regla del dominio; como RNF habría que decirlo como consistencia en tiempo real del inventario. |
| 2 | 0,5 | TarjetaRegalo lanza OperacionNoSoportada en reembolsar() | B (Liskov) | Correcta. |
| 3 | 0,5 | «En RDD cada responsabilidad debe convertirse exactamente en un método» | Falsa | Correcta; la justificación es que una responsabilidad puede ser saber, hacer o decidir, y puede quedar en atributos, en varios métodos o repartida en colaboraciones. |
| 4 | 1 | Peajes sin saldo: 3 roles, tipo de responsabilidad y colaboración en orden | Revisión (saldo), Captura (foto), Multa; flujo revisión → captura → multa | Orden lógico bien. Falta quién **notifica al propietario**, falta un coordinador explícito y faltan los estereotipos (tipo de responsabilidad). |
| 5 | 0,5 | Priorizar 5 pruebas de regresión | P3, P1, P5, P2, P4 | Orden defendible: cubre el módulo modificado → falló antes → criticidad → duración. La nota depende de haber escrito ese criterio. |
| 6 | 0,5 | «Si todas las unitarias pasan, no hace falta integración» | Falsa: unitarias prueban métodos, integración módulos | Correcta. La justificación más precisa: las unitarias prueban cada unidad aislada (con stubs/mocks); la integración prueba las interfaces e interacciones entre módulos, que pueden fallar aunque cada uno funcione solo. |
| 7 | 1 | Dos pruebas del Club Deportivo Séneca con el patrón de cuatro fases | setUp compartido (club vacío + Ana + café en inventario), prueba 1: Ana compra un café y baja el inventario; prueba 2: agregar un socio sube el número de socios; tearDown compartido | Estructura de cuatro fases bien. Revisar que el tearDown diga qué deshace y que los asserts tengan valores esperados exactos. |

## Respuestas modelo

### 1. La Esquina

- **RF:** (a) registrar los pedidos de cada mesa y llevar su cuenta hasta el cierre (los meseros perdieron la cuenta; cobros de más y de menos); (b) controlar el aforo de cada sede, registrando entradas y salidas (el portero cerró «a ojo» y llegó la policía); (c) tienda en línea que solo ofrezca lo disponible en cada sede y las formas de entrega que esa sede permite.
- **RNF:** (a) consistencia en tiempo real del inventario entre el bar y la tienda en línea (la botella vendida una hora antes seguía disponible en la página), con una medida, por ejemplo menos de un minuto; (b) aguantar la carga del último viernes de quincena en todas las sedes a la vez; (c) usabilidad para meseros y porteros que vienen del cuaderno (registrar un pedido en pocos toques).
- **Restricciones:** equipo de máximo 4 personas que lo hace todo (no hay área de tecnología); presupuesto de 30 000 USD para todo el proyecto, servidores y puesta en marcha incluidos; primera versión usable en 10 semanas, antes de la temporada de diciembre; costo de operación de máximo 600 USD al mes en promedio.

### 4. Peajes

1. **LectorTag** (interfaz): detecta el paso y le entrega el id del tag a ControlPeaje.
2. **ControlPeaje** (coordinador): recibe el evento y reparte el trabajo en orden.
3. **Cuenta** del tag (contenedor de información): sabe su saldo y responde si alcanza para la tarifa (la decisión es suya, porque tiene la información).
4. Si no alcanza: **Cámara** (interfaz con el hardware) toma la foto de la placa.
5. **ServicioMultas** (proveedor de servicios) crea la **Multa** (contenedor de información) con placa, foto, monto y fecha.
6. **Notificador** (interfaz con el exterior) le avisa al propietario, que se busca en el **RegistroVehiculos** (estructurador).

Estilo de control delegado: ControlPeaje coordina, la Cuenta decide sobre su saldo y cada servicio hace lo suyo.

### 5. Regresión

P3 (cubre el módulo, falló antes, alta) → P1 (cubre, alta) → P5 (cubre, media) → P2 (no cubre, pero falló antes y dura 1 min) → P4 (no cubre, no falló). Criterio: primero lo que toca el cambio (impacto), luego lo que ha fallado (frecuencia de fallo), luego la criticidad y, de último, la duración como desempate. P2 y P4 se pueden invertir si se pone la criticidad por encima del historial de fallos, siempre que se diga.
