# Demo Java Practice Project ✅

A simple Maven-based Java project created for practicing GitHub workflows: commits, branches, pull requests, and CI.

## What it contains

- Minimal Maven `pom.xml` using Java 17
- `App` example class in `com.example.demo`
- JUnit 5 test `AppTest`
- GitHub Actions workflow for build & test

## Quick start (Windows)

1. Ensure Java 17+ and Maven are installed.
2. Build: `mvn -q -DskipTests=false package`
3. Run tests: `mvn test`
4. Run the app: `mvn exec:java -Dexec.mainClass="com.example.demo.App"` (requires `exec` plugin if desired) or run the compiled jar in `target`.

## GitHub practice tips 💡

- Create a branch: `git checkout -b feature/your-name`
- Commit often with clear messages
- Open a Pull Request (PR) and use the CI status to verify tests
- Use PR review to get feedback and practice collaboration

---

This project is intentionally small to focus on GitHub and basic Java practices.