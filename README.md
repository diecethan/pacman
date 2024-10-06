# Pac-Man Game

## Overview

This project is a reimagined version of the classic Pac-Man game, implemented using Greenfoot. It offers a unique twist on the traditional gameplay experience, maintaining core elements such as navigating mazes, collecting items, and avoiding enemies. The game draws inspiration from the classic Pac-Man experience, adding on original level designs and ghost mechanics to create a fresh and engaging gameplay experience.

## Installation

1. Ensure Greenfoot is installed
2. Clone the repository:
   ```bash
   git clone https://github.com/diecethan/pacman
   cd pacman
3. Open the project in Greenfoot.
4. Run the game by clicking the "Run" button in Greenfoot.

## Features

* **Score Tracking**: Players can collect points during gameplay, which are displayed at the end of each game.
* **Sound Effects**: Engaging sound effects enhance the gaming experience:
  * Waka sound when the player moves
  * Background music for the title screen
  * Victory sound upon winning
  * Death sound upon losing
* **Controls**:
  * Move Pac-Man using arrow keys or WASD.
  * Press 'Space' to restart after winning or losing.
  * Press 'B' to return to the title screen.

## Class Structure

* **GameWorld**: The main world that manages game states and player interactions.
* **State**: An abstract class for managing different game states (TitleState, WinState, LoseState).
* **Player**: The main character controlled by the player.
* **Wall**: The maze walls that Pac-Man cannot pass through.
* **Ghost**: Enemies that chase Pac-Man.
* **Text**: Utility class for displaying text on the screen.

## How to Play
* Start the game by pressing the 'Space' key at the title screen.
* Navigate Pac-Man through the levels using the arrow keys or WASD.
* Collect points while avoiding ghosts.
* The game ends when either all points are collected (win) or Pac-Man collides with a ghost (lose).
* After the game ends, follow the on-screen instructions to restart or return to the title screen.
