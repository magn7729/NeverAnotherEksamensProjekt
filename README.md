# NeverAnother

Dette GitHub-repository er en Android-applikation udviklet som en del af eksamensprojektet. Appen er lavet som et mere intuitivt og guidet købs- og måleflow for Never Another, hvor brugeren kan indtaste sine egne mål, få hjælp gennem måleguides og simulere en gennemførelse af et køb.

## Demo

Youtube link til demo af APP
<https://youtu.be/Ta9dOVx39Cg>

## Features

- Guidet måling
- Sliders til indtastning af mål
- Visuelle måleguides og videoguides
- Dynamisk guidescreen
- Resultatside hvor brugerens mål bliver vist
- Mulighed for at ændre BH'ens farve direkte på resultatsiden.
- Checkout og confirmation-flow
- Unit-tests af centrale update-funktioner i BraViewModel

## Built With

- Android Studio
- Kotlin
- Jetpack Compose
- Navigation Compose
- ViewModel


## Installation



1. Klon repositoryet:
```bash
git clone https://github.com/magn7729/NeverAnotherEksamensProjekt.git
```
3. Åbn projektet i Android Studio.
4. Vent på, at Gradle syncer projektet.
5. Vælg en emulator eller fysisk Android-enhed.
6. Kør appen med Run i Android Studio.


## Architecture 

Projektet er struktureret efter en MVVM-inspireret opbygning. Det betyder, at vi har forsøgt at adskille skærme, data/logik og navigation i forskellige mapper.

- view indeholder appens skærme og UI-komponenter.
- viewmodel indeholder BraViewModel, som håndterer måledata og guideindhold.
- model indeholder datamodeller, f.eks. MeasurementGuide.
- navigation indeholder appens navigation og routes.

# Projektstruktur (MVVM)

```text

NeverAnotherEksamensProjekt

├── app
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com.example.neveranothereksamensprojekt
│       │   │       ├── model
│       │   │       │   └── MeasurementGuide.kt
│       │   │       │
│       │   │       ├── navigation
│       │   │       │   ├── AppNavHost.kt
│       │   │       │   └── Screen.kt
│       │   │       │
│       │   │       ├── view
│       │   │       │   ├── components
│       │   │       │   │   ├── DefaultFlowScreen.kt
│       │   │       │   │   └── MeasurementSlider.kt
│       │   │       │   │
│       │   │       │   └── screens
│       │   │       │       ├── CheckoutScreen.kt
│       │   │       │       ├── ConfirmationScreen.kt
│       │   │       │       ├── GuideScreen.kt
│       │   │       │       ├── Homescreen.kt
│       │   │       │       ├── Introscreen.kt
│       │   │       │       ├── MeasurementsScreen.kt
│       │   │       │       └── ResultScreen.kt
│       │   │       │
│       │   │       ├── viewmodel
│       │   │       │   └── BraViewModel.kt
│       │   │       │
│       │   │       └── MainActivity.kt
│       │   │
│       │   └── res
│       │       ├── drawable
│       │       ├── mipmap
│       │       └── raw
│       │
│       ├── test
│       │   └── java
│       │       └── com.example.neveranothereksamensprojekt
│       │           └── BraViewModelTest.kt
│       │
│       └── androidTest
│           └── java
│               └── com.example.neveranothereksamensprojekt
│                   └── ExampleInstrumentedTest.kt
│
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
└── README.md

```

## Usage

Appen starter på forsiden og guider brugeren gennem et flow, hvor brugeren først introduceres til måleprocessen. Derefter kan brugeren indtaste sine mål på måleskærmen ved hjælp af sliders.

På måleskærmen kan brugeren åbne en guide til hver måling. Guiden viser enten en visuel forklaring eller en videogennemgang. Når målene er indtastet, føres brugeren videre til resultatsiden, hvor målene vises, og hvor brugeren kan vælge farve på BH’en.

Til sidst kan brugeren fortsætte til checkout og confirmation.


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

   Sørg for at vælge **base: main** og **compare: branch-navn**.

   Det betyder f.eks., at ændringerne fra `oliver` skal ind i `main`.

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

- Gustav Meyer
- Magnus Ørnhof
- Oliver Baasch
- Mathilde Farnø

## Future Improvements

- Flere unit tests
- Ui tests
- Mere komplet checkout og confirmation flow
- Mulighed for at gemme brugeren valg og målinger


