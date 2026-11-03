# DPOO · Paquete para el Examen 2

**Curso:** ISIS-1226 Diseño y Programación Orientada a Objetos · **Sección 5** · Semestre 2026-20
**Profesor:** Manuel Porras (mf.porras@uniandes.edu.co) · Oficina ML-334 (reserva asesoría con el link del anuncio "Horarios de atención DPOO" en Bloque Neón)
**Fuente de todo el material:** Bloque Neón del curso (descargado el 2 de noviembre de 2026)

---

## 1. Datos clave del Examen 2

| | |
|---|---|
| Peso | **25 %** de la nota final (el Examen 1 valió 20 %) |
| Cuándo | Clase 27, semana 14 → **martes 10 de noviembre de 2026** (fecha calculada con el cronograma; confírmala con el profe) |
| Formato esperado | Individual, combina **teoría y práctica** (lo dice el programa del curso) |
| Referencia | El Parcial 1 fue en la sala de computadores Turing (edificio ML, primer piso), de 11:00 a 12:20 |
| Clases que quedan antes | Martes 3 nov: Librerías, Frameworks y Servicios · Jueves 5 nov: Interfaces gráficas (Swing y Java2D) + entrega del Proyecto 2 |

**Cómo se calculó la fecha:** las semanas del cronograma cuadran con hechos reales del semestre: el Parcial 1 fue el martes 8 de septiembre (clase 11), las presentaciones del Proyecto 1 fueron el jueves 24 de septiembre (clase 16), el receso fue del 28 de septiembre al 2 de octubre, y las fechas de entrega de Bloque Neón coinciden con eso. Contando desde ahí, la clase 27 cae el martes 10 de noviembre.

---

## 2. Cómo evalúa el profe (lo que sabemos del Parcial 1)

El Parcial 1 se hizo como cuestionario en Bloque Neón, en sala de cómputo, con 80 minutos:

- **Preguntas 1 a 4 (7,5 puntos c/u = 30 %):** selección múltiple con un caso corto (por ejemplo, una interfaz con varias clases que la implementan) y opciones que ponen a prueba si entiendes el *porqué* del concepto, no la definición de memoria.
- **Pregunta 5 (70 %):** práctica. "Implementa en Java una aplicación basada en el siguiente diagrama UML" (caso: tienda de coleccionables), y se entrega la aplicación comprimida en ZIP. Algunos métodos se implementan como uno quiera, pero en otros se espera una funcionalidad mínima "según lo visto en el curso".
- El profe permite llegar tarde, pero a las 12:20 todos entregan lo que tengan.
- Antes del Parcial 1 publicó dos diagramas UML de parciales anteriores (2025-20 y 2026-10) como material de práctica (están en la carpeta 06).
- Detalle que el profe recalcó: cuando una clase hija hereda de una clase padre con constructor, hay que llamar al constructor del padre con `super(...)`.

**Supuesto razonable para el Examen 2** (confirmarlo con el profe): misma estructura (preguntas conceptuales con casos + un ejercicio práctico grande), pero con los temas nuevos: análisis, diseño (roles, responsabilidades, colaboraciones), principios y patrones de diseño, pruebas unitarias con JUnit y manejo de errores.

En la carpeta 06 está tu intento del Parcial 1 (preguntas, opciones que marcaste y puntaje por pregunta) para que la IA vea el estilo exacto del profe y dónde perdiste puntos.

---

## 3. Temario del Examen 2 (lo visto después del Examen 1: clases 12 a 26)

| Semana (fechas) | Clase | Tema | Lectura previa | Lectura adicional | Entrega |
|---|---|---|---|---|---|
| 6 (7–11 sep) | 12 | Análisis y el modelo del mundo del problema | [5]* | | Taller 4 - Análisis (2 %) |
| 7 (14–18 sep) | 13 | El proceso de diseño (la clase del 15 sep se canceló) | [6] | [7] | |
| 7 | 14 | Identificación de roles, responsabilidades y colaboraciones | [9] | | Proyecto 1, entrega 1/2: Análisis (5 %) |
| 8 (21–25 sep) | 15 | Aspectos metodológicos del diseño | | [10] [29] | |
| 8 | 16 | Presentaciones Proyecto 1, entrega 1 | | | |
| — | — | Semana de receso (28 sep – 2 oct) | | | |
| 9 (5–9 oct) | 17 | Práctica de diseño | | [8] | |
| 9 | 18 | Práctica de diseño | | [15] | |
| 10 (12–16 oct) | 19 | Cierre del diseño | | | Proyecto 1, entrega 2/2: Implementación + Diseño (11 %) |
| 10 | 20 | Pruebas unitarias | [24] | [25] [26] | |
| 11 (19–23 oct) | 21 | Pruebas unitarias | | | |
| 11 | 22 | Principios de diseño | | [14] | Taller 5 - Pruebas (2 %) |
| 12 (26–30 oct) | 23 | Patrones de diseño | [16] | [17] [18] | |
| 12 | 24 | Estrategias para el manejo de errores | [23] | | |
| 13 (2–6 nov) | 25 | Librerías, Frameworks y Servicios | [19] [20] | [21] [22] | |
| 13 | 26 | Interfaces gráficas: Swing y Java2D | | | Proyecto 2, entrega 1/1: Diseño e Implementación (10 %) |
| **14 (9–13 nov)** | **27** | **EXAMEN 2 (25 %)** | | | |

\* La lectura [5] es de la clase 10, pero es la base del tema de análisis.

**Base que se da por sabida** (temas del Examen 1): Java, POO, UML (diagrama de clases), herencia y polimorfismo, interfaces, genericidad, excepciones y persistencia.

**Conceptos que más se repiten en las diapositivas** (revisé el texto de cada presentación):
- Análisis: modelo del mundo del problema, requerimientos, restricciones, historias de usuario, diagrama de clases.
- Diseño: responsabilidades, roles y estereotipos de rol, colaboraciones, estilos de control, tarjetas CRC, de historias de usuario a objetos, acoplamiento y cohesión.
- Principios: SOLID (incluye sustitución de Liskov e inversión de dependencias), cohesión.
- Patrones: qué es un patrón y el libro del Gang of Four; ejemplos como Adapter, Facade y Singleton.
- Pruebas: diseño de casos de prueba, escenarios, JUnit y asserts.
- Errores: excepciones y estrategias para manejar errores.
- Reutilización: librerías vs. frameworks, APIs.

---

## 4. Qué archivo usar para cada tema

| Tema | Presentación del profe Porras (carpeta 02) | Presentación oficial del curso (carpeta 03) | Para practicar (carpetas 04, 05, 06) |
|---|---|---|---|
| Análisis y modelo del mundo | 01 El mundo del problema · 02 Análisis y problema del mundo | 5. Análisis y modelo del mundo del problema | Taller 4 (Cines) · Proyecto 1 (Club Deportivo Séneca) |
| Proceso de diseño · roles, responsabilidades y colaboraciones | 03 Diseño · 04 Diseño 2 | 6. El proceso de diseño · Historias de Usuario a Diseño de Objetos | Hoja de trabajo del procesador de imágenes · Competencia y Banco de Historias de Usuario |
| Aspectos metodológicos del diseño | 05 Aspectos Metodológicos | 6b. Aspectos metodológicos | |
| Práctica y cierre del diseño | 06 Nam – Núcleo de Pedidos (caso de estudio) | | Proyectos 1 y 2 |
| Pruebas unitarias (JUnit) | 07 Diseño de pruebas unitarias · 08 Diseño de pruebas 2 | 14. Diseño de pruebas unitarias · 15. Diseño de pruebas | Taller 5 (Hamburguesas) + su esqueleto de código |
| Principios de diseño (SOLID, etc.) | — | 11a. Principios de diseño · Ejemplo SOLID SpotiAlpes | |
| Patrones de diseño | 09 Patrones de Diseño | 11b. Patrones de diseño | |
| Manejo de errores | repaso_base / Excepciones y Modelar UML | 13b. Estrategias para el manejo de errores · repaso_base / 4. Excepciones | |
| Librerías, frameworks y servicios (APIs) | — | 12a. Reutilización | |
| Interfaces gráficas (solo se alcanza a ver una clase antes del examen) | — | (el módulo de GUIs aún no está publicado) | Taller 6 (es para después del examen) |
| Repaso de UML | repaso_base / UML | repaso_base / 2. UML | Ejemplos de Parcial 1 (UML de semestres anteriores) |

**Ojo:** en Bloque Neón los enlaces de "12a. Reutilización", "13b. Estrategias para el manejo de errores", "14. Diseño de pruebas unitarias" y "15. Diseño de pruebas" están rotos (apuntan a una carpeta equivocada). Los archivos sí existen y vienen en este paquete.

---

## 5. Carpetas del paquete

- **01_Programa_y_Cronograma**: programa oficial del curso. Tu sección (martes y jueves) sigue el programa "sin Festivo"; desde la clase 5 los dos programas son idénticos.
- **02_Presentaciones_Profe_Porras**: las diapositivas que el profe usa en tu sección, numeradas en el orden en que se vieron. `repaso_base` tiene UML y Excepciones.
- **03_Presentaciones_Oficiales_Curso**: las diapositivas comunes a todas las secciones.
- **04_Practica_Talleres_y_Hojas**: hoja de trabajo de diseño, Taller 4 (análisis), Taller 5 (pruebas, con esqueleto de código) y Taller 6 (GUIs).
- **05_Proyectos**: enunciados del Proyecto 1 y 2 (Club Deportivo Séneca) y las historias de usuario.
- **06_Formato_de_Examen**: ejemplos de parcial que publicó el profe, el UML de tu Parcial 1 y tu intento con las preguntas.

Casos que usa el profe y que sirven para practicar: Club Deportivo Séneca (proyectos), Nam – Núcleo de Pedidos (caso de diseño), procesador de imágenes (hoja de trabajo), SpotiAlpes (SOLID), Cines (análisis), Hamburguesas (pruebas) y tienda de coleccionables (Parcial 1).

**Archivo pesado:** "03 Diseño.pdf" pesa unos 45 MB; si la IA no lo acepta, súbelo aparte o divídelo. Los demás pesan menos de 30 MB.

---

## 6. Lecturas del temario (links)

Los links con "ezproxy" piden iniciar sesión con tu cuenta Uniandes.

- [5] J. Villalobos, *Modelos y Metamodelos*, 2020 — https://www.researchgate.net/publication/341679692_Modelos_y_Metamodelos_-_Lecturas_para_Arquitectos_de_Negocio
- [6] M. P. Robillard, *Introduction to Software Design with Java*, cap. 1 (Introducción) — https://link-springer-com.ezproxy.uniandes.edu.co:8443/chapter/10.1007/978-3-030-24094-3_1
- [7] E. Sciore, *Java Program Design*, cap. 1 (Modular Software Design) — https://link-springer-com.ezproxy.uniandes.edu.co:8443/chapter/10.1007/978-1-4842-4143-1_1
- [8] M. Ubl, *Design Docs at Google*, 2020 — https://www.industrialempathy.com/posts/design-docs-at-google/
- [9] R. Wirfs-Brock y A. McKean, *Object Design: Roles, Responsibilities and Collaborations*, caps. 3 a 6. Secciones clave: A Discovery Strategy (p. 78-79), What's in a name? (p. 88-93), What are responsibilities? (p. 110-111), Where do responsibilities come from (p. 111-125), What is object collaboration? (p. 150-152), Collaboration options (p. 153-158), What is control style? y Control style options (p. 196-198), Making trade-offs (p. 198-205) — https://learning-oreilly-com.ezproxy.uniandes.edu.co:8443/library/view/object-design-roles/0201379430/
- [10] R. C. Martin, *Clean Code*, cap. 10 (Classes) — https://learning-oreilly-com.ezproxy.uniandes.edu.co:8443/library/view/clean-code-a/9780136083238/chapter10.html
- [14] E. Sciore, *Java Program Design*, cap. 11 (Model, View, Controller) — https://link-springer-com.ezproxy.uniandes.edu.co:8443/chapter/10.1007/978-1-4842-4143-1_11
- [15] McLaughlin, Pollice y West, *Head First Object-Oriented Analysis and Design*, cap. 8 (Originality is Overrated) — https://learning-oreilly-com.ezproxy.uniandes.edu.co:8443/library/view/head-first-object-oriented/0596008678/ch08.html
- [16] Gamma et al., *Design Patterns* (Gang of Four), cap. 1 (Introduction) — https://learning-oreilly-com.ezproxy.uniandes.edu.co:8443/library/view/design-patterns-elements/0201633612/ch01.html
- [17] Freeman et al., *Head First Design Patterns*, cap. 1 — https://learning-oreilly-com.ezproxy.uniandes.edu.co:8443/library/view/head-first-design/9781492077992/ch01.html
- [18] Ó Cinnéide y Fagan, *Design patterns: the devils in the detail*, 2006 — https://www.researchgate.net/publication/228969309_Design_patterns_the_devils_in_the_detail
- [19] S. Preibisch, *API Development*, cap. 1 (APIs: What Are They?) — https://link-springer-com.ezproxy.uniandes.edu.co:8443/chapter/10.1007/978-1-4842-4140-0_1
- [20] J. Bloch, *How to design a good API and why it matters*, 2006 — https://doi.org/10.1145/1176617.1176622
- [21] J. Bloch, *How to Design a Good API and Why it Matters* (presentación), 2007 — http://www.newt.com/java/GoodApiDesign-JoshBloch.pdf
- [22] F. Doglio, *REST API Development with Node.js*, cap. 2 (API Design Best Practices) — https://link-springer-com.ezproxy.uniandes.edu.co:8443/chapter/10.1007/978-1-4842-3715-1_2
- [23] R. C. Martin, *Clean Code*, cap. 7 (Error Handling) — https://learning-oreilly-com.ezproxy.uniandes.edu.co:8443/library/view/clean-code-a/9780136083238/chapter07.html
- [24] M. P. Robillard, *Introduction to Software Design with Java*, cap. 5 (Unit Testing), sin la sección 5.4 — https://link-springer-com.ezproxy.uniandes.edu.co:8443/chapter/10.1007/978-3-030-24094-3_5
- [25] G. O'Regan, *Concise Guide to Software Testing*, cap. 3 — https://link-springer-com.ezproxy.uniandes.edu.co:8443/chapter/10.1007/978-3-030-28494-7_3
- [26] T. A. Majchrzak, *Improving Software Testing*, cap. 2 — https://link-springer-com.ezproxy.uniandes.edu.co:8443/chapter/10.1007/978-3-642-27464-0_2
- [29] M. Nygard, *Uncoupling* (charla en video), 2018 — https://www.youtube.com/watch?v=esm-1QXtA2Q

Videos que el curso recomienda en Bloque Neón:
- Análisis y diseño: https://www.youtube.com/watch?v=bmSAYlu0NcY · https://www.youtube.com/watch?v=plMttQWztRM
- Pruebas unitarias: https://www.youtube.com/watch?v=EZ05e7EMOLM · https://www.youtube.com/watch?v=IN9lftH0cJc
- Manejo de errores: https://www.youtube.com/watch?v=Y9clBHENy4Q · https://www.youtube.com/watch?v=MwjQVAwIATE · https://www.youtube.com/watch?v=baUBln86YO8

---

## 7. Cronograma completo del curso (contexto)

| Semana | Clases | Temas | Entregas |
|---|---|---|---|
| 1 (3–7 ago) | 1–2 | Introducción al curso · Historias de usuario | Taller 1 - Introducción a Java (2 %) |
| 2 (10–14 ago) | 3–4 | Introducción a Java · POO en Java | |
| 3 (17–21 ago) | 5–6 | POO en Java · Herencia y polimorfismo | Taller 2 - Estructuras de datos (2 %) |
| 4 (24–28 ago) | 7–8 | Genericidad · Excepciones en Java | |
| 5 (31 ago – 4 sep) | 9–10 | Persistencia · Análisis y modelo del mundo del problema | Taller 3 - POO, herencia y genericidad (4 %) |
| 6 (7–11 sep) | 11–12 | **Examen 1 (20 %)** · Análisis y modelo del mundo | Taller 4 - Análisis (2 %) |
| 7 (14–18 sep) | 13–14 | Proceso de diseño · Roles, responsabilidades y colaboraciones | Proyecto 1 E1 (5 %) |
| 8 (21–25 sep) | 15–16 | Aspectos metodológicos · Presentaciones Proyecto 1 | |
| Receso | | | |
| 9 (5–9 oct) | 17–18 | Práctica de diseño | |
| 10 (12–16 oct) | 19–20 | Cierre del diseño · Pruebas unitarias | Proyecto 1 E2 (11 %) |
| 11 (19–23 oct) | 21–22 | Pruebas unitarias · Principios de diseño | Taller 5 - Pruebas (2 %) |
| 12 (26–30 oct) | 23–24 | Patrones de diseño · Manejo de errores | |
| 13 (2–6 nov) | 25–26 | Librerías, frameworks y servicios · GUIs (Swing y Java2D) | Proyecto 2 (10 %) |
| 14 (9–13 nov) | 27–28 | **Examen 2 (25 %)** · GUIs | |
| 15 (16–20 nov) | 29–30 | GUIs | Taller 6 - GUIs (2 %) |
| 16 (23–27 nov) | 31–32 | GUIs | |
| 17 (finales) | — | Sustentación del proyecto final | Proyecto 3 (15 %) |

---

## 8. Prompt para pegarle a la IA

Copia y pega esto junto con los archivos del paquete:

```
Eres mi tutor para el Examen 2 de "Diseño y Programación Orientada a Objetos" (ISIS-1226, Universidad de los Andes, sección 5, profesor Manuel Porras). Te adjunto el material oficial del curso y un archivo LEEME con el temario, el cronograma, el formato de examen y la lista de archivos.

Contexto:
- Hoy es [FECHA DE HOY]. El Examen 2 es el martes 10 de noviembre de 2026 (vale 25 %). Puedo estudiar [X] horas por día.
- El examen entra con lo visto después del Examen 1 (clases 12 a 26): análisis y modelo del mundo del problema, proceso de diseño, roles/responsabilidades/colaboraciones, aspectos metodológicos, principios de diseño, patrones de diseño, pruebas unitarias con JUnit, manejo de errores, librerías/frameworks/servicios y una introducción a Swing.
- El Parcial 1 tuvo 4 preguntas de selección múltiple con casos (7,5 pts c/u) y un ejercicio práctico de 70 pts: implementar en Java una aplicación a partir de un diagrama UML, en 80 minutos y en computador. Mi intento está en la carpeta 06: úsalo para ver el estilo del profe y mis puntos débiles.

Lo que necesito:
1. Un plan de estudio día por día desde hoy hasta el examen, con bloques de tiempo, que priorice los temas más pesados y mis puntos débiles, y que deje el último día para un simulacro completo.
2. Para cada tema, enséñamelo como lo haría el profe: básate primero en sus presentaciones (carpeta 02_Presentaciones_Profe_Porras) y usa sus mismos casos y vocabulario (Club Deportivo Séneca, Nam – Núcleo de Pedidos, procesador de imágenes, SpotiAlpes, Cines, Hamburguesas). Usa las presentaciones oficiales (carpeta 03) y las lecturas para llenar huecos. Dime de qué archivo y diapositiva sale cada idea.
3. Después de cada tema, hazme 3 o 4 preguntas de selección múltiple con un caso, en el estilo del Parcial 1, y explícame por qué cada opción está bien o mal.
4. Ejercicios prácticos como los del examen: a partir de un enunciado o historias de usuario, que yo haga el análisis, el diseño (clases, roles, responsabilidades, colaboraciones, diagrama UML), la implementación en Java y las pruebas con JUnit. Corrígeme como lo haría el profe.
5. Al final, un simulacro completo de 80 minutos con la misma estructura del Parcial 1, con su solución y una rúbrica.

Reglas: no inventes temas que no estén en el material; si algo no está claro en los archivos, dímelo en vez de suponerlo. Si un archivo es muy pesado para leerlo, pídeme que lo suba aparte.
```
