# Plan de estudio — Examen 2, DPOO (ISIS-1226)

> **Versión interactiva (la que se usa):** [Plan Examen 2 DPOO](https://claude.ai/artifact/98SHNeM1aGDQeidWHXeHug). Este archivo es la copia de respaldo en texto.

**Fecha del examen:** martes 10 de noviembre de 2026, 11:00 (clase 27; la fecha sale del cronograma: confírmala con el profe) · **Peso:** 25 % · **Temas:** clases 12 a 26
**Profesor:** Manuel Porras · **Sección:** 5 · **Días de estudio:** 7 (martes 3 → lunes 9 de noviembre)

> El **jueves 5** entregas el **Proyecto 2** (10 %). Hasta ese día el proyecto va primero; los módulos de martes a jueves están pensados para ayudarte a cerrarlo.

---

## 1. Qué sabemos del examen

En el paquete no hay exámenes 2 anteriores. Todo lo de esta sección sale del Parcial 1 y del cronograma, y supone que el formato se repite.

### Formato del Parcial 1 (80 minutos, en computador)

- **Preguntas 1 a 4 (7,5 pts c/u = 30 %):** selección múltiple con un caso corto. Miden si entiendes el *porqué* del concepto, no la definición.
- **Pregunta 5 (70 %):** «implementa en Java una aplicación basada en el siguiente diagrama UML», y se entrega en ZIP. Algunos métodos son libres; en otros se espera la funcionalidad mínima «según lo visto en el curso».

### Dónde puede salir cada tema (estimado)

| Tema | Módulo | Selección múltiple | Práctica | Clases | Prioridad |
|---|---|---|---|---|---|
| De UML a Java | M1 | Posible | **Seguro** | Base del Examen 1 | 🔴 |
| Manejo de errores | M2 | Probable | **Muy probable** | 1 (la 24) + Examen 1 | 🔴 |
| Diseño: roles, responsabilidades y colaboraciones | M5 | **Muy probable** | Posible | 4 (14 y 17–19) | 🔴 |
| Pruebas unitarias con JUnit | M6 | Probable | Probable | 2 (20–21) + Taller 5 | 🔴 |
| Principios: acoplamiento, cohesión y SOLID | M7 | Probable | Posible | 2 (15 y 22) | 🟠 |
| Patrones de diseño | M8 | Probable | Posible | 1 (la 23) | 🟠 |
| Análisis y modelo del mundo | M4 | Probable | Posible | 1 (la 12) + Taller 4 | 🟠 |
| Librerías, frameworks y APIs | M3 | Posible | Poco probable | 1 (la 25) | 🟡 |
| Swing | M3 | Poco probable | No (el Taller 6 es después) | 1 (la 26) | 🟡 |

*La clase 13 (proceso de diseño) se canceló; ese tema quedó repartido en las clases de diseño.*

### Lo que sabemos del profe

1. **Pregunta el porqué, no la definición.** Las de selección múltiple traen un caso corto, por ejemplo una interfaz con varias clases que la implementan.
2. **La práctica vale el 70 %** y es en Java, en 80 minutos, con entrega en ZIP.
3. **Recalcó `super(...)`:** si la clase padre tiene constructor, la hija lo llama.
4. **A las 12:20 todos entregan lo que tengan.** Exporta un ZIP que compile desde temprano y vuelve a exportarlo al final.
5. **Antes del Parcial 1 publicó dos UML de semestres anteriores** (2025-20 y 2026-10). Revisa Bloque Neón esta semana: si publica algo, entra al taller.
6. **Usa sus propios casos:** Club Deportivo Séneca, Nam – Núcleo de Pedidos, procesador de imágenes, SpotiAlpes, Cines, Hamburguesas y la tienda de coleccionables.

### Por confirmar con el profe (hoy en clase o el jueves)

- ¿El examen es el martes 10 de noviembre a las 11:00, en la sala Turing?
- ¿Tiene la misma estructura del Parcial 1: selección múltiple con caso y una práctica en Java?
- En la práctica, ¿dan el UML o hay que diseñarlo a partir de historias de usuario? ¿Hay que escribir pruebas JUnit?
- ¿Entran la clase de librerías y frameworks (martes 3) y la de Swing (jueves 5)?
- ¿Se pueden usar apuntes o la documentación de Java?

---

## 2. Metodología adaptada a DPOO

Las cuatro partes de siempre se quedan, en el mismo orden. Cambia lo que pasa en cada una, porque este examen no pide plantear y despejar: pide entender el porqué de las decisiones de diseño (la selección múltiple) y programar rápido y bien en Java (la práctica de 70 pts).

| Sección | En Física | En DPOO |
|---|---|---|
| 📖 **1. Teoría** | Intuición, fórmulas, ejemplos con letras y una receta. | Intuición primero y una **receta** para cada tipo de pregunta. Los ejemplos resueltos son **código paso a paso**: cada paso dice qué se escribe, por qué y cómo queda. Cuando se mejora un diseño se ve el antes y el después: lo que se borra, tachado; lo nuevo, resaltado. |
| 🔬 **2. Lab de código** | Simulaciones para ver las fuerzas. | Interactivos para ver lo que el código no muestra: traducir UML ↔ Java, armar tarjetas CRC, seguir una excepción por la pila de llamadas, predecir si una prueba pasa o falla. Y un experimento corto para correr en el IDE. |
| 🛠️ **3. Taller en el IDE** | Problemas de parciales, en papel. | Primero el material del profe (Talleres 4 y 5, Nam, SpotiAlpes, UML de parciales) y después variantes nuevas. Cada ejercicio tiene un **tiempo meta**, porque la práctica es contra reloj. Me mandas el código (pegado o en ZIP) y te lo corrijo paso a paso con una rúbrica tipo profe. |
| ✅ **4. Quiz de paso** | 3 cortas + 2 tipo parcial. | **3 de selección múltiple con caso** (estilo Parcial 1, con la razón de cada opción) + **2 de código corto** (completar, corregir o escribir). Pasas con **≥ 4/5**; si no, repaso del error y Quiz B. |

**Atajo:** si sientes que ya dominas un módulo, haz el quiz primero. Si sacas ≥ 4/5, lo saltas.

**Reglas:**

- **Sigue igual:** asumo que no sabes nada más allá de los módulos anteriores. Cada módulo abre con una tabla, que ahora es **«Vocabulario de este módulo»** (término, cómo se ve en Java o en UML, qué significa), y trae al menos un ejemplo resuelto por idea clave. En el taller respondo solo lo que preguntas.
- **La figura ahora es el diagrama o el código:** toda pregunta con un caso trae su UML (SVG) o su fragmento de Java, como en el examen.
- **Los casos son los del profe**, con nombres en español como en clase.
- **Nuevo: plantillas de memoria.** Son la hoja de fórmulas de DPOO: esqueletos de código que escribes sin pensar, porque en 80 minutos no hay tiempo de buscarlos.

| Plantilla | Ejemplo | Módulo |
|---|---|---|
| Clase hija con `super(...)` y `@Override` | `super(nombre, precio);` | M1 |
| Asociación `0..*`: lista creada en el constructor, con agregar y buscar | `this.socios = new ArrayList<>();` | M1 |
| Clase abstracta e interfaz con `implements` | `public abstract class Coleccionable implements Vendible` | M1 |
| Excepción propia: `extends Exception`, `throw`, `throws`, `try/catch` | `throw new CupoLlenoException(nombreClase);` | M2 |
| Tarjeta CRC | Clase · Responsabilidades · Colaboradores | M5 |
| Clase de prueba: `@BeforeEach`, `assertEquals`, `assertThrows` | `assertThrows(CupoLlenoException.class, () -> club.inscribir(socio));` | M6 |
| Singleton, Facade, Adapter y Strategy | `public static Club getInstancia()` | M8 |

---

## 3. Los módulos

El orden sigue tu semana, con dos hilos que se intercalan:

```
Práctica (70 %):  M1 UML → Java ─► M2 Errores ──────────────────► M6 Pruebas ─┐
Diseño:                              M4 Análisis ─► M5 Diseño ─► M7 Principios ─► M8 Patrones ─┤
Aparte:           M3 Librerías, frameworks y APIs (+ Swing)                                      ├─► M9 SIMULACRO
```

### M1 — De UML a Java
> **Artifact:** [M1 · De UML a Java](https://claude.ai/artifact/T8pydDxRpDQE4CxTnz7hiB). Usa un mini-caso propio (un club con socios); el código de la teoría y del taller está probado en Java 21. Tu Parcial 1 y los UML del profe entran como T5 cuando subas la carpeta 06.

*Refuerzo (Examen 1) · Base de la práctica de 70 pts · Mar 3 · 1–1,5 h*
*Material: repaso_base/UML (carpeta 02) · 2. UML (carpeta 03) · UML de parciales anteriores (carpeta 06)*

- **Teoría:** leer todo el diagrama de clases: visibilidad (`+` público, `-` privado, `#` protegido), atributos `nombre: Tipo`, métodos `nombre(p: Tipo): Retorno`, abstractos en cursiva, estáticos subrayados, «interface». Cada flecha y su código: asociación con multiplicidad (`1` → un atributo; `0..*` → una lista que se crea en el constructor), agregación y composición, herencia (`extends` y `super(...)`), realización (`implements`) y dependencia (un parámetro o una variable local).
- **Receta para la práctica de 80 minutos:** (1) crea el proyecto y los paquetes; (2) escribe primero lo que no depende de nada (excepciones, interfaces, clases sin flechas salientes); (3) luego los padres y después las hijas; (4) al final la clase que coordina; (5) compila cada 10–15 minutos; (6) genera constructores y getters con el IDE; (7) exporta un ZIP que compile desde temprano y otro al final.
- **Lab de código:** un UML interactivo: tocas una flecha o un atributo y se resalta la línea de Java que le corresponde, y al revés.
- **Taller:** el UML de tu Parcial 1 (tienda de coleccionables) rehecho contra reloj; los UML de 2025-20 y 2026-10; una variante nueva con interfaz y clase abstracta.
- **Quiz:** qué código corresponde a una flecha o a una multiplicidad; por qué no compila una hija sin `super(...)`; escribir una clase hija; traducir una asociación `0..*` con su método para agregar.
- **Trampas:** olvidar `super(...)`; no crear la lista en el constructor (`NullPointerException` al agregar); comparar `String` con `==`; ignorar la multiplicidad.

### M2 — Manejo de errores
*Mié 4 · 2,5–3 h · Clase 24 + excepciones del Examen 1*
*Material: 13b. Estrategias para el manejo de errores · 4. Excepciones (carpeta 03) · repaso_base/Excepciones (carpeta 02) · lectura [23] (Clean Code, cap. 7)*

- **Teoría:** la familia de las excepciones: `Exception` (checked: el compilador obliga a manejarla) y `RuntimeException` (unchecked). `throw` lanza; `throws` avisa en la firma. Qué corre en cada camino de un `try/catch/finally`. Excepciones propias con un mensaje que diga qué falló y con qué dato. Estrategias: excepciones en vez de códigos de error, no retornar `null`, no pasar `null`, definir las excepciones pensando en quien las atrapa. **Dónde se lanza y dónde se atrapa:** el modelo valida y lanza; la capa que puede hacer algo (la interfaz) atrapa y le avisa al usuario.
- **Receta para la práctica:** (1) busca en el UML o en el enunciado las reglas que se pueden romper; (2) crea la excepción propia; (3) lánzala en el método del modelo con un mensaje claro; (4) declárala con `throws`; (5) atrápala en la consola o la interfaz; (6) pruébala con `assertThrows` (M6).
- **Lab de código:** la pila de llamadas animada: sigues una excepción desde donde se lanza hasta el `catch` que la atrapa y ves cuándo corre el `finally`. Antes de cada paso predices qué se imprime.
- **Taller:** 6 trazas de `try/catch/finally` para predecir la salida; excepciones propias para la tienda de coleccionables (o tu Proyecto 2); cambiar códigos de error y `null` por excepciones.
- **Quiz:** qué imprime un `try/catch/finally`; checked o unchecked; dónde conviene atrapar; escribir una excepción propia y el método que la lanza; corregir un `catch` vacío.
- **Trampas:** el `catch` vacío que se traga el error; atrapar `Exception` antes que la específica (no compila); usar excepciones para el flujo normal; retornar `null`.

### M3 — Librerías, frameworks y APIs (+ Swing)
*Jue 5 · ~1 h · Clases 25 y 26: las ves esta semana*
*Material: 12a. Reutilización (carpeta 03) · lecturas [19] [20] · tus notas de las clases del martes y el jueves*

- **Teoría:** reutilizar en vez de reescribir. Librería frente a framework: a la librería la llamas tú; el framework te llama a ti (inversión de control). Qué es una API: el contrato de lo que algo ofrece, no de cómo lo hace; puede ser local o un servicio remoto. Lo que hace buena una API según Bloch: fácil de usar bien y difícil de usar mal, nombres claros, lo mínimo necesario. Swing en lo básico: una ventana (`JFrame`), sus componentes y un listener que reacciona a un evento.
- **Lab de código:** clasificador de herramientas que ya usaste (JUnit, Swing, `java.util`…): decides si cada una es librería o framework y ves quién llama a quién.
- **Taller:** criticar y rediseñar la API de una clase del Club Deportivo Séneca; opcional: una ventana con un botón en tu IDE.
- **Quiz:** librería o framework; qué consejo de Bloch viola una API; qué hace un listener.
- **Trampas:** creer que un framework es solo una librería grande; confundir API con interfaz gráfica.

### M4 — Análisis: el modelo del mundo del problema
*Vie 6 · ~2 h · Clase 12 + Taller 4*
*Material: 01 El mundo del problema · 02 Análisis y problema del mundo (carpeta 02) · 5. Análisis y modelo del mundo (carpeta 03) · lectura [5]*

- **Teoría:** el modelo del mundo son los conceptos del negocio, sus atributos y sus relaciones, todavía sin decisiones de software. Requerimientos funcionales (qué hace el sistema), no funcionales (cómo debe hacerlo) y restricciones (lo que no se puede cambiar). Historias de usuario: «Como [rol] quiero [algo] para [beneficio]», con criterios de aceptación.
- **Receta:** (1) subraya los sustantivos (candidatos a clase o atributo) y los verbos (candidatos a responsabilidad); (2) descarta sinónimos y lo que está fuera del alcance; (3) decide atributo o clase; (4) dibuja las relaciones con multiplicidad; (5) revisa el diagrama contra cada requerimiento.
- **Lab de código:** un subrayador interactivo: marcas las palabras de un enunciado (Cines) como clase, atributo, relación o descarte, y el diagrama se arma solo.
- **Taller:** Taller 4 (Cines) rehecho contra reloj; el análisis del Proyecto 1 (Club Deportivo Séneca) revisado con la receta; un enunciado nuevo.
- **Quiz:** atributo o clase; requerimiento funcional, no funcional o restricción; cuál historia de usuario está bien escrita; modelo del mundo de un enunciado corto; criterios de aceptación para una historia.
- **Trampas:** meter software en el modelo del mundo (menú, controlador, archivo); atributos que en realidad son relaciones; requerimientos que no se pueden verificar («rápido», «fácil de usar»).

### M5 — Diseño: roles, responsabilidades y colaboraciones
*Sáb 7 · 2,5–3 h · El tema con más clases (14 y 17–19)*
*Material: 03 Diseño · 04 Diseño 2 · 06 Nam – Núcleo de Pedidos (carpeta 02) · 6. El proceso de diseño · Historias de usuario a diseño de objetos (carpeta 03) · lectura [9] (Wirfs-Brock, caps. 3 a 6)*

- **Teoría:** diseñar es tomar decisiones con ventajas y desventajas. Una responsabilidad es algo que un objeto sabe, hace o decide, y va al objeto que tiene la información para cumplirla. Los 6 estereotipos de rol de Wirfs-Brock (information holder, structurer, service provider, coordinator, controller, interfacer; con los nombres que use el profe). Colaboraciones: quién le pide qué a quién. Estilos de control: centralizado, delegado y disperso, con sus ventajas. Tarjetas CRC.
- **Receta, de una historia de usuario a objetos:** (1) quién recibe la petición; (2) qué información hace falta y quién la tiene; (3) reparte las responsabilidades; (4) dibuja las colaboraciones; (5) revisa que ninguna clase haga de todo.
- **Lab de código:** tarjetas CRC interactivas para el caso Nam: arrastras responsabilidades a las clases y ves el estilo de control que resulta y cuántas dependencias tiene cada clase.
- **Taller:** Nam – Núcleo de Pedidos; la hoja de trabajo del procesador de imágenes; Competencia y Banco de Historias de Usuario; el diseño de tu Proyecto 2 con el checklist.
- **Quiz:** qué estereotipo tiene una clase; qué estilo de control muestra un diagrama; a quién le asignas una responsabilidad; tarjetas CRC para una historia; repartir las responsabilidades de una clase que hace de todo.
- **Trampas:** la clase que controla todo; asignar una responsabilidad a quien no tiene la información; confundir el estereotipo de una clase con su nombre.

### M6 — Pruebas unitarias con JUnit
*Sáb 7 · ~2 h · Clases 20–21 + Taller 5*
*Material: 07 Diseño de pruebas unitarias · 08 Diseño de pruebas 2 (carpeta 02) · 14 y 15 (carpeta 03) · Taller 5 con su esqueleto · lectura [24] (Robillard, cap. 5)*

- **Teoría:** qué es una prueba unitaria y qué la hace buena. Diseñar los casos antes del código: el normal, los límites y los de error, en una tabla. Escenarios con `@BeforeEach`. Cada prueba sigue preparar → ejecutar → verificar. Los asserts: `assertEquals(esperado, obtenido)`, `assertTrue`, `assertFalse`, `assertNull`, `assertNotNull`, `assertThrows`. *(La versión de JUnit se ajusta al esqueleto del Taller 5.)*
- **Receta:** (1) por cada método, una tabla: escenario, entrada, resultado esperado; (2) una prueba por fila; (3) nombres que digan qué prueban; (4) prueba también las excepciones de M2.
- **Lab de código:** el semáforo de JUnit: ves una clase y sus pruebas y predices cuáles pasan y cuáles fallan. Después el lab mete un error en la clase y miras cuáles de tus pruebas lo detectan.
- **Taller:** Taller 5 (Hamburguesas) con su esqueleto, rehecho; pruebas para la tienda de coleccionables, incluidas las excepciones de M2; encontrar el error que tus pruebas no detectan.
- **Quiz:** qué verifica una prueba; qué caso falta; qué assert usar; escribir una prueba con escenario; escribir la prueba de una excepción.
- **Trampas:** invertir esperado y obtenido en `assertEquals`; comparar `double` sin margen; probar solo el caso feliz; pruebas que dependen del orden en que corren.

### M7 — Principios: acoplamiento, cohesión y SOLID
*Dom 8 · ~2 h · Clases 15 y 22*
*Material: 05 Aspectos metodológicos (carpeta 02) · 6b. Aspectos metodológicos · 11a. Principios de diseño · Ejemplo SOLID SpotiAlpes (carpeta 03) · lecturas [10] (Clean Code, cap. 10) y [14] (MVC)*

- **Teoría:** acoplamiento (cuánto depende una clase de otras) y cohesión (qué tan relacionadas están sus responsabilidades): se busca bajo acoplamiento y alta cohesión. Separar modelo, vista y controlador. SOLID uno por uno, cada uno con su olor y su arreglo: responsabilidad única, abierto/cerrado, sustitución de Liskov, segregación de interfaces e inversión de dependencias.
- **Receta para «¿qué principio viola?»:** imagina que llega un requerimiento nuevo: ¿cuántas clases tocas y por qué? La razón te dice el principio.
- **Lab de código:** detector de olores: código con violaciones; tocas la línea sospechosa, eliges el principio y ves el antes y el después.
- **Taller:** el ejemplo SOLID de SpotiAlpes, rehecho; violaciones nuevas para encontrar y arreglar; tu Proyecto 2 revisado con los 5 principios.
- **Quiz:** qué principio viola un fragmento; Liskov con una subclase que rompe lo que promete el padre; qué depende de qué en la inversión de dependencias; refactor con una interfaz para abierto/cerrado; separar responsabilidades.
- **Trampas:** creer que responsabilidad única es «un método por clase»; pensar que si compila, la herencia está bien; confundir inversión de dependencias con inyección de dependencias.

### M8 — Patrones de diseño
*Dom 8 · 2–2,5 h · Clase 23*
*Material: 09 Patrones de Diseño (carpeta 02) · 11b. Patrones de diseño (carpeta 03) · lecturas [16] (Gang of Four, cap. 1), [17] (Head First Design Patterns, cap. 1) y [18]*

- **Teoría:** qué es un patrón: un nombre, un problema, una solución y sus consecuencias. Las 3 familias: creacionales, estructurales y de comportamiento. Dos ideas del libro: programar contra una interfaz y preferir la composición a la herencia. Los patrones de las diapositivas, Singleton, Facade y Adapter, más Strategy (lectura [17]): de cada uno, el problema que resuelve, su UML y su esqueleto en Java. Los detalles que se suelen hacer mal (lectura [18]).
- **Lab de código:** elige el patrón: te muestro un caso, escoges el patrón y ves su UML sobre ese caso.
- **Taller:** cada patrón implementado en el Club Deportivo Séneca; reconocer patrones en código que no los nombra.
- **Quiz:** qué patrón resuelve un caso; qué está mal en un Singleton; Adapter o Facade; escribir un Singleton; escribir un Adapter para una clase dada.
- **Trampas:** Singleton con constructor público; confundir Adapter (hace encajar una interfaz) con Facade (simplifica un subsistema); meter patrones donde no hacen falta.

### M9 — Simulacro de 80 minutos, estilo Porras
*Lun 9 · ~2 h (80 min + corrección) · En tu IDE, sin internet*

- Un examen nuevo con la estructura del Parcial 1: **4 de selección múltiple con caso** (7,5 pts c/u) y **una práctica de 70 pts**: un UML nuevo que implementas en Java con sus excepciones propias y sus pruebas JUnit, y entregas en ZIP. Si el profe confirma otra estructura, el simulacro la sigue.
- Cronometrado: 80 minutos, como en la sala Turing.
- Lo corrijo con una rúbrica tipo profe: estructura según el UML, funcionalidad mínima, excepciones y pruebas, por separado.
- **Meta: ≥ 80/100.** Si sacas menos, el lunes en la noche repasamos solo lo que perdió puntos.

---

## 4. Cronograma

La carga sigue tu semana: **martes y jueves, liviana** (1–1,5 h); **lunes y viernes, suave** (~2 h); **miércoles, media** (2,5–3 h); **sábado y domingo, pesada** (4–5 h). Primero va lo que sostiene la práctica de 70 pts (UML → Java y errores), que también te sirve para cerrar el Proyecto 2. El jueves, día de entrega, va lo más corto. El diseño, que es lo más conceptual y lo que más clases tuvo, va el fin de semana.

| Día | Fecha | Carga | Módulo | Tiempo | Además |
|---|---|---|---|---|---|
| 1 | Mar 3 nov | Liviana | **M1** De UML a Java | 1–1,5 h | Clase 25 (librerías y frameworks): pregúntale al profe lo de «Por confirmar». Súbeme la carpeta 06. |
| 2 | Mié 4 nov | Media | **M2** Manejo de errores | 2,5–3 h | Proyecto 2 |
| 3 | Jue 5 nov | Liviana | **M3** Librerías, frameworks y APIs (+ Swing) | ~1 h | Clase 26 (Swing) · **entrega del Proyecto 2** |
| 4 | Vie 6 nov | Suave | **M4** Análisis | ~2 h | |
| 5 | Sáb 7 nov | Pesada | **M5** Diseño + **M6** Pruebas | 4–5 h | |
| 6 | Dom 8 nov | Pesada | **M7** Principios + **M8** Patrones | 4–5 h | |
| 7 | Lun 9 nov | Suave | **M9** Simulacro + repaso de plantillas | ~2 h | |
| — | **Mar 10 nov** | — | 30 min con tus plantillas y **EXAMEN 2** (11:00) | — | Llega temprano |

**El Proyecto 2 va primero hasta el jueves.** Si te come el día, haz la teoría y el quiz del módulo y usa tu proyecto como taller.
**Si te atrasas:** recorta primero M3 (deja solo el quiz) y después los labs. **Nunca recortes M2, M5, M6 ni el simulacro.**
**Si vas adelantado:** en M1 y M4 haz el quiz primero; si sacas ≥ 4/5, ese tiempo va para M5 y M6.

---

## 5. Tu progreso

| Módulo | Teoría | Lab | Taller | Quiz (nota) | Estado |
|---|---|---|---|---|---|
| M1 De UML a Java | ☐ | ☐ | ☐ | — | ⏳ |
| M2 Manejo de errores | ☐ | ☐ | ☐ | — | 🔒 |
| M3 Librerías, frameworks y APIs | ☐ | ☐ | ☐ | — | 🔒 |
| M4 Análisis | ☐ | ☐ | ☐ | — | 🔒 |
| M5 Diseño: roles, responsabilidades y colaboraciones | ☐ | ☐ | ☐ | — | 🔒 |
| M6 Pruebas con JUnit | ☐ | ☐ | ☐ | — | 🔒 |
| M7 Principios | ☐ | ☐ | ☐ | — | 🔒 |
| M8 Patrones | ☐ | ☐ | ☐ | — | 🔒 |
| M9 Simulacro | — | — | — | —/100 | 🔒 |

---

## Anexo: material

En [`material/`](material/) por ahora solo está el LEEME del paquete (`00_LEEME_DPOO_Examen2.md`), con el temario, el cronograma, los archivos de cada tema y los links de las lecturas. Para construir los módulos con el vocabulario y las diapositivas del profe falta subir, en este orden:

1. **Carpeta 06 (formato de examen):** el intento del Parcial 1 y los UML. Sirve para ver dónde se perdieron puntos y armar M1 y el simulacro.
2. **Carpeta 02 (presentaciones del profe):** para usar su vocabulario y citar la diapositiva. «03 Diseño.pdf» pesa unos 45 MB: subirlo aparte o dividido.
3. **Carpeta 04 (talleres):** Taller 4 (Cines), Taller 5 (Hamburguesas) con su esqueleto (dice qué versión de JUnit usa el curso) y la hoja del procesador de imágenes.
4. **Carpetas 05 y 03:** el enunciado y las historias de usuario del Club Deportivo Séneca, y las presentaciones oficiales.

Mientras no estén, los módulos salen de las lecturas y del LEEME, y marcan lo que haya que verificar contra las diapositivas.
