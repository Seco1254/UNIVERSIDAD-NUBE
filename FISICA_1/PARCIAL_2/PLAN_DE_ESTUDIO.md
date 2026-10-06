# Plan de estudio — Parcial 2, Física 1 (FISI 1518)

> **Versión interactiva (la que se usa):** [Plan Parcial 2 Física](https://claude.ai/artifact/XwfNMJ25u3aDBiU8LXC1uv). Este archivo es la copia de respaldo en texto.

**Fecha del parcial:** jueves 15 de octubre de 2026 (clase 19) · **Peso:** 15 % · **Temas:** capítulos 4 a 7 (Young & Freedman, 13.ª ed.)
**Profesor:** Carlos Ávila · **Días de estudio:** 9 (martes 6 → miércoles 14 de octubre)

> Las clases del 6, 8 y 13 de octubre (momento lineal, choques, rotación) son de los capítulos 8 y 9: **no entran en este parcial**. Ve a clase, pero no las estudies ahora.

---

## 1. Qué dicen los 4 parciales anteriores

Revisé los parciales 2 de 2024-2, 2025-1, 2025-2 y 2026-1 con sus soluciones. Los cuatro son del mismo profesor y tienen el mismo formato:

- **Parte A:** de 3 a 4 preguntas de selección múltiple de **10 pts**. Hay que justificarlas: una respuesta sin desarrollo no cuenta.
- **Parte B:** 3 problemas abiertos de **20 pts**, divididos en pasos. Casi siempre son A) dibujar los diagramas de cuerpo libre (≈6 pts), B) escribir las ecuaciones de Newton (≈6–7 pts) y C) resolver (≈7–8 pts).
- Las respuestas se piden **en símbolos** (M, g, R, µ, θ), casi nunca con números. Lo que se evalúa es el álgebra limpia.

### Frecuencia por tipo de problema

| Tipo de problema | 2024-2 | 2025-1 | 2025-2 | 2026-1 | Pts históricos | Prioridad |
|---|---|---|---|---|---|---|
| **Movimiento circular + energía** (semiesfera, péndulo, loop, se despega) | SM3, A1, A2 | SM3 | A2 | A3 | **100 (26 %)** | 🔴 Sale seguro |
| **Plano inclinado / equilibrio con fricción estática** (máx/mín, rangos) | SM1 | A2 | — | A1, A2 | **70 (18 %)** | 🔴 Sale seguro |
| **Trabajo–energía con fricción** (rampa con tramo rugoso, plano con fricción) | SM4 | SM4, A3 | SM3 | SM3 | **60 (16 %)** | 🔴 4 de 4 parciales |
| **Poleas en equilibrio** (persona–tabla, contar cuerdas) | A3 | A1 | SM1 | SM1 | **60 (16 %)** | 🔴 4 de 4 parciales |
| **Bloques conectados con aceleración** (mesa + colgante, Atwood, 3 bloques) | SM2 | SM1 | SM2, A3 | (A2-C) | **50 (13 %)** | 🟠 Muy probable |
| **Circular horizontal con fricción** (disco giratorio, rotor/gravitrón) | — | SM2 | — | SM2 | 20 (5 %) | 🟡 Sale en los de 1.er semestre |
| **Bloque sobre bloque** (fricción entre bloques) | — | — | A1 | — | 20 (5 %) | 🟡 Posible |

*SM = selección múltiple, A = problema abierto.*

### Patrones del profesor

1. **Repite problemas y solo cambia los números.** La rampa con tramo rugoso salió 3 veces, la semiesfera 3, la persona–tabla 2 y la mesa + colgante 2. Si dominas los originales, ya tienes media nota.
2. **Mide los ángulos desde la VERTICAL** (2024-2 SM1, 2025-1 A3, 2026-1 A2 con β). Eso intercambia seno y coseno, y es la trampa más repetida.
3. **Combina dos capítulos en un problema**: circular (cap. 5) + energía (cap. 7). Es el tipo de problema que más pesa.
4. **El diagrama de cuerpo libre da puntos casi gratis**: vale alrededor de 6 de los 20 pts de cada abierto.
5. Hay temas del programa que **nunca han salido**: potencia (6.4), F = −dU/dx, diagramas de energía (7.4–7.5) y curva peraltada. Se ven rápido, pero con baja prioridad.
6. Solo el parcial de 2024-2 trajo hoja de fórmulas. **Asume que no te van a dar fórmulas.**

### ⚠️ Errores en las soluciones oficiales: no los memorices

| Problema | Qué dice la oficial | Lo correcto |
|---|---|---|
| 2024-2, Abierto 2 (cuenco por dentro, N = mg/3) | h = R/3 | **h = 8R/9**. Por dentro del cuenco, soltado desde el borde, N = 3mg·cos φ ⇒ cos φ = 1/9. |
| 2025-1, SM3 (semiesfera, N = mg/3) | A mitad del cálculo escribe cos θ = 2/3 | **cos θ = 7/9**. La opción E sí es la correcta. |
| 2025-1, Abierto 2 parte A | Escribe X ≤ 2√2m/3 | **X ≥ 2√2m/3**. La desigualdad está volteada, pero el rango final sí está bien. |
| 2025-1, Abierto 3 (v(H/4) = v(H/2)/3) | µ = cot β | **El enunciado es físicamente imposible.** Con µ constante, v² crece en proporción a la altura descendida, así que v(H/4)/v(H/2) = √(3/2) siempre. Que µ = cot β significa que el bloque ni se mueve. Sirve para practicar el planteamiento, no como modelo. |

---

## 2. Metodología: módulos de 4 secciones

| Sección | Qué hacemos |
|---|---|
| 📖 **1. Teoría** | Conceptos, fórmulas y una **receta paso a paso** para el tipo de problema del parcial. |
| 🔬 **2. Lab / visual** | Una simulación interactiva que te armo, un diagrama animado o un experimento casero para *ver* la física. |
| 🛠️ **3. Taller** | Problemas tipo parcial: primero los de parciales anteriores y luego variantes nuevas. Los resuelves tú y yo te corrijo paso a paso. |
| ✅ **4. Quiz de paso** | 5 preguntas: 3 cortas o conceptuales y 2 tipo parcial. **Pasas con ≥ 4/5.** Si no pasas, repasamos el error y haces un Quiz B con preguntas nuevas. |

**Atajo:** si sientes que ya dominas un módulo, puedes hacer el quiz primero. Si sacas ≥ 4/5, lo saltas.

---

## 3. Los módulos

El orden sigue las dependencias: cada módulo usa lo del anterior. El M8 es el más importante del parcial.

```
M1 Newton + DCL ─► M2 Poleas ─► M3 Fricción ─► M4 Sistemas con aceleración ─► M5 Circular
                                                                                   │
                     M9 SIMULACRO ◄─ M8 Circular + Energía ◄─ M7 Energía ◄─ M6 Trabajo
```

### M1 — Leyes de Newton, diagramas de cuerpo libre y planos inclinados
*Libro: 4.1–4.6, 5.1 · Refuerzo · ~1–1,5 h*

- **Teoría:** las 3 leyes. Los pares acción–reacción actúan sobre cuerpos distintos, así que nunca se cancelan dentro del mismo diagrama. Procedimiento de diagrama de cuerpo libre en 5 pasos. Ejes rotados en el plano inclinado. Descomponer el peso cuando el ángulo se mide desde la horizontal o desde la vertical. Por qué N ≠ mg en general.
- **Lab / visual:** un plano inclinado interactivo con un control para el ángulo. Muestra las componentes del peso en vivo y qué pasa con el seno y el coseno si el ángulo se mide desde la vertical. Incluye la regla de chequeo «si θ → 0, ¿la fórmula tiene sentido?».
- **Taller:** 2026-1 Abierto 1 (dos bloques en un plano inclinado con F horizontal y normal entre bloques), los diagramas de 2024-2 SM1 y 2 problemas nuevos.
- **Quiz:** identificar todas las fuerzas, descomponer con un ángulo medido desde la vertical y hallar la fuerza de contacto entre bloques.
- **Trampas:** la F horizontal sobre un plano inclinado **sí cambia la normal**; olvidar la reacción en el segundo bloque.

### M2 — Poleas y equilibrio
*Salió en 4 de 4 parciales · Refuerzo · ~1,5 h*

- **Teoría:** en una cuerda ideal la tensión es la misma en todo el tramo. La polea fija solo cambia la dirección. La polea móvil recibe 2T en el eje. Método de «encerrar y contar cuerdas»: trazas una frontera alrededor de un sistema y sumas las cuerdas que la cruzan. La persona que jala su propia cuerda: fuerza en la mano más normal entre persona y tabla. **Los tramos horizontales no sostienen peso** (2026-1 SM1). Extra: ligadura de aceleraciones en la polea móvil (a/2).
- **Lab / visual:** un diagrama interactivo donde marcas la frontera del sistema y cuentas las cuerdas que la cruzan.
- **Taller:** 2025-2 SM1 (X = 5M/3), 2026-1 SM1 (α = 1/5), 2025-1 A1 (F = Mg/2), 2024-2 A3 (F = Mg/8) y variantes nuevas, por ejemplo: ¿cuándo se despega la persona de la tabla?
- **Quiz:** sistemas de poleas que no has visto, resueltos por los dos métodos: diagrama por cuerpo y «encerrar y contar».
- **Trampas:** olvidar la normal entre persona y tabla; contar dos veces una cuerda; contar un tramo horizontal.

### M3 — Fricción y equilibrio con desigualdades
*Libro: 5.3 · Salió en 3 de 4 parciales con rangos de masa · Refuerzo · ~1,5 h*

- **Teoría:** la fricción estática es **una incógnita** que cumple f_s ≤ µ_s·N, y solo vale µ_s·N cuando el bloque está «a punto de deslizar». Su dirección es contraria a hacia dónde *tiende* a moverse el bloque. Hay que analizar dos casos, «a punto de subir» y «a punto de bajar», y de ahí sale un **rango**. La cinética es constante: f_k = µ_k·N. Ángulo crítico: tan θ = µ_s.
- **Lab / visual:** la gráfica de fricción contra fuerza aplicada: sube en la zona estática hasta µ_s·N y luego cae a µ_k·N. Un plano inclinado con control de ángulo que muestra en qué momento el bloque empieza a deslizar.
- **Taller:** 2024-2 SM1 (x_máx = M(cos θ + µ_s sen θ)), 2025-1 A2 (2√2m/3 ≤ X ≤ 2√2m), 2026-1 A2 partes A y B (X_máx con dos planos inclinados) y uno nuevo de un bloque presionado contra una pared.
- **Quiz:** hallar rangos de masa, decidir hacia dónde apunta la fricción y calcular un ángulo crítico.
- **Trampas:** poner f_s = µ_s·N cuando el bloque no está a punto de deslizar; voltear la desigualdad al despejar.

### M4 — Dinámica de sistemas conectados (con aceleración)
*Libro: 5.2–5.3 · 50 pts históricos · Refuerzo · ~1–1,5 h*

- **Teoría:** los bloques unidos por una cuerda tienen la misma |a|. Usa una convención de signos según el sentido del movimiento. **Truco del sistema:** a = (fuerzas que impulsan − fuerzas que frenan) / masa total, y después sacas T de un solo bloque. Primero decides hacia dónde se mueve el sistema y solo después pones la fricción. Bloque sobre bloque: el bloque de arriba solo se acelera por la fricción, así que a_máx = µ_s·g.
- **Lab / visual:** simulación de mesa + colgante y de Atwood con la curva de aceleración contra la masa colgante (a → g cuando X → ∞). Las 3 configuraciones de 2024-2 SM2, lado a lado.
- **Taller:** 2025-1 SM1 (a = 2g/3), 2025-2 SM2 (X = M/4), 2024-2 SM2 (la tensión máxima es la de la configuración I), 2025-2 A3 (µ_k = 1 − 4a/g), 2025-2 A1 (M_X = 3M) y 2026-1 A2-C (aceleración con dos planos inclinados).
- **Quiz:** hallar la aceleración y la tensión en sistemas nuevos y el valor límite en un bloque sobre bloque.
- **Trampas:** suponer que T = mg en un sistema que acelera; mezclar las convenciones de signo entre bloques.

### M5 — Dinámica del movimiento circular
*Libro: 5.4 (+ repaso de 3.4) · ~2 h*

- **Teoría:** a_c = v²/R = ω²R, dirigida **hacia el centro**. La «fuerza centrípeta» no es una fuerza nueva: es la resultante radial. **No se dibuja una «fuerza centrífuga»** en el diagrama. La solución oficial de 2025-1 SM2 la menciona, pero en un marco inercial esa fuerza no existe. Casos:
  - Disco giratorio: la fricción apunta al centro ⇒ ω_máx = √(µg/R).
  - Rotor / gravitrón: la normal apunta al centro y la fricción sostiene el peso ⇒ ω_mín = √(g/(µR)).
  - Parte alta de un loop por dentro: N + mg = mv²/R. Parte baja de un péndulo: T − mg = mv²/R.
  - Por fuera de una esfera: mg·cos θ − N = mv²/R.
  - Curva peraltada (del libro, nunca ha salido).
- **Lab / visual:** animación de los vectores v y a en el movimiento circular. Repaso del experimento demostrativo del gravitrón (clase del 8 de septiembre). Experimento casero: girar un balde con agua.
- **Taller:** 2025-1 SM2, 2026-1 SM2, los puntos alto y bajo de un loop con v dada y 1 problema de curva peraltada por si acaso.
- **Quiz:** escribir la ecuación radial correcta en 5 situaciones distintas.
- **Trampas:** el signo de N por dentro y por fuera de la superficie; confundir el ω mínimo con el máximo.

### M6 — Trabajo y teorema trabajo–energía
*Libro: 6.1–6.4 · ~1,5–2 h*

- **Teoría:** W = F·d·cos φ y W = ∫F·dr. El signo del trabajo. La normal no hace trabajo, el peso hace W = −mg·Δh y la fricción W = −µ_k·N·d. Teorema: W_total = ΔK. El trabajo es el área bajo la curva F(x), por ejemplo en un resorte. Potencia: P = F·v (prioridad baja).
- **Lab / visual:** gráfica F contra x donde el área sombreada es el trabajo. Una calculadora visual de trabajos en un plano inclinado.
- **Taller:** 2025-2 SM3 (altura máxima con fricción: H = v₀²/[2g(1 + µ_k·cot θ)]), problemas con fuerza variable y 1 de potencia.
- **Quiz:** el signo y el valor del trabajo de cada fuerza, y aplicar el teorema.
- **Trampas:** en un plano inclinado, d = H/sen θ (o H/cos β si el ángulo se mide desde la vertical).

### M7 — Energía potencial y conservación (con fricción)
*Libro: 7.1–7.5 · Salió en 4 de 4 parciales · ~3 h*

- **Teoría:** U_g = mgy, con la referencia que tú elijas (conviene el piso), y U_el = ½kx². Fuerzas conservativas y no conservativas. La ecuación del profesor: **E_i + W_fricción = E_f**. Al calcular la fricción, d es la **distancia total recorrida**, contando idas y vueltas. Prioridad baja: F = −dU/dx y diagramas de energía (puntos de retorno, equilibrio estable e inestable).
- **Lab / visual:** una pista tipo «Energy Skate Park» con barras de energía K, U y térmica en vivo.
- **Taller:**
  - La trilogía de la rampa con tramo rugoso: 2024-2 SM4 (se detiene a H/2 de A), 2025-1 SM4 (a H/5 de A) y 2026-1 SM3 (µ_k = 3/4). Receta: **número de pasadas n = H/(µ·D)**; la parte entera dice en qué extremo queda y la parte decimal, dónde se detiene.
  - 2025-1 A3: ejercicio de pensamiento crítico para descubrir por qué es imposible.
  - Resorte que lanza un bloque.
- **Quiz:** rampas con fricción nuevas, resortes y una pregunta conceptual de diagramas de energía.
- **Trampas:** usar solo un tramo para la fricción cuando el bloque va y vuelve; equivocarse en el extremo donde queda el bloque.

### M8 — Circular + energía: el problema más pesado
*Es el tipo que más pesa: 26 % de los puntos históricos · ~4–5 h*

- **Teoría.** Receta de 3 pasos:
  1. **Diagrama en el punto crítico** y ecuación radial (para N o T).
  2. **Energía** entre el punto de partida y el punto crítico, para hallar v².
  3. **Reemplazar** el v² de la energía en la ecuación radial.
- **Condiciones especiales:** «pierde contacto» ⇔ N = 0. También aparecen N = k·mg o T = k·mg.
- **Geometría:** la altura en función del ángulo. Según la figura puede ser R·cos θ, R(1 − cos θ) o R + R·sen θ (con columnas).
- **Resultados para reconocer en el examen:**
  - Semiesfera por fuera, soltando el bloque arriba: se despega con cos θ = 2/3, después de bajar R/3.
  - Cuenco por dentro, soltando el bloque en el borde: N = 3mg·cos φ.
  - Péndulo soltado desde θ₀: en el punto más bajo, T = mg(3 − 2cos θ₀).
  - Loop: para que en la parte alta N = n·mg se necesita v² = (n + 1)gR.
- **Lab / visual:** animación de un bloque que se desliza sobre una semiesfera mientras N(θ) se grafica en vivo, para ver exactamente dónde cruza 0.
- **Taller:** 2024-2 SM3 (R/3), 2025-1 SM3 (cos θ = 7/9), 2024-2 A1 (θ = 60°), 2024-2 A2 (8R/9, con la corrección), 2025-2 A2 (x = √(7mgR/k)), 2026-1 A3 (sen θ = 2/3, H = 5R/3) y 2 nuevos que combinan rampa rugosa + loop (M7 + M8).
- **Quiz:** 2 de selección múltiple y 3 abiertos cortos de esta familia.
- **Trampas:** tomar mal la altura de referencia (las columnas de 2026-1); el signo de N por dentro y por fuera; usar cos θ cuando el ángulo se mide desde la horizontal (en 2026-1 A3 la altura es R + R·sen θ).

### M9 — Simulacro final, estilo Ávila
*~2 h (80 min de examen + corrección)*

- Un parcial **nuevo** escrito al estilo del profesor: 3 de selección múltiple + 3 abiertos con pasos A, B y C, uno por cada familia 🔴.
- **Cronometrado: 80 minutos**, lo mismo que dura la clase. Sin apuntes.
- Lo califico con una rúbrica tipo profesor: diagrama, ecuaciones y resultado por separado.
- Construyes tu **hoja de fórmulas mental**: lo que tienes que saber de memoria.
- **Meta: ≥ 80/100.** Si sacas menos, el martes 13 y el miércoles 14 repasamos solo las familias en las que perdiste puntos.

---

## 4. Cronograma

La carga sigue tu semana: **martes y jueves, liviana** (1–1,5 h); **lunes y viernes, suave** (~2 h); **miércoles, media** (2,5–3 h); **sábado y domingo, pesada** (4–5 h). M1 a M4 ya los viste en clase y estás entre mal y medio, así que son **módulos de refuerzo**: más cortos y con más taller que teoría. Por eso van en los días livianos.

| Día | Fecha | Carga | Módulo | Tiempo |
|---|---|---|---|---|
| 1 | Mar 6 oct | Liviana | **M1** Newton + DCL + planos inclinados (refuerzo) | 1–1,5 h |
| 2 | Mié 7 oct | Media | **M2** Poleas + **M3** Fricción (refuerzo) | 2,5–3 h |
| 3 | Jue 8 oct | Liviana | **M4** Sistemas con aceleración (refuerzo) | 1–1,5 h |
| 4 | Vie 9 oct | Suave | **M5** Movimiento circular | 2 h |
| 5 | Sáb 10 oct | Pesada | **M6** Trabajo + **M7** Energía con fricción | 4–5 h |
| 6 | Dom 11 oct | Pesada | **M8** Circular + energía (el que más pesa) | 4–5 h |
| 7 | Lun 12 oct (festivo) | Suave | **M9** Simulacro cronometrado (80 min) + corrección | 2 h |
| 8 | Mar 13 oct | Liviana | Repaso de los errores del simulacro + hoja de fórmulas | 1–1,5 h |
| 9 | Mié 14 oct | Media | Quiz relámpago de las 4 familias 🔴 + refuerzo de lo que falló + **descanso temprano** | 2–2,5 h |
| — | **Jue 15 oct** | — | **PARCIAL 2** | — |

**Si te atrasas:** fusiona M6 con M7. **Nunca recortes M8 ni el simulacro.**
**Si vas adelantado:** en M1–M4 haz el quiz primero; si sacas ≥ 4/5, saltas el módulo y le das ese tiempo a M8.

---

## 5. Tu progreso

| Módulo | Teoría | Lab | Taller | Quiz (nota) | Estado |
|---|---|---|---|---|---|
| M1 Newton + DCL | ☐ | ☐ | ☐ | — | ⏳ |
| M2 Poleas | ☐ | ☐ | ☐ | — | 🔒 |
| M3 Fricción | ☐ | ☐ | ☐ | — | 🔒 |
| M4 Sistemas con aceleración | ☐ | ☐ | ☐ | — | 🔒 |
| M5 Circular | ☐ | ☐ | ☐ | — | 🔒 |
| M6 Trabajo | ☐ | ☐ | ☐ | — | 🔒 |
| M7 Energía | ☐ | ☐ | ☐ | — | 🔒 |
| M8 Circular + energía | ☐ | ☐ | ☐ | — | 🔒 |
| M9 Simulacro | — | — | — | —/100 | 🔒 |

---

## Anexo: clave verificada de los parciales anteriores

Los PDF están en [`material/`](material/). Revisé cada respuesta; las que no coinciden con la solución oficial están marcadas con ⚠️.

| Parcial | Problema | Respuesta | Módulo |
|---|---|---|---|
| 2024-2 | SM1 bloque en plano inclinado + colgante (máx) | **E**: x = M(cos θ + µ_s sen θ) | M3 |
| 2024-2 | SM2 tensión en 3 configuraciones | **E**: es máxima en la I (4mg/3) | M4 |
| 2024-2 | SM3 semiesfera, se despega | **B**: baja R/3 | M8 |
| 2024-2 | SM4 rampa con tramo rugoso | **C**: H/2 de A | M7 |
| 2024-2 | A1 péndulo, T = 2mg abajo | θ = 60° | M8 |
| 2024-2 | A2 cuenco, N = mg/3 | ⚠️ **h = 8R/9** (la oficial dice R/3) | M8 |
| 2024-2 | A3 persona + tabla con 6 poleas | F = Mg/8 en cada brazo | M2 |
| 2025-1 | SM1 mesa + colgante 2M | **D**: a = 2g/3 | M4 |
| 2025-1 | SM2 disco giratorio | **B**: ω = √(µg/R) | M5 |
| 2025-1 | SM3 semiesfera, N = mg/3 | **E**: θ = cos⁻¹(7/9) ⚠️ hay un error en el paso intermedio de la oficial | M8 |
| 2025-1 | SM4 rampa con tramo rugoso | **C**: H/5 de A | M7 |
| 2025-1 | A1 persona + tabla | F = Mg/2 | M2 |
| 2025-1 | A2 plano a 45° + colgante (rango) | 2√2m/3 ≤ X ≤ 2√2m | M3 |
| 2025-1 | A3 plano con fricción, v(H/4) = v(H/2)/3 | ⚠️ enunciado inconsistente | M7 |
| 2025-2 | SM1 poleas con 2M, M y X | **B**: X = 5M/3 | M2 |
| 2025-2 | SM2 mesa + colgante, a = g/5 | **E**: X = M/4 | M4 |
| 2025-2 | SM3 bloque que sube un plano con fricción | **C**: H = v₀²/[2g(1 + µ_k cot θ)] | M6 |
| 2025-2 | A1 bloque M sobre 2M + colgante | M_X = 3M | M4 |
| 2025-2 | A2 resorte + loop, N = 2mg arriba | x = √(7mgR/k) | M8 |
| 2025-2 | A3 tres bloques, a conocida | µ_k = 1 − 4a/g | M4 |
| 2026-1 | SM1 tabla + bloque αM con poleas | **C**: α = 1/5 | M2 |
| 2026-1 | SM2 cilindro giratorio (rotor) | **B**: ω_mín = √(g/(µR)) | M5 |
| 2026-1 | SM3 riel con tramo rugoso, sube H/4 | **E**: µ_k = 3/4 | M7 |
| 2026-1 | A1 dos bloques en plano inclinado + F horizontal | F = 3mg tan θ; N₂ₘ→ₘ = 2mg sen θ | M1 |
| 2026-1 | A2 dos planos inclinados con fricción | X_máx = M(sen α + µ_s cos α)/(cos β − µ_s sen β); a = g[X cos β − M sen α − µ_k(M cos α + X sen β)]/(X + M) | M3 + M4 |
| 2026-1 | A3 estructura semicircular sobre columnas | v² = gR sen θ; sen θ = 2/3; H = 5R/3 | M8 |
