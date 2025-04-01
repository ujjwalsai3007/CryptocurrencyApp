# Cryptocurrency App

A modern Android application that displays cryptocurrency information using the CoinPaprika API. This app follows clean architecture principles and is built with the latest Android development tools and libraries.


![image](https://github.com/user-attachments/assets/55bfc64d-44c7-4dbf-977e-dff28b8a5c01)
![image](https://github.com/user-attachments/assets/3824d530-048a-4f55-85aa-cb84c4e74450)
![image](https://github.com/user-attachments/assets/a3528590-6c8b-49ee-97e2-2ccbf9e5096c)
![image](https://github.com/user-attachments/assets/392e79d6-f58b-4699-bcda-64e4ba87bacf)




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
