<img width="1311" height="506" alt="Skærmbillede 2026-05-06 kl  11 13 33" src="https://github.com/user-attachments/assets/c18294da-84a7-49de-8e50-dedeed26d3c0" />
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

<img width="1421" height="512" alt="Skærmbillede 2026-05-06 kl  11 14 02" src="https://github.com/user-attachments/assets/8a9ab008-907f-4a69-a814-25f8724773dc" />


<img width="933" height="525" alt="Skærmbillede 2026-05-06 kl  11 14 31" src="https://github.com/user-attachments/assets/5f9a9e0d-b39c-42d6-8411-f2de39687b90" />

9. Få pull requesten gennemgået
10. Merge pull requesten ind i main
<img width="895" height="172" alt="Skærmbillede 2026-05-06 kl  11 20 09" src="https://github.com/user-attachments/assets/4a9cf211-22cb-4672-98eb-cea5452e95ce" />

11. Update project inde på main
<img width="637" height="187" alt="Skærmbillede 2026-05-06 kl  11 22 49" src="https://github.com/user-attachments/assets/6c7c9767-a865-43a6-992a-197f48d71eff" />


## Authors

- Navn
- Navn
- Navn
- Navn

## Future Improvements

- Ting I vil tilføje senere

## License

MIT
