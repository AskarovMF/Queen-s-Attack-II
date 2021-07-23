# Queen-s-Attack-II

This is a task from the HackerRank: https://www.hackerrank.com/challenges/queens-attack-2/problem
You will be given a square chess board with one queen and a number of obstacles placed on it. Determine how many squares the queen can attack.

A queen is standing on an nxn chessboard. The chess board's rows are numbered from  to , going from bottom to top. Its columns are numbered from 1 to n,
going from left to right. Each square is referenced by a tuple, (r, c) describing the row, r, and column, c, where the square is located.
The queen is standing at position (r_q, c_q) In a single move, she can attack any square in any of the eight directions (left, right, up, down, and the four diagonals).

Function Description

Complete the queensAttack function in the editor below.

queensAttack has the following parameters:
- int n: the number of rows and columns in the board
- nt k: the number of obstacles on the board
- int r_q: the row number of the queen's position
- int c_q: the column number of the queen's position
- int obstacles[k][2]: each element is an array of 2  integers, the row and column of an obstacle

Returns
- int: the number of squares the queen can attack

Input Format

The first line contains two space-separated integers n and k, the length of the board's sides and the number of obstacles.
The next line contains two space-separated integers r_q and c_q, the queen's row and column position.
Each of the next k  lines contains two space-separated integers r_i and c_i the row and column position of obstacle[i].
Constraints
0 < n < 1 000 000
0 <= k <= 1 000 000
A single cell may contain more than one obstacle.
There will never be an obstacle at the position where the queen is located.
