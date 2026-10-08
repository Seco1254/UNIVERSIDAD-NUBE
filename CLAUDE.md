# UNIVERSIDAD-NUBE

Repositorio de estudio universitario (Universidad de los Andes). Cada materia tiene su carpeta (por ejemplo, `FISICA_1/`).

## Metodología de estudio (úsala siempre)

Cada tema se estudia en **módulos** de 4 secciones, en este orden:

1. **Teoría**: explicación conceptual, fórmulas y una receta paso a paso para el tipo de problema que sale en el examen.
2. **Lab / visual**: simulación interactiva, diagrama animado o experimento casero. Lo más visual posible.
3. **Taller**: problemas tipo parcial que el estudiante resuelve y Claude corrige paso a paso. Primero los de parciales anteriores (en `material/`), luego variantes nuevas.
4. **Quiz de paso**: 5 preguntas (3 cortas o conceptuales y 2 tipo parcial). Se pasa al siguiente módulo con **≥ 4/5**. Si no pasa: repaso del error y Quiz B con preguntas nuevas. El estudiante puede hacer el quiz primero para saltarse un módulo que ya domina.

## Preferencias del estudiante

- **Todo se entrega como Artifact**: planes, módulos, talleres y quizzes. El HTML fuente se guarda en `<MATERIA>/<EVALUACION>/artifacts/` y los links publicados quedan anotados en la tabla de abajo.
- **Carga semanal**: martes y jueves, **liviana** (1–1,5 h; son sus días más pesados); lunes y viernes, **suave** (~2 h); miércoles, **media** (2,5–3 h); sábado y domingo, **pesada** (4–5 h; ahí van los bloques difíciles).
- Los temas que ya vio en clase y se le hacen más fáciles cuentan como bloques livianos (formato refuerzo: menos teoría, más taller).
- **Toda pregunta de quiz o problema de taller que describa una situación física lleva su figura** (SVG), como en los parciales. Nada de describir montajes solo con texto.
- En el chat, cuando pregunta algo puntual mientras resuelve un taller, responde **solo** lo que pregunta, sin pistas extra ni resolverle el resto.

## Artifacts publicados

| Materia | Qué | Link | Fuente |
|---|---|---|---|
| Física 1 | Plan Parcial 2 (tracker de progreso en `progreso/`) | https://claude.ai/artifact/XwfNMJ25u3aDBiU8LXC1uv | `FISICA_1/PARCIAL_2/artifacts/plan.html` |
| Física 1 | M1 · Newton, DCL y planos inclinados (intentos en `intentos/`) | https://claude.ai/artifact/RdHQeTYL9rNrrrPoWXiTMj | `FISICA_1/PARCIAL_2/artifacts/M1.html` |
| Física 1 | M2 · Poleas y equilibrio | https://claude.ai/artifact/EqMXyQkmpP6WHALnRDwgxb | `FISICA_1/PARCIAL_2/artifacts/M2.html` |
| Física 1 | M3 · Fricción y rangos | https://claude.ai/artifact/5CnY6wiw24huhhHCzGno4n | `FISICA_1/PARCIAL_2/artifacts/M3.html` |

## Convenciones

- Todo en español.
- El plan de cada evaluación vive en `<MATERIA>/<EVALUACION>/PLAN_DE_ESTUDIO.md`. El material fuente (parciales, soluciones, programa) está en `material/` junto al plan.
- Cada módulo es su propio Artifact. El quiz de cada módulo guarda los intentos en la base de datos del artifact (colección `intentos`). El plan-artifact lleva el progreso en su colección `progreso` (docs `M1`…`M9`: `teoria`, `lab`, `taller`, `quiz`, `url`). Cuando el estudiante pasa un quiz, actualiza ese doc con `ArtifactData`.
- Las soluciones oficiales pueden tener errores: verifica antes de usarlas como modelo. Los errores conocidos están anotados en cada plan.
