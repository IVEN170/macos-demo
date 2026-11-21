# macos-demo

最小 Gradle（Java 17）專案，用來實證 `macos.yml` 的 **jvm profile** 在真 macOS runner 上能建置並產出 jar。

- 沒有 `gradlew`，靠工作流程的 `gradle/actions/setup-gradle` 安裝 Gradle 8.10 → 驗證「無 wrapper 也能跑」的 fallback
- `Build` 步驟跑 `gradle build`，同時執行 JUnit 測試
- 產物：`build/libs/macos-demo-0.1.0.jar` 由 `jvm-artifacts-*` 上載

手動觸發：Actions → macOS CI → Run workflow → profile = `jvm`。
