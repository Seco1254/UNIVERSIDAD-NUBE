# Plan de estudio — Parcial 3, Cálculo 2 (MATE 1214)

> **Versión interactiva (la que se usa):** [Plan Parcial 3 Cálculo](https://claude.ai/artifact/Ra9LHTCCAvquo8459V5bhS). Este archivo es la copia de respaldo en texto.

**Fecha del parcial:** lunes 26 de octubre de 2026, salón O_102 · **Peso:** 20 % · **Temas:** sucesiones y series, 11.1 a 11.10 del Stewart (Taylor hasta el ejemplo 6)
**Profesor:** Otaivin Martínez Mármol · **Días de estudio:** 6 (martes 20 → domingo 25 de octubre)
**Formato esperado (como en 2025-10):** 75 minutos, sobre 50 puntos, sin apuntes, sin calculadora y sin hojas extra. «Respuesta sin justificación será calificada con cero».

> La hoja de ejercicios 10.1 (curvas paramétricas) **no entra en este parcial**: ese tema empieza el martes 27 de octubre. Queda guardada en `material/` para el final.

---

## 1. Qué dicen los 2 parciales anteriores

Revisé los parciales 3 de 2023-19 (intersemestral, 110 min) y 2025-10 (75 min). Los dos son **del profesor Martínez, el mismo que tienes ahora**, y tienen la misma estructura:

- **Punto 1: «Determine si las series convergen o divergen».** De 3 a 5 series de **6 pts** cada una. No piden el valor.
- **Serie de potencias: radio e intervalo de convergencia.** **14 pts.** Fue **el mismo ejercicio, idéntico**, en los dos parciales.
- **Serie de Taylor** de una función A/(x − c) centrada en un punto: 6 pts en 2023 y 11 pts en 2025, con una segunda parte de logaritmo.
- **Suma de una serie** (telescópica): 7 pts, solo en 2025.
- No venían soluciones oficiales. La clave del anexo la saqué yo y la verifiqué con cálculo simbólico.

### Frecuencia por tipo de problema

| Tipo de problema | 2023-19 | 2025-10 | Pts históricos (de 100) | Prioridad |
|---|---|---|---|---|
| **Radio e intervalo de una serie de potencias** (con los dos extremos) | P2 | P3 | **28 (28 %)** | 🔴 Sale seguro: idéntico 2 veces |
| **Serie de Taylor con la geométrica** (A/(x − c) centrada en a; ln integrando) | P3 | P4 a, b | **17 (17 %)** | 🔴 Sale seguro |
| **Comparación en el límite con una serie p** (fracciones con raíces) | P1a | P1a | **12 (12 %)** | 🔴 2 de 2 |
| **Comparación directa con el seno acotado** (0 ≤ sen² n ≤ 1) | P1e | P1c | **12 (12 %)** | 🔴 2 de 2 |
| **Criterio de la raíz** (todo elevado a n o a n²) | P1d | P1b | **12 (12 %)** | 🔴 2 de 2 |
| **Suma telescópica** (fracciones parciales) | — | P2 | 7 (7 %) | 🟠 Muy probable |
| **Criterio del cociente** (factoriales) | P1b | — | 6 (6 %) | 🟠 Muy probable |
| **Serie alternante** (Leibniz, convergencia condicional) | P1c | — | 6 (6 %) | 🟠 Muy probable |

### Patrones del profesor

1. **Repite ejercicios tal cual.** La serie de potencias Σ (−1)ⁿ(x + 2)ⁿ/(3ⁿ(n² + 1)) salió idéntica en 2023 y en 2025. Las dos de Taylor siguen la misma plantilla: A/(x − c) centrada en a = c + 1.
2. **Saca el parcial de sus hojas de ejercicios.** El 2023 P1e (Σ sen² n/n³) es literal la hoja 11.4 (h), y el 2025 P1b (((n + 2)/n)^(n²)) es una variante de la hoja 11.6 (i), (1 + 1/n)^(n²). **Hacer las hojas completas es el mejor seguro.**
3. **Las series del punto 1 siempre mezclan tres criterios:** comparación en el límite, comparación con el seno acotado y raíz. En 2023 sumó cociente y alternante. Lo difícil es **escoger el criterio**, no la cuenta.
4. **Sin justificación, cero.** Hay que nombrar el criterio, verificar sus hipótesis y cerrar con una frase: «por el criterio de …, la serie converge». El programa dice que un cálculo sin explicación no da puntos.
5. **En Taylor pide el intervalo de convergencia** («no olvide indicar el intervalo»), y en la del logaritmo los dos extremos dan distinto: (4, 6].
6. **Nunca han salido:** monotonía y acotación de sucesiones, criterio de la integral, estimación del error (restos) ni las series de Maclaurin de eˣ, sen x o cos x. Se ven, pero rápido.
7. **Sin apuntes, sin calculadora y sin hojas extra.** Todo va de memoria. La hoja de fórmulas mental se arma en el simulacro.

---

## 2. Metodología: módulos de 4 secciones

| Sección | Qué hacemos |
|---|---|
| 📖 **1. Teoría** | Conceptos, fórmulas y una **receta paso a paso** para el tipo de problema del parcial. |
| 🔬 **2. Lab / visual** | Gráficas interactivas para *ver* lo que pasa: sumas parciales, términos, el intervalo de convergencia en la recta numérica. |
| 🛠️ **3. Taller** | Problemas tipo parcial: primero los de los parciales anteriores, luego las hojas del profesor y al final variantes nuevas. Los resuelves tú y yo te corrijo paso a paso. |
| ✅ **4. Quiz de paso** | 5 preguntas: 3 cortas o conceptuales y 2 tipo parcial. **Pasas con ≥ 4/5.** Si no pasas, repasamos el error y haces un Quiz B con preguntas nuevas. |

**Atajo:** si sientes que ya dominas un módulo, puedes hacer el quiz primero. Si sacas ≥ 4/5, lo saltas.

**Cómo aplican tus preferencias en Cálculo:**

- Cada módulo abre con la tabla **«Símbolos de este módulo»** (aₙ, Sₙ, Σ, lim, n!, e, R…). Como aquí casi nada tiene unidades, esa columna se cambia por un ejemplo.
- La teoría arranca desde la intuición y trae al menos un ejemplo resuelto por idea clave, **paso a paso**, diciendo qué se hace, por qué y la cuenta.
- **Ejemplos de teoría solo con letras:** las constantes van como letras (a, b, c, p, r) para que se vea la estructura. Por ejemplo, Σ (a·n + b)/(c·n³ + d) en lugar de Σ (2n + 1)/(n³ + 5). Los números quedan para el taller y el quiz.
- En series casi no hay montajes físicos. Donde ayuda, va una figura: la recta numérica del intervalo, las sumas parciales o los términos.
- La M mayúscula para la masa y los ángulos desde la horizontal eran de Física: aquí no aplican.

---

## 3. Los módulos

El orden sigue las dependencias: cada módulo usa lo del anterior. M6 es el que más pesa: vale 28 % y salió idéntico dos veces.

```
M1 Límites ─► M2 Series básicas ─► M3 Comparación + serie p ─► M4 Alternantes, cociente y raíz
                                                                          │
         M8 SIMULACRO ◄─ M7 Taylor ◄─ M6 Series de potencias ◄─ M5 ¿Qué criterio uso?
```

### M1 — Sucesiones y límites al infinito: la caja de herramientas
*Libro: 11.1 · Visto en clase (21 y 22 de septiembre) · ~1–1,5 h*

- **Teoría:** qué es una sucesión aₙ y qué significa que converja. Las herramientas que usa todo el parcial:
  - El término dominante manda: dividir por la potencia más alta en (a·nᵏ + …)/(c·nᵐ + …).
  - Jerarquía de crecimiento: ln n ≪ nᵖ ≪ rⁿ ≪ n! ≪ nⁿ.
  - Límites de memoria: (1 + a/n)ⁿ → eᵃ, n^(1/n) → 1, a^(1/n) → 1 y rⁿ → 0 si |r| < 1.
  - L'Hôpital pasando a la variable x, y el teorema del sándwich para (−1)ⁿ y sen n.
  - Monotonía y acotación (las pide la hoja, pero nunca han salido en el parcial): prioridad baja.
- **Lab / visual:** la gráfica de puntos aₙ contra n con una franja alrededor del límite; una carrera de crecimiento entre ln n, n², 2ⁿ, n! y nⁿ; (1 + a/n)ⁿ acercándose a eᵃ con un control para a.
- **Taller:** hoja 11.1 (3) a–e (límites), (1) y (2) (términos y fórmula general), y los límites que aparecen dentro de los parciales: ((n + 2)/n)ⁿ, 2n²/(n² + 3), √(n³ + 5)·n^(3/2)/(n³ − 3).
- **Quiz:** límites con término dominante, (1 + a/n)ⁿ, jerarquía y sándwich.
- **Trampas:** (1 + 1/n)ⁿ tiende a e, no a 1 («1 elevado a infinito» es indeterminado); creer que aₙ → 0 significa que la serie converge.

### M2 — Series: geométrica, telescópica y criterio de divergencia
*Libro: 11.2 · Visto en clase (25 de septiembre) · 7 pts en 2025 · ~1,5 h*

- **Teoría:** una serie es una suma infinita; la suma parcial S_N suma los primeros términos; la serie converge si S_N tiene límite. **Geométrica** Σ a·rⁿ: converge si |r| < 1 y vale (primer término)/(1 − r). **Telescópica:** fracciones parciales, escribir S_N, tachar lo que se cancela y tomar el límite. **Criterio de divergencia:** si aₙ no tiende a 0, la serie diverge; si aₙ → 0, el criterio no dice nada.
- **Lab / visual:** las sumas parciales como escalera, con un control de r para la geométrica; animación de la telescópica tachando términos; la armónica contra Σ 1/n².
- **Taller:** 2025 P2 (Σ 2/(k² + k) = 2); hoja 11.2 (1) notación, (2) a–f geométricas, (3) a–d telescópicas y (5) a–d divergencia.
- **Quiz:** el valor de una geométrica que no empieza en n = 0, una telescópica y decidir si el criterio de divergencia sirve.
- **Trampas:** la fórmula usa el **primer término de la suma**, que no siempre es a; usar el criterio de divergencia para «probar» que una serie converge.

### M3 — Comparación directa, comparación en el límite y serie p
*Libro: 11.3–11.4 · Visto en clase · 24 pts históricos · ~2 h (miércoles 21 y jueves 22)*

- **Teoría:** serie p: Σ 1/nᵖ converge si y solo si p > 1 (de dónde sale, con el criterio de la integral en versión corta). **Comparación directa:** si 0 ≤ aₙ ≤ bₙ y Σ bₙ converge, Σ aₙ converge; si aₙ ≥ bₙ ≥ 0 y Σ bₙ diverge, Σ aₙ diverge. **Seno y coseno acotados:** 0 ≤ sen² n ≤ 1. **Comparación en el límite:** si lim aₙ/bₙ = L con 0 < L < ∞, las dos series hacen lo mismo. **Receta para escoger bₙ:** quedarse con el término dominante de arriba y de abajo.
- **Lab / visual:** barras de aₙ y bₙ lado a lado; el área bajo 1/xᵖ contra los rectángulos de la serie, con un control para p.
- **Taller:** 2025 P1a (√(n³ + 5)/(n³ − 3), converge), 2025 P1c ((1 + sen² n)/n, diverge), 2023 P1a (√(n + 1)/(n + 2), diverge), 2023 P1e (sen² n/n³, converge); hoja 11.4 completa (a–o); un ejemplo del criterio de la integral con Σ 1/(n ln n).
- **Quiz:** escoger bₙ, calcular el límite y redactar la conclusión.
- **Trampas:** ser menor que una serie divergente no prueba nada; no decir que L es finito y positivo; los términos negativos del principio (2025 P1a con n = 1) no cambian la conclusión, porque quitar finitos términos no cambia la convergencia.

### M4 — Alternantes, convergencia absoluta, cociente y raíz
*Libro: 11.5–11.6 · Visto en clase · 24 pts históricos · ~2 h (viernes 23)*

- **Teoría:** **criterio de Leibniz** para series alternantes: bₙ decreciente y bₙ → 0. Convergencia **absoluta** (Σ |aₙ| converge) y **condicional**. **Cociente:** L = lim |aₙ₊₁/aₙ|. **Raíz:** L = lim |aₙ|^(1/n). Con L < 1 converge absolutamente, con L > 1 diverge y con L = 1 no dice nada. Cuándo usar cada uno: factoriales y rⁿ → cociente; todo elevado a n o a n² → raíz.
- **Lab / visual:** el zigzag de las sumas parciales de una alternante encerrando el límite; la razón aₙ₊₁/aₙ graficada contra n, con la línea L = 1.
- **Taller:** 2023 P1b (2ⁿ⁻¹/(n + 1)!, cociente → 0), 2023 P1c ((−1)ⁿ 2n/(n² + 1), condicional), 2023 P1d ((2n²/(n² + 3))ⁿ, raíz → 2), 2025 P1b (((n + 2)/n)^(n²), raíz → e²); hoja 11.5 (1) a–l y (2); hoja 11.6 a–j.
- **Quiz:** decidir si converge absolutamente, condicionalmente o diverge, y escoger entre cociente y raíz.
- **Trampas:** con L = 1 el criterio no concluye (las series p siempre dan 1); el profesor le dice **«test del radio»** al cociente, que no es el radio de convergencia; verificar «decreciente» con la derivada; simplificar mal (n + 1)!/n! = n + 1.

### M5 — ¿Qué criterio uso? Estrategia y redacción
*Libro: 11.7 · El bloque de criterios vale 36–60 % del parcial · ~1,5–2 h (sábado 24)*

- **Teoría:** el árbol de decisión en 7 preguntas:
  1. ¿aₙ no tiende a 0? → diverge.
  2. ¿Es geométrica o serie p? → se decide de una.
  3. ¿Tiene factoriales o rⁿ? → cociente.
  4. ¿Todo está elevado a n? → raíz.
  5. ¿Es una fracción de potencias o raíces? → comparación en el límite.
  6. ¿Tiene sen o cos acotados? → comparación directa.
  7. ¿Tiene (−1)ⁿ? → primero convergencia absoluta; si falla, Leibniz.

  Más las **plantillas de redacción**: la frase exacta de justificación para cada criterio.
- **Lab / visual:** un «clasificador»: aparecen series mezcladas, escoges el criterio y te dice al instante si acertaste y por qué.
- **Taller:** los 8 ejercicios del punto 1 de los dos parciales, mezclados y sin pista, a 6 minutos cada uno; series mezcladas de las hojas.
- **Quiz:** 5 series mezcladas, redactadas como en el parcial.
- **Trampas:** usar el cociente con una fracción de potencias (da 1 y se pierde el tiempo); no escribir la conclusión.

### M6 — Series de potencias: radio e intervalo de convergencia
*Libro: 11.8 · Visto en clase (19 de octubre) · 28 % del parcial, idéntico 2 veces · ~2–2,5 h (sábado 24)*

- **Teoría:** Σ cₙ(x − a)ⁿ tiene centro a y radio R. Receta en 4 pasos:
  1. Criterio del cociente con |x − a| adentro.
  2. L(x) < 1 ⇒ |x − a| < R.
  3. Probar **los dos extremos** reemplazando x: cada extremo es una serie numérica que se decide con M3 y M4.
  4. Escribir el intervalo con corchetes o paréntesis según lo que dio cada extremo.

  Más los casos R = 0 y R = ∞.
- **Lab / visual:** la recta numérica con el centro, el radio y los extremos; con un control de x ves las sumas parciales converger o explotar.
- **Taller:** 2025 P3 = 2023 P2 (R = 3, intervalo [−5, 1]); hoja 11.2 (4) a–d (geométricas con x); variantes donde un extremo converge y el otro no, R = ∞ con n! abajo y R = 0 con n! arriba.
- **Quiz:** radio e intervalo de 2 series nuevas y 3 preguntas cortas sobre los extremos.
- **Trampas:** olvidar los extremos (son la mitad del puntaje); en x = −5, (−1)ⁿ(−3)ⁿ = 3ⁿ: los signos se cancelan; escribir el radio como si fuera el intervalo.

### M7 — Representación de funciones y series de Taylor
*Libro: 11.9–11.10 (hasta el ejemplo 6) · 17 % del parcial · lo ves en clase hoy (11.9) y el viernes (11.10) · ~2,5–3 h (domingo 25)*

- **Teoría:** la geométrica como molde: 1/(1 − u) = Σ uⁿ si |u| < 1. **Receta para A/(x − c) centrada en a:** escribir x − c = (a − c) + (x − a), sacar (a − c) como factor común y usar u = −(x − a)/(a − c). Derivar e integrar término a término (ln, arctan, 1/(1 − x)²): el radio no cambia, pero los extremos hay que revisarlos de nuevo. **Taylor:** cₙ = f⁽ⁿ⁾(a)/n!; Maclaurin de eˣ, sen x y cos x, y cómo multiplicar por x o cambiar x por x².
- **Lab / visual:** f(x) y sus polinomios de Taylor T_N con un control de N: se ve que solo se pegan a f dentro del intervalo (4, 6).
- **Taller:** 2025 P4a (3/(x − 4) en 5: Σ 3(−1)ⁿ(x − 5)ⁿ, intervalo (4, 6)), 2025 P4b (3 ln(x − 4) en 5: intervalo (4, 6]), 2023 P3 (2/(x + 3) en −2: intervalo (−3, −1)); variantes con a − c ≠ 1; Maclaurin de x·e^(x²) y x·cos x.
- **Quiz:** una serie por la geométrica, una por integración y 3 preguntas cortas.
- **Trampas:** olvidar la constante C al integrar (se halla evaluando en el centro); al integrar, el intervalo puede ganar un extremo.

### M8 — Simulacro estilo Martínez
*~2 h (75 min de examen + corrección) · domingo 25*

- Un parcial **nuevo** con la estructura de 2025-10: P1 tres series (18 pts), P2 una suma (7), P3 radio e intervalo (14) y P4 Taylor (11). Total: 50.
- **Cronometrado: 75 minutos**, sin apuntes ni calculadora.
- Lo califico con rúbrica: criterio nombrado, hipótesis verificadas, cuenta y conclusión por separado.
- Construyes tu **hoja de fórmulas mental**: lo que tienes que saber de memoria.
- **Meta: ≥ 40/50.** Si sacas menos, el lunes antes del parcial repasas solo lo que perdiste.

---

## 4. Cronograma

La carga sigue tu semana: **martes y jueves, liviana** (1–1,5 h); **lunes y viernes, suave** (~2 h); **miércoles, media** (2,5–3 h); **sábado y domingo, pesada** (4–5 h). Lo que más puntos vale (series de potencias y Taylor, 45 % del parcial) queda para el fin de semana, cuando ya tienes los criterios.

| Día | Fecha | Carga | Módulo | Tiempo |
|---|---|---|---|---|
| 1 | Mar 20 oct | Liviana | **M1** Sucesiones y límites (en clase: 11.9) | 1–1,5 h |
| 2 | Mié 21 oct | Media | **M2** Series básicas + **M3** teoría y lab | 2,5–3 h |
| 3 | Jue 22 oct | Liviana | **M3** taller y quiz | 1–1,5 h |
| 4 | Vie 23 oct | Suave | **M4** Alternantes, cociente y raíz (en clase: Taylor, entra) | ~2 h |
| 5 | Sáb 24 oct | Pesada | **M5** ¿Qué criterio uso? + **M6** Series de potencias | 4–5 h |
| 6 | Dom 25 oct | Pesada | **M7** Taylor + **M8** Simulacro de 75 min | 4–5 h |
| — | **Lun 26 oct** | — | 30 min con la hoja mental y la clave, y **PARCIAL 3** (O_102) | — |

**Si te atrasas:** M1 y M2 ya los viste en clase. Haz el quiz primero y, si sacas ≥ 4/5, sáltalos. Recorta el lab de M5 antes que cualquier taller. **Nunca recortes M6, M7 ni el simulacro.**
**Si vas adelantado:** adelanta M6. Para hallar el radio solo necesitas el criterio del cociente de M4.

---

## 5. Tu progreso

| Módulo | Teoría | Lab | Taller | Quiz (nota) | Estado |
|---|---|---|---|---|---|
| M1 Sucesiones y límites | ☐ | ☐ | ☐ | — | ⏳ |
| M2 Series básicas | ☐ | ☐ | ☐ | — | 🔒 |
| M3 Comparación + serie p | ☐ | ☐ | ☐ | — | 🔒 |
| M4 Alternantes, cociente y raíz | ☐ | ☐ | ☐ | — | 🔒 |
| M5 ¿Qué criterio uso? | ☐ | ☐ | ☐ | — | 🔒 |
| M6 Series de potencias | ☐ | ☐ | ☐ | — | 🔒 |
| M7 Taylor | ☐ | ☐ | ☐ | — | 🔒 |
| M8 Simulacro | — | — | — | —/50 | 🔒 |

---

## Anexo A: clave verificada de los parciales anteriores

Los PDF están en [`material/`](material/). No venían soluciones oficiales: estas respuestas las saqué yo y las verifiqué con cálculo simbólico (sympy).

| Parcial | Problema | Respuesta | Módulo |
|---|---|---|---|
| 2023-19 | P1a Σ √(n + 1)/(n + 2) | **Diverge.** Comparación en el límite con 1/√n: L = 1, serie p con p = 1/2 | M3 |
| 2023-19 | P1b Σ 2ⁿ⁻¹/(n + 1)! | **Converge.** Cociente: L = lim 2/(n + 2) = 0 | M4 |
| 2023-19 | P1c Σ (−1)ⁿ 2n/(n² + 1), desde n = 2 | **Converge condicionalmente.** Leibniz: bₙ decrece y → 0; Σ \|aₙ\| diverge (compara con 1/n, L = 2) | M4 |
| 2023-19 | P1d Σ (2n²/(n² + 3))ⁿ | **Diverge.** Raíz: L = 2 > 1 | M4 |
| 2023-19 | P1e Σ sen² n/n³ | **Converge.** 0 ≤ sen² n/n³ ≤ 1/n³, serie p con p = 3 | M3 |
| 2023-19 | P2 radio e intervalo de Σ (−1)ⁿ(x + 2)ⁿ/(3ⁿ(n² + 1)) | **R = 3, intervalo [−5, 1].** En los dos extremos queda una serie que se compara con 1/n² | M6 |
| 2023-19 | P3 Taylor de 2/(x + 3) centrada en −2 | Σ 2(−1)ⁿ(x + 2)ⁿ, intervalo (−3, −1) | M7 |
| 2025-10 | P1a Σ √(n³ + 5)/(n³ − 3) | **Converge.** Comparación en el límite con 1/n^(3/2): L = 1. El primer término es negativo y no cambia nada | M3 |
| 2025-10 | P1b Σ ((n + 2)/n)^(n²) | **Diverge.** Raíz: L = lim (1 + 2/n)ⁿ = e² > 1 | M4 |
| 2025-10 | P1c Σ (1 + sen² n)/n | **Diverge.** (1 + sen² n)/n ≥ 1/n y la armónica diverge | M3 |
| 2025-10 | P2 Σ 2/(k² + k), desde k = 1 | **Converge a 2.** 2/k − 2/(k + 1), así que S_N = 2 − 2/(N + 1) | M2 |
| 2025-10 | P3 (el mismo de 2023-19 P2) | **R = 3, intervalo [−5, 1]** | M6 |
| 2025-10 | P4a Taylor de 3/(x − 4) centrada en 5 | Σ 3(−1)ⁿ(x − 5)ⁿ, intervalo (4, 6). En los extremos el término no tiende a 0 | M7 |
| 2025-10 | P4b Taylor de 3 ln(x − 4) centrada en 5 | Σ_{n≥1} 3(−1)ⁿ⁻¹(x − 5)ⁿ/n, intervalo **(4, 6]**: en x = 6 es la armónica alternante; en x = 4, −3 por la armónica | M7 |

## Anexo B: las hojas del profesor, módulo por módulo

| Hoja | Ejercicios | Módulo |
|---|---|---|
| 11.1 Sucesiones | (1) primeros términos, (2) fórmula general, (3) límites, (4) monotonía | M1 |
| 11.2 Series | (1) notación, (2) geométricas, (3) telescópicas, (5) divergencia | M2 |
| 11.2 Series | (4) valores de x (geométricas con x) | M6 |
| 11.4 Comparación | (a)–(o) | M3 |
| 11.5 Alternantes | (1) a–l, (2) valores de p | M4 |
| 11.6 «Test del radio y de la raíz» | (1) a–j: absoluta, condicional o diverge | M4 (y M5 mezcladas) |
| 10.1 Curvas paramétricas | todo | No entra: es para el final |

## Anexo C: notas sobre el material

- **«Test del radio»** es como el profesor llama al criterio del cociente (en inglés, *ratio test*). No tiene nada que ver con el radio de convergencia de M6.
- **El profesor escribe sin** para el seno (notación en inglés). Aquí uso sen. Es lo mismo.
- **Hoja 11.2 (5c)** dice (x² + x − 1)/(2x² + 1), pero es con n: (n² + n − 1)/(2n² + 1). Diverge porque el término tiende a 1/2.
- **Hoja 11.6 (1f)** no tiene exponente. Tal como está, diverge porque el término tiende a 1/2. Si se le perdió el exponente n, converge por la raíz (L = 1/2). Se practican las dos versiones.
- **No hay hojas de 11.3, 11.8, 11.9 ni 11.10.** Para esos temas armo variantes al estilo del profesor. Si sobra tiempo, el programa sugiere del Stewart: 11.3: 2, 5–7, 12, 20, 25, 29; 11.8: 13–18, 20, 21, 26, 27; 11.9: 3–11, 15–18, 23–26; 11.10: 2, 6, 8, 14, 20, 31–34, 43, 44, 51, 65, 68.
- El programa pone 11.9 el «19 Ma»; es el martes 20.
