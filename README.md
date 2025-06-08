MVVM Retrofit API App (with Hilt DI)

An Android sample app that fetches and displays data from JSONPlaceholder Posts API using:

MVVM architecture
Retrofit for network requests
Hilt for dependency injection
Kotlin Coroutines
LiveData for UI updates
RecyclerView for displaying data
Proper UI state handling (loading, success, error)
🚀 Features

Fetches posts from a REST API using Retrofit
Displays data in a RecyclerView
MVVM architecture with clean separation of concerns
Uses Kotlin Coroutines for background work
UI handles loading, success, and error states
Hilt for modern and scalable Dependency Injection
📁 Project Structure

com.example.appname/
├── di/                 # Hilt modules
├── model/              # Data models (Post.kt)
├── network/            # Retrofit API interface
├── repository/         # Repository to abstract data sources
├── viewmodel/          # ViewModel layer
├── ui/main/            # UI layer (Activity & Adapter)
├── MyApplication.kt    # Hilt-enabled application class
🛠️ Tech Stack

Tool	Description
Kotlin	Programming language
Retrofit	REST API client
Hilt	Dependency Injection
ViewModel	Lifecycle-aware business logic holder
LiveData	Observable data holder
RecyclerView	List UI component
Coroutines	For asynchronous programming
📦 Dependencies

// Retrofit
implementation 'com.squareup.retrofit2:retrofit:2.9.0'
implementation 'com.squareup.retrofit2:converter-gson:2.9.0'

// Hilt
implementation 'com.google.dagger:hilt-android:2.47'
kapt 'com.google.dagger:hilt-android-compiler:2.47'

// Lifecycle
implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1'
implementation 'androidx.lifecycle:lifecycle-livedata-ktx:2.6.1'

// Kotlin Coroutines
implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1'

// RecyclerView
implementation 'androidx.recyclerview:recyclerview:1.3.1'
🔧 Setup Instructions

Clone the repo
git clone https://github.com/your-username/mvvm-retrofit-hilt-sample.git
cd mvvm-retrofit-hilt-sample
Open in Android Studio
Build the project
Run on emulator or device
📌 API Used

JSONPlaceholder Posts API

✍️ Author

Rabindra
Kotlin & Jetpack Compose Specialist

📃 License

This project is licensed under the MIT License - see the LICENSE file for details.

Feel free to copy the entire text above and paste it directly into your README.md file!