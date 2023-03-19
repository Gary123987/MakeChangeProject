# MakeChangeProject

## Overview
In this project, the goal was to create a program that could take a price of an item, the amount paid for the item, and return change in the largest denominations possible. I chose to take a simple approach to this, rather than trying to make everything run in a single for loop using complex math functions, a series of if statments was enough to get the job done. I started by find the total amount of change due, then using an if stament to determine how many twenties, tens, and so on. the if loop would only run if there was enough change for that denomination, meaning it wouldnt run for any denominations needed. I think there could be a more complicated solution, that could be done in one for loop, however the series of if statments seems to be simpler and more straightforward, making it easier to code and easier to read. 


## Technologies Used
-Java
-Eclipse
-Git

## Lessons Learned
1. Values can be changed multiple times throughout a program. This can be used to keep subtracting fixed amounts that are progressively smaller. In this project, the most straightforward way was to have one value for the total change, then remove the multiples of 20, then 10, and so on. only one variable was needed to do this. 

2. If loops can be stacked on each other indefinitely. If you have a single piece of data that you want to analyze and manipulate over and over, you can establish the value of this variable, and use a series of if loops to keep changing the value, while returning information each time. 

3. sysout is useful for finding where bugs exist in you program. by putting sysouts at each step throughout the program, you can see what is happening at each step throughout. This helps you visualize whats happening inside your code, and lets you pinpoint any issues that may occur. 