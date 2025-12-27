# 📱 Reasons to Say No - Android App

An Android application that gives you creative, humorous, and sometimes hilarious reasons to say "no" to anything. Perfect for when you need a graceful (or witty) way to decline requests.

This app is the Android frontend for the [No-as-a-Service API](https://github.com/hotheadhacker/no-as-a-service).

---

## ✨ Features

- 🎲 **Random Rejection Reasons**: Get fresh, creative reasons to say no with a single tap
- 🎨 **Clean UI**: Simple and elegant Material Design interface
- ⚡ **Fast Loading**: API warm-up on app start for instant first-click response
- 📱 **Native Android**: Built with Kotlin for optimal performance
- 🌐 **API Integration**: Powered by the No-as-a-Service API

---

## 🚀 Getting Started

### Prerequisites

- Android Studio (Arctic Fox or newer recommended)
- Android SDK (API 29 or higher)
- JDK 11 or higher
- Git

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/OussamaElm0/ReasonsToSayNo.git
   cd ReasonsToSayNo
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an Existing Project"
   - Navigate to the cloned directory and select it

3. **Sync Gradle**
   - Android Studio should automatically sync Gradle dependencies
   - If not, click "Sync Now" in the notification banner

4. **Build and Run**
   - Connect an Android device or start an emulator
   - Click the "Run" button (▶️) or press `Shift + F10`
   - The app will install and launch on your device/emulator

---

## 📱 Usage

1. Launch the app
2. Tap the **"Generate Reason"** button
3. Get a random rejection reason displayed on screen
4. Tap again for a new reason whenever you need one!

---

## 🏗️ Project Structure

```
ReasonsToSayNo/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/naas/
│   │   │   │   ├── MainActivity.kt           # Main activity with UI logic
│   │   │   │   ├── api/
│   │   │   │   │   ├── ApiService.kt         # Retrofit API interface
│   │   │   │   │   └── RetrofitInstance.kt   # Retrofit singleton setup
│   │   │   │   ├── data/
│   │   │   │   │   └── ReasonResponse.kt     # Data model for API response
│   │   │   │   └── repository/
│   │   │   │       └── ApiRepository.kt      # Repository layer
│   │   │   └── res/
│   │   │       ├── layout/
│   │   │       │   └── activity_main.xml     # Main UI layout
│   │   │       ├── values/
│   │   │       │   ├── strings.xml           # String resources
│   │   │       │   ├── colors.xml            # Color definitions
│   │   │       │   └── themes.xml            # App themes
│   │   │       └── font/
│   │   │           └── story_script_regular.ttf # Custom font
│   │   └── test/
│   └── build.gradle.kts                      # App-level Gradle config
├── build.gradle.kts                          # Project-level Gradle config
└── settings.gradle.kts                       # Gradle settings
```

---

## 🌐 API Information

This app uses the **No-as-a-Service API**:

- **Base URL**: `https://naas.isalman.dev/`
- **Endpoint**: `GET /no`
- **Rate Limit**: 120 requests per minute per IP
- **Backend Repository**: [hotheadhacker/no-as-a-service](https://github.com/hotheadhacker/no-as-a-service)

**Example API Response:**
```json
{
  "reason": "This feels like something Future Me would yell at Present Me for agreeing to."
}
```

---

## 🛠️ Technologies & Dependencies

- **Language**: Kotlin
- **Min SDK**: API 29 (Android 10)
- **Target SDK**: API 36
- **Architecture Components**:
  - Kotlin Coroutines for async operations
  - Material Design Components

**Key Dependencies:**
- `Retrofit 2.9.0` - HTTP client for API calls
- `Gson Converter 2.9.0` - JSON serialization/deserialization
- `OkHttp Logging Interceptor 4.9.3` - HTTP request/response logging
- `Kotlin Coroutines Android 1.7.3` - Asynchronous programming

---

## 🔨 Building the Project

### Using Android Studio
1. Open the project in Android Studio
2. Wait for Gradle sync to complete
3. Build > Make Project (or `Ctrl+F9`)

### Using Command Line
```bash
# Debug build
./gradlew assembleDebug

# Release build
./gradlew assembleRelease

# Install on connected device
./gradlew installDebug
```

---

## 🧪 Running Tests

```bash
# Run unit tests
./gradlew test

# Run instrumented tests (requires connected device/emulator)
./gradlew connectedAndroidTest
```

---

## 📄 License

This project is open source. Feel free to use it however you'd like!

---

## 🙏 Acknowledgments

- **Backend API**: This app is powered by [No-as-a-Service](https://github.com/hotheadhacker/no-as-a-service) created by [hotheadhacker](https://github.com/hotheadhacker)
- Inspired by the need for creative ways to say "no"
- Built with ❤️ and a lot of "no's"

---

## 🤝 Contributing

Contributions are welcome! Feel free to:
- Report bugs
- Suggest new features
- Submit pull requests
- Improve documentation

---

## 📞 Contact & Support

For issues, questions, or suggestions:
- Open an issue on GitHub
- Check the [backend repository](https://github.com/hotheadhacker/no-as-a-service) for API-related questions

---

> Remember: Sometimes the best answer is "no" — and now you have 1000+ creative ways to say it! 🚫
