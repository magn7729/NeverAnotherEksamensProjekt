# NeverAnother

Kort beskrivelse af projektet.

## Demo

Screenshot eller link.

## Features

- Feature 1
- Feature 2
- Feature 3

## Built With

- Android Studio
- Kotlin

## Installation

```bash
git clone ...
npm install
npm run dev
```

## Architecture 

# Projektstruktur (MVVM)

```text

com.example.app

│

├── view

│   │

│   ├── home

│   │   └── HomeScreen.kt

│   │

│   ├── profile

│   │   └── ProfileScreen.kt

│   │

│   └── settings

│       └── SettingsScreen.kt

│

├── viewmodel

│   │

│   ├── HomeViewModel.kt

│   ├── ProfileViewModel.kt

│   └── SettingsViewModel.kt

│

├── model

│   │

│   ├── User.kt

│   ├── Product.kt

│   │

│   └── repository

│       ├── UserRepository.kt

│       └── ProductRepository.kt

│

├── navigation

│   └── AppNavigation.kt

│

└── MainActivity.kt

```

## Usage

Forklaring på hvordan systemet bruges.

## Project Structure

Kort oversigt over mapper.

## Git Workflow

I projektet bruger vi branches og pull requests for at holde styr på ændringer og sikre, at kode bliver gennemgået, før den kommer ind i `main`.

### Branches

`main` bruges som den stabile branch, hvor den færdige og godkendte kode ligger.

Når en udvikler arbejder på en ny funktion, fejlrettelse eller ændring, laves der en separat branch. Branches kan for eksempel navngives efter personen eller opgaven.

**Commits**

Ændringer gemmes løbende med commits. En commit-besked skal kort beskrive, hvad der er ændret på dansk.

**Workflow**
1. Opret en ny branch fra main
2. Lav ændringer i projektet
3. "Commit and push" ændringerne

5. <img width="537" height="247" alt="Skærmbillede 2026-05-06 kl  11 11 27" src="https://github.com/user-attachments/assets/d8820d5f-29cc-457c-898d-3f13641be15f" />

6. Push branchen til GitHub
7. Opret en pull request til main
8. Få pull requesten gennemgået
9. Løs eventuelle konflikter
10. Merge pull requesten ind i main

## Authors

- Navn
- Navn
- Navn
- Navn

## Future Improvements

- Ting I vil tilføje senere

## License

MIT
