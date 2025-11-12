## Purpose
Short, actionable guidance for AI-assisted edits in this repository (student Java exercises + helper libs).

## Big picture
- This repo contains a personal/workshop collection of Java exercises (folder `bellemarema/`) and shared utilities in `commun/`.
- `commun/` contains small runtime helpers used by many exercises: `Console.java` (a Swing-based text console) and `Outils.java` (printing helpers, `MyRandom` wrapper). Treat these as stable utilities.
- `lib/` holds test/style tooling artifacts: `junit-platform-console-standalone-1.10.0.jar` and `check420mo.xml` (Checkstyle rules).
- There is no formal build system (no Maven/Gradle); compilation is done with `javac` and tests with the junit standalone jar.

## Files/dirs to inspect first
- `commun/Console.java` — custom Swing console. Note: looks for font `commun/IBM_VGA_8x16.ttf` and may call `System.exit(1)` on GUI init failure.
- `commun/Outils.java` — utility printing methods and `MyRandom` (seed can only be set once).
- `lib/check420mo.xml` — project checkstyle rules (enforces naming, single-return, forbids break/continue, etc.).
- `bellemarema/` — student assignment directories (`at01`, `jour1`, `jour2`, `TravauxPratique`, ...). Many files use default package; be careful moving them.

## Conventions & gotchas (from source)
- Many exercise files live in the default package (no `package` line). Compiling/moving these changes how they are referenced — avoid changing packages unless requested.
- Checkstyle (`lib/check420mo.xml`) is stricter than default Java style: ReturnCount max 1, package name regex, forbidden `break`/`continue`, etc. Keep edits aligned with that file when refactoring.
- `Outils.MyRandom.setSeed(long)` refuses subsequent seed changes (prints to stderr). Tests or demos may rely on this behaviour.
- `Console` toggles GUI via a constant; it uses Swing and image repaint synchronization. Avoid changing threading semantics without tests.

## Build / run / test (quick examples, Windows PowerShell)
1) Compile all Java sources into `out/`:
```powershell
$files = Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName }
javac -d out $files
```
2) Run a class in the default package (example: `Question712`):
```powershell
java -cp out Question712
```
3) Run JUnit tests (after compilation):
```powershell
java -jar lib\junit-platform-console-standalone-1.10.0.jar --class-path out --scan-class-path
```
Notes: many source files are in default package so the `out` tree will contain classes at the root of the output directory.

## Editing guidance for AI agents
- Prefer minimal, local edits. Do not reorganize packages or move files between folders unless the user asks — student code is often intentionally in the default package.
- Keep `commun/` stable. If changing `Console` or `Outils`, run dependent examples to validate behaviour (they are widely referenced).
- Follow `lib/check420mo.xml` rules when formatting or refactoring. Pay attention to:
  - Package names should be lowercase and dot-separated.
  - Methods should generally have at most one return point (ReturnCount <= 1).
  - Avoid `break`/`continue` in loops where possible.

## When tests or build are unclear
- If a user asks to run CI or lint, explain there is no Maven/Gradle; provide PowerShell commands above. Offer to scaffold a simple `build.ps1` or add a `pom.xml`/`build.gradle` if requested.

## Quick pointers for common tasks
- To inspect style rules: open `lib/check420mo.xml`.
- To find utility behaviour: inspect `commun/Outils.java` and `commun/Console.java`.
- To run all tests: compile to `out/` then invoke the junit-platform console jar as above.

---
If any part of this file is unclear or you'd like me to include project-specific examples (e.g., compile & run a failing test), tell me which file or task and I'll update this quickly.
