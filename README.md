# StickHero Game and Test Suite

## Introduction

Welcome to Stick Hero, an exciting JavaFX game with an integrated test suite. This comprehensive document provides in-depth insights into the game's architecture, controllers, functionalities, and details on the test suite ensuring the reliability of the StickHeroGame class.

This Java package, `com.example.stickhero`, combines a thrilling gaming experience and a robust test suite for optimal development and testing practices.

## Table of Contents

1. [Stick Hero Game](#stick-hero-game)
    - [Introduction](#introduction-1)
    - [Game Overview](#game-overview-1)
    - [Controllers](#controllers-1)
        - [HelloController](#hellocontroller)
        - [GameController](#gamecontroller)
        - [GameOverScreenController](#gameoverscreencontroller)
        - [HelpScreenController](#helpscreencontroller)
        - [AvatarController - Implements Flyweight](#avatarcontroller---implements-flyweight)
        - [GalleryScreenController](#galleryscreencontroller)
    - [Game Logic](#game-logic-1)
        - [Stick Hero Game Class](#stick-hero-game-class)
        - [Stick Create Class](#stick-create-class)
    - [Testing](#testing-1)
        - [StickHeroGameTest](#stickherogametest)
    - [Sound Management](#sound-management)
    - [Hero Class](#hero-class)

2. [StickHero Test Suite](#stickhero-test-suite)
    - [Getting Started](#getting-started)
        - [Prerequisites](#prerequisites)
        - [Installation](#installation)
    - [Running Tests](#running-tests)
        - [TestRunner Class](#testrunner-class)
            - [Run the Tests](#run-the-tests)
        - [Test Results](#test-results)
    - [Test Classes](#test-classes)
        - [StickHeroGameTest](#stickherogametest-1)
    - [Contributing](#contributing)
    - [License](#license)
    - [Acknowledgments](#acknowledgments)

## Stick Hero Game

### Introduction

Stick Hero is a game where the player controls a character who needs to cross platforms by extending a stick. The game challenges the player's timing and precision skills.

### Game Overview

The game consists of different screens:

- **Hello Screen:** The initial screen that provides options to start the game, view the help screen, or exit.

- **Game Screen:** The main gameplay screen where the player extends the stick and moves across platforms.

- **Game Over Screen:** Displayed when the game ends, showing the player's score and options to restart or return home.

- **Help Screen:** Provides information on how to play the game.

- **Gallery Screen:** Allows the player to select background images from a gallery.

### Controllers

#### HelloController

Controls the Hello Screen and handles user actions.

#### GameController

Manages the main gameplay screen and user interactions during the game.

#### GameOverScreenController

Handles the Game Over Screen, displaying the final score and providing options to restart or return home.

#### HelpScreenController

Manages the Help Screen, providing information on how to play the game.

#### AvatarController - Implements Flyweight

Controls the Avatar selection screen, allowing the player to choose an avatar. Implements the flyweight design pattern for efficient image loading, minimizing memory usage.

#### GalleryScreenController

Manages the Gallery Screen, allowing the player to select background images from a gallery.

### Game Logic

#### Stick Hero Game Class

The `stick_hero_game` class encapsulates the game logic. It handles stick growth, rotation, platform generation, scoring, and transitions between game states.

#### Stick Create Class

The `stick_create` class, implemented as a Runnable, manages stick animation properties such as length, position, and rotation. It runs in a separate thread.

### Testing

#### StickHeroGameTest

Includes JUnit tests to verify the functionality of Stick Hero game components.

### Sound Management

Sound effects are managed using the sound class, providing audio feedback during gameplay.

### Hero Class

The `hero` class represents the game character. It ensures that only one instance of the hero exists by incorporating the singleton design pattern and manages its position, movement, and state.

## StickHero Test Suite

### Getting Started

#### Prerequisites

- Java Development Kit (JDK) installed on your machine.

#### Installation

1. Clone the repository to your local machine.
   ```bash
   git clone https://github.com/example/stickhero.git
   ```
2. Navigate to the project directory.
   ```bash
   cd stickhero
   ```

### Running Tests

#### TestRunner Class

The `TestRunner` class serves as the entry point for executing the test suite. It uses JUnitCore to run the test cases defined in `StickHeroGameTest.class`.

##### Run the Tests

Execute the following commands run the code:
```bash
mvn clean
mvn javafx:run
```

#### Test Results

After running the tests, the `TestRunner` will print the results to the console. Any failures encountered during the test will be displayed, along with an indication of whether the overall test suite was successful.

### Test Classes

#### StickHeroGameTest

The `StickHeroGameTest` class contains the test cases for the StickHeroGame class. These tests cover various scenarios to ensure the game functions correctly and handles different inputs appropriately.

### Contributing

### Namit Jain

Namit Jain contributed to the following sections:
- HelloController
- GameController
- GameOverScreenController
- HelpScreenController
- AvatarController
- Gallery

### Pranav Tanwar

Pranav Tanwar contributed to the following sections:
- Stick Hero Game Class
- Stick Create Class
- StickHeroGameTest
- Sound Management
- Hero Class



### Github Link

https://github.com/namit22315/2022315_2022368.git


### Acknowledgments

- This test suite uses JUnit for testing. Visit [JUnit](https://junit.org/junit5/) for more information on the JUnit testing framework.