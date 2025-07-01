Here’s your updated and polished README with a **video demo link section** included. You can replace the placeholder link with your actual video URL (e.g., YouTube, Google Drive, Loom, etc.).

---

# Stick Hero — JavaFX Game

## 🕹️ Introduction

**Stick Hero** is an engaging and skill-based JavaFX game where players help a hero cross gaps between platforms using a precisely grown stick. It challenges timing, judgment, and fast reflexes — perfect for casual gamers who enjoy simple mechanics with tricky execution.

This repository contains all the source code and architecture details for the game under the Java package `com.example.stickhero`.

---

## 📽️ Demo Video

🎬 **Watch the Game in Action:**
[👉 Click here to view the demo](https://example.com/your-demo-link)


---

## 📚 Table of Contents

* [Game Overview](#game-overview)
* [Screens & Controllers](#screens--controllers)

  * [HelloController](#hellocontroller)
  * [GameController](#gamecontroller)
  * [GameOverScreenController](#gameoverscreencontroller)
  * [HelpScreenController](#helpscreencontroller)
  * [AvatarController (Flyweight)](#avatarcontroller-flyweight)
  * [GalleryScreenController](#galleryscreencontroller)
* [Core Game Logic](#core-game-logic)

  * [StickHeroGame](#stickherogame)
  * [StickCreate (Runnable)](#stickcreate-runnable)
* [Game Features](#game-features)

  * [Sound Management](#sound-management)
  * [Hero (Singleton)](#hero-singleton)
* [Getting Started](#getting-started)
* [Contributing](#contributing)
* [GitHub Repository](#github-repository)
* [Acknowledgments](#acknowledgments)

---

## 🧩 Game Overview

In **Stick Hero**, players tap to grow a stick, aiming to bridge the gap between two platforms. Release at the right moment to let the stick fall — if it reaches the next platform, your hero walks across; miss it, and the game ends!

The game includes:

* Multiple screens for navigation
* Background and avatar customization
* Clean JavaFX architecture with design patterns (Flyweight, Singleton)

---

## 🎮 Screens & Controllers

### HelloController

Manages the main menu screen with options to start, view help, or exit.

### GameController

Core controller that handles gameplay logic, stick mechanics, and transitions.

### GameOverScreenController

Displays the final score and options to restart or return to the main menu.

### HelpScreenController

Provides gameplay instructions and tips.

### AvatarController (Flyweight)

Manages avatar selection using the **Flyweight pattern** to efficiently load and reuse image resources.

### GalleryScreenController

Allows players to customize their background by selecting from a gallery of images.

---

## 🧠 Core Game Logic

### StickHeroGame

Handles the central game logic including:

* Stick growth and rotation
* Platform generation
* Score tracking
* State transitions

### StickCreate (Runnable)

A threaded class that controls how the stick grows and animates. Runs separately for smooth UI updates.

---

## 🔊 Game Features

### Sound Management

Integrates sound effects for enhanced feedback and immersion.

### Hero (Singleton)

Implements the **Singleton pattern** to ensure only one instance of the hero character exists. Manages position, state, and animations.

---

## 🚀 Getting Started

### Prerequisites

* Java Development Kit (JDK 8 or later)
* JavaFX SDK
* Maven (optional, if using Maven to run)

### Run the Game

Clone the repository:

```bash
git clone https://github.com/namit22315/STICKHERO.git
cd stickhero
```

Then run:

```bash
mvn clean
mvn javafx:run
```

Alternatively, open the project in an IDE like IntelliJ or Eclipse and run the main JavaFX application.

---

## 🤝 Contributing

### Developed by Namit Jain

Contributions:

* UI Controllers (Hello, Game, GameOver, Help, Avatar, Gallery)
* Game Logic (StickHeroGame, StickCreate)
* Sound Effects
* Hero Character (Singleton Pattern)

---

## 🔗 GitHub Repository

Browse the full project here:
[https://github.com/namit22315/STICKHERO.git](https://github.com/namit22315/STICKHERO.git)

---

## 🙏 Acknowledgments

* JavaFX for providing the UI framework.
* JUnit (originally used for testing) for inspiring good development practices.

---

Let me know the **actual video URL** and I’ll insert it properly for you!
