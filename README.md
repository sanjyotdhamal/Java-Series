Java Project

This workspace has a Maven project configured to use the existing `src/` directory as the source root.

Build:

```bash
mvn -q -DskipTests=true package
```

Run (replace main class if needed):

```bash
mvn -q exec:java -Dexec.mainClass="com.javabasic.FirstCode"
```

Notes:
- The `pom.xml` sets `<sourceDirectory>` to `src/` so existing source layout is used.
- If your main class is different, change the `-Dexec.mainClass` value above or update `pom.xml`.
