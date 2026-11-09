# Notas del material del profe (Manuel Porras) — recibido el 8 de noviembre

Resumen de las diapositivas y lecturas que subió el estudiante. Los PDF y el PPTX no se guardan en el repo (pesan ~85 MB); estas notas recogen lo que se usó en los módulos.

| Archivo | Tema | Dónde se usó |
|---|---|---|
| Aspectos metodológicos (26 diapositivas) | 4 recomendaciones, consejos para asignar responsabilidades, estilos de control, documento de diseño | M7–M8 («Del profe · 1 y 2») |
| Patrones de Diseño (29) | Alexander, GoF, catálogo, elementos de un patrón, **Proxy** | M7–M8 (intro de patrones, idea Proxy, quiz A3) |
| Diseño de pruebas unitarias (33) | Niveles de pruebas, caja blanca y negra, TDD, JUnit 5 en Eclipse, anotaciones, fallas/errores/éxitos | M6 (ideas 7–9) |
| Diseño de pruebas 2 (22) y lectura «15. Diseño de pruebas» (31) | Regresión, diseño de pruebas, given-when-then, técnicas, cobertura, patrón de cuatro fases | M6 (ideas 7–9, lab C, quiz B3) |
| Estrategias para el manejo de errores (33) | Diseño del manejo del error en 4 pasos, 9 estrategias | M2 (idea 6, lab de estrategias) |
| Ñam – Núcleo de Pedidos, caso de estudio (52) | Proceso de diseño completo | M4–M5 (idea 7, lab C), M7–M8 (inyección y Proxy) |

## Aspectos metodológicos del diseño

- **4 recomendaciones:** (1) reduzca la complejidad (diseños simples, estructuras claras, sostenibles); (2) piense en los cambios que sufrirá el diseño (conocimiento, acciones y decisiones; los cambios deben afectar partes pequeñas y predecibles; modular cuando tenga sentido); (3) reduzca el acoplamiento (qué tantas y qué tan fuertes son las dependencias; el encapsulamiento es la base; depender de lo que la clase ofrece, no de cómo está implementada); (4) prefiera la inyección de dependencias (alternativa 1: buscarlas; alternativa 2: que se las inyecten; por constructor o por setter).
- **Asignación progresiva:** primero las responsabilidades más gruesas; ser oportunista; el proceso es iterativo.
- **Descripción:** precisa, sin verbos vagos («manejar», «gestionar»), una frase corta.
- **Concentrar vs distribuir:** nadie con demasiadas responsabilidades; elementos coherentes; un solo dominio por objeto.
- **Ajustar:** descomponer las muy grandes; no repetir ni sobreponer (ejemplo: clases `deprecated` del JDK).
- **Estilos de control:** centralizado (controladores, dependen de los information holders; fácil encontrar los puntos críticos), delegado (coordinadores; menos acoplamiento, mensajes de más alto nivel; riesgo de colaboraciones complejas o sin trabajo real), disperso (sin centro de control claro).
- **Documento de diseño:** informal, no es manual de implementación; contexto y alcance, objetivos y no-objetivos, diseño con justificación (elementos, diagramas de contexto, APIs, persistencia, pseudocódigo), alternativas, preocupaciones transversales.
- SOLID **no** está en este deck (debe estar en «11a Principios de diseño», que no se recibió).

## Patrones de diseño

- Origen: *A Pattern Language* (Alexander et al., 1977, 253 patrones: nombre del problema y de la solución, consecuencias positivas y negativas). Gang of Four (1995): primer libro de patrones de software.
- Por qué estudiarlos: lenguaje común, herramientas, criterios para analizar diseños. No todos los catálogos son buenos; los patrones no son las únicas soluciones: «nos toca decidir».
- Catálogo GoF: creacionales (Abstract Factory, Builder, Factory Method, Prototype, Singleton), estructurales (Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy), de comportamiento (Chain of Responsibility, Command, Interpreter, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method, Visitor).
- Elementos de un patrón: Intent, AKA, Motivation, Applicability; Structure, Participants, Collaborations; Consequences; Implementation, Sample Code, Known Uses; Related Patterns.
- **Ejemplo desarrollado: Proxy.** Intent: «Provide a surrogate or placeholder for another object to control access to it». Problema: un Cliente con `if (elSujetoEsLocal) ... else { cientos de instrucciones }`. Solución: el Cliente solo conoce `SubjectInterface`; la implementan LocalSubject, Proxy y RemoteSubject, y solo el Proxy le habla a RemoteSubject. En Java: RMI.

## Pruebas (diapositivas 07 y 08, lectura 15)

- **Niveles:** unitarias (aisladas, con stubs o mocks), de integración (bottom-up, big-bang, top-down), de sistema (destructivas, no destructivas, inyección de fallos), de aceptación (usuario, operacional, contractual, alfa/beta).
- **Caja blanca** (estructura: pruebas de API, cobertura, inyección de fallos, mutación, estáticas) y **caja negra** (funcionalidades: tablas de decisión, pares, casos de uso/historias).
- **TDD:** escribir pruebas, correrlas, implementar, todas pasan, refactorizar.
- **JUnit 5 en Eclipse:** `@BeforeEach setUp() throws Exception`, `@Test`, `@DisplayName`, `assertEquals(42, calc.multiply(6, 7), "mensaje")`, `assertNotEquals`, `assertTrue`, `assertAll`, `assertTimeout`, suposiciones `assumeTrue/assumeFalse` (la prueba aborta), `@ParameterizedTest` + `@ValueSource`, `@RepeatedTest`, `@Order`, `@BeforeAll`, `@AfterEach`, `@Nested`, `assertThrows(EmptyStackException.class, stack::pop)`.
- **Fallas, errores y éxitos:** falla = resultado distinto del esperado; error = la operación lanzó una excepción; éxito.
- **Principios:** pruebas pequeñas (una prueba = una responsabilidad), independientes (sin depender del orden ni de operaciones externas, sin efectos de borde), no quemar valores, asserts de alto nivel.
- **Regresión:** reset all, test selection, prioritization; qué seleccionar (las que fallan seguido, visibles, principales, cambios recientes, integración, complejas, frontera, exitosas, un subconjunto de las que fallan).
- **Diseño de pruebas:** cubrir escenarios de negocio y requerimientos críticos, consistentes y reproducibles; estado inicial, no cambiar el estado, reducir el acoplamiento entre pruebas; **given-when-then**.
- **Técnicas:** especificación (particiones de equivalencia, valores de borde/BVA, tabla de decisión, transición de estados), estructura (cobertura de instrucciones, condiciones, ramas, condiciones múltiples; complejidad ciclomática), experiencia (exploración, adivinar errores).
- **Patrón de cuatro fases:** definir la estructura, ejecutar, chequear, destruir la estructura (setUp/tearDown). Test Double.

## Estrategias para el manejo de errores

- El manejo de errores es parte de la calidad del software; hay que balancear el costo con las consecuencias.
- **Diseño en 4 pasos:** (1) identificar qué puede salir mal: fuentes (usuarios, datos, otros sistemas, hardware), situaciones indeseables (caminos de excepción de los casos de uso), analizar colaboraciones (relaciones, interacciones, librerías, archivos) y **regiones de confianza** (mismo equipo > otros equipos > otras empresas); (2) planear: probabilidad de ocurrencia, posibilidad de prevenir, impacto, posibilidad de corregir; (3) diseñar: detección (activa o pasiva; quien lanza la excepción es quien detecta; se anuncia con excepciones o códigos de error), reacción (lo más cerca posible del error; nadie atrapa lo que no puede manejar; mejor elementos que deciden que information holders; dejar pasar o convertir de bajo a alto nivel), información de la excepción y jerarquía (sin exagerar); (4) documentar (los problemas, no solo las soluciones; sin exagerar diagramas; pre y poscondiciones).
- **9 estrategias:** prevenir, inacción (Netflix), balk («Sign in failed…»), suspensión temporal, acciones provisionales (Office, Dropbox), alternativa, apelar a una autoridad superior (Django), deshacer/rollback (transferencia), reintentar.
- **Problemas típicos:** no considerar excepciones, enviarlas a clientes no preparados, manejo inútil (`catch` vacío), validaciones redundantes, exagerar en las correcciones.

## Caso Ñam (Núcleo de Pedidos)

- Proceso: entender el problema → dibujar la frontera (diagrama de contexto) → primera descomposición (API Móvil, Motor de Notificaciones, Núcleo de Pedidos) → objetos y roles → responsabilidades → colaboraciones → clases.
- **Entradas del diseño:** requerimientos no funcionales (menú < 1 s, 40 % de pedidos 11:30–13:30, pedidos cobrados inmutables, 1 repartidor = 1 pedido activo), **reglas del dominio** (horario y zona, total = platos + envío + propina, sin pago exitoso no hay pedido, 1 pedido = 1 restaurante), **restricciones** (presupuesto: minimizar consultas a la API externa; legado: BD inmodificable; equipo: 4 devs Java).
- Estereotipos: Pedido «controller», Despachador «coordinator», Manejador de Carritos / Catálogo / Restaurante / Buscador de Fotos «structurer», Conector DB «service provider», Conexión DB / Pasarela / Mapas «interfacer», el resto information holders.
- El Carrito (no el Manejador) suma el total; aparece el Núcleo de Pedidos para las responsabilidades huérfanas; identificadores resueltos en dos niveles.
- Colaboraciones clave: consultar menú, agregar plato, confirmar pedido, asignar repartidor. Problemas típicos: conexiones desde fuera del vecindario, mensajes de bajo nivel (resuelto con un mensaje grueso al servicio de mapas), muchas alternativas (confirmar pedido).
- Estilo delegado, con centralización consciente en Pedido; consistencia. Centralizado = `AlgoService` gigante con clases de get/set; delegado = la cocina con el expedidor.
- Decisiones: dinero como entero de pesos; estado como enum con transiciones; notificación = plantilla + mapa; fotos como `InputStream`; JDBC; un restaurante por pedido.
- Inyección de dependencias: el Núcleo le inyecta al Pedido el Conector DB y la Pasarela (en pruebas, una pasarela falsa).
