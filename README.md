# ConnectFour-Game
I have built a connect four game in Java, the source file contains all classes for the game along with the runner class to show how the game is meant to be run.

The game follows the rules of a 7x6 two player connect four game, where getting four in a row diagonally, horizontally or vertically is a win.

**How The Game Looks and Runs**

<img width="270" alt="Screen Shot 2022-03-22 at 10 14 59 AM" src="https://user-images.githubusercontent.com/89663127/159502876-5d4d44db-8e1d-43a4-8a9c-dfbadf170716.png">

**Insight Into the Design of the Game**

This project implements object-oriented programming; each class pertains to a specific job in the overall structure.
The Board class handles everything to do with creating, displaying, updating, resetting, and checking the if board contains a win or not.
The ConnectFour class handles the aspect of collecting information from each player and sending it onto the board as the game progresses until someone wins.
The HumanPlayer class handles the input of a player each time.
