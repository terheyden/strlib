# Str Lib - Fast Java String Formatting

## Quick Example

`strlib` gives you fast and easy String formatting:

```java
Str.format("User ID: {}", userId);
```

We use the same formatting rules as `Log4J` / `SLF4J`,
so no more needing to mix format styles:

```java
// No more mixing format styles!
private static final String EXCEPTION_STR_FMT = "Exception: %s";
private static final String EXCEPTION_LOG_FMT = "Exception: {}";
```

## Really Fast

Best of all, `strlib` is benchmarked at [_over 6x faster_](https://docs.google.com/spreadsheets/d/1JRzrd1Zg731FyFR1mDesbG92YXBgDZcpPaMTyMu6v7s/edit?usp=sharing) than using `String.format()`.

<img src="docs/strlib-graph.png" width="50%">

### Other Nice Things

- No transitive dependencies
- Works with Java 8+
- Apache 2.0 License, yay!

## How To Use

### Maven

```xml
<!-- https://mvnrepository.com/artifact/com.terheyden/strlib -->
<dependency>
    <groupId>com.terheyden</groupId>
    <artifactId>strlib</artifactId>
    <version>0.0.1</version>
</dependency>
```

### Gradle

```groovy
// https://mvnrepository.com/artifact/com.terheyden/strlib
implementation group: 'com.terheyden', name: 'strlib', version: '0.0.1'
```
