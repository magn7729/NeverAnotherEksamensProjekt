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

### Commits

Ændringer gemmes løbende med commits. En commit-besked skal kort beskrive, hvad der er ændret på dansk.

### Workflow

1. Opret en ny branch fra `main`.

2. Lav ændringer i projektet på din egen branch.

3. Commit og push ændringerne til GitHub.

4. Gå ind på GitHub og vælg **Pull requests**.

   Her kan man sammenligne to branches og oprette en pull request.

   Sørg for at vælge **base: main** og **compare: oliver**.

   Det betyder, at ændringerne fra `oliver` skal ind i `main`.

   <img width="550" alt="Vælg base main og compare oliver" src="https://github.com/user-attachments/assets/d8820d5f-29cc-457c-898d-3f13641be15f" />

5. Når branches er valgt korrekt, viser GitHub ændringerne mellem `oliver` og `main`.

   Tjek igen, at der står **base: main** og **compare: oliver**.

   Tryk derefter på **Create pull request**.

   <img width="550" alt="Opret pull request fra oliver til main" src="https://github.com/user-attachments/assets/8a9ab008-907f-4a69-a814-25f8724773dc" />

6. Udfyld titel og beskrivelse for pull requesten.

   Titlen skal kort forklare, hvad ændringen handler om. Beskrivelsen kan bruges til at forklare, hvad der er lavet, og hvorfor ændringen skal merges ind i `main`.

   <img width="550" alt="Udfyld titel og beskrivelse for pull request" src="https://github.com/user-attachments/assets/5f9a9e0d-b39c-42d6-8411-f2de39687b90" />

7. Få pull requesten gennemgået af gruppen.

8. Når pull requesten er godkendt, merges den ind i `main`.

   <img width="550" alt="Merge pull request ind i main" src="https://github.com/user-attachments/assets/4a9cf211-22cb-4672-98eb-cea5452e95ce" />

9. Skift derefter tilbage til `main` i Android Studio og vælg **Update Project**, så den lokale version af `main` bliver opdateret.

   <img width="550" alt="Update Project på main i Android Studio" src="https://github.com/user-attachments/assets/6c7c9767-a865-43a6-992a-197f48d71eff" />


## Authors

- Navn
- Navn
- Navn
- Navn

## Future Improvements

- Ting I vil tilføje senere

## License

MIT
