# Template kotlin project

## Features:

1. Detekt custom [ruleset](https://github.com/vorobeij/detekt-rules)
2. `buildSrc` with common libraries
3. `kts` build files
4. pre-configured `.gitignore` file

## Plugins

1. [Refresh versions](https://github.com/jmfayard/refreshVersions)
1. [Dependencies health check](https://github.com/autonomousapps/dependency-analysis-android-gradle-plugin)

```shell
./gradlew buildHealth
```

For each module set fail on excessive dependencies:

```kotlin
// https://github.com/autonomousapps/dependency-analysis-android-gradle-plugin/wiki/Customizing-plugin-behavior
dependencyAnalysis {
    issues {
        ignoreKtx(true)
        onAny {
            severity("fail")
            exclude(
                "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
            )
        }
    }
}
```