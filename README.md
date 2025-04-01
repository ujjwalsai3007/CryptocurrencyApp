# Cryptocurrency App

A modern Android application that displays cryptocurrency information using the CoinPaprika API. This app follows clean architecture principles and is built with the latest Android development tools and libraries.

<p align="center">
  <img src="https://github.com/user-attachments/assets/bf80f80a-340f-4372-bed3-e03fcd011da2" width="100" />
  <img src="https://github.com/user-attachments/assets/4bd6cdfb-dbe4-4fbb-a0ed-afbfc0c67d41" width="100" />
  <img src="https://github.com/user-attachments/assets/02d05ba3-6e98-4ce9-8c6f-7ec09470e1aa" width="100" />
  <img src="https://github.com/user-attachments/assets/40dd5a9f-5e42-4f2d-aeac-2e03f9e75b28" width="100" />
</p>




## Features

- **Modern UI**: Beautiful, responsive UI built with Jetpack Compose
- **Real-time Data**: Latest cryptocurrency information from CoinPaprika API
- **Detailed Information**: View detailed information for each cryptocurrency
- **Search**: Easily search for specific cryptocurrencies
- **Clean Architecture**: Proper separation of concerns with data, domain, and presentation layers

## Tech Stack

- **UI**: Jetpack Compose with Material 3
- **Architecture**: MVVM + Clean Architecture
- **Dependency Injection**: Hilt
- **Networking**: Retrofit
- **Asynchronous Programming**: Kotlin Coroutines and Flow
- **Navigation**: Jetpack Navigation for Compose
- **View Model**: Jetpack ViewModel

## Architecture

The app is built using Clean Architecture principles with three main layers:

1. **Data Layer**:
   - Repositories implementation
   - Remote data sources
   - API services
   - Data models (DTOs)

2. **Domain Layer**:
   - Use cases
   - Repository interfaces
   - Domain models

3. **Presentation Layer**:
   - ViewModels
   - UI States
   - Composable screens and components

## Requirements

- Android Studio Hedgehog or higher
- Minimum SDK 25 (Android 7.1)
- Target SDK 35
- Kotlin 1.9 or higher

## Dependencies

- Jetpack Compose: UI toolkit
- Hilt: Dependency injection
- Retrofit: HTTP client
- Kotlin Coroutines: Asynchronous programming
- Navigation Compose: Navigation framework
- Accompanist Flow Layout: UI component library

## Acknowledgments

- [CoinPaprika API](https://api.coinpaprika.com/) for providing cryptocurrency data
