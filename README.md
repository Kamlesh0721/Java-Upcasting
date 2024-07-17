# Weapon Game

This project demonstrates the practical use of upcasting in real-life programming through a simple game scenario. The game assigns a weapon to a user based on their score using object-oriented programming principles such as inheritance and polymorphism.

## Table of Contents
- [Introduction](#introduction)
- [Classes Overview](#classes-overview)
- [Usage](#usage)

## Introduction
The project showcases upcasting by creating a `Weapon` base class with derived classes `Knife`, `Gun`, and `Bomb`. Based on the user's score, the appropriate weapon object is created and returned. Upcasting allows the program to treat all weapon objects uniformly, using the parent class reference type.

## Classes Overview

### User
Contains the `main` method to run the program.

### Weapon
A base class containing the `use()` method, which is overridden by derived classes.

### Knife, Gun, Bomb
Derived classes of `Weapon`, each implementing the `use()` method to provide specific behavior for each weapon type.

### Game
Contains logic to determine which weapon to assign to the user based on their score:
- **Score < 10:** Returns a `Knife` object.
- **Score < 50:** Returns a `Gun` object.
- **Score ≥ 50:** Returns a `Bomb` object.

## Usage
To use the program, simply run the `User` class. The program will prompt you to enter a score, then assign and return the appropriate weapon object based on the score.
