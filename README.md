# Complex Calculator
This is a Java program that allows users to perform basic arithmetic operations with complex numbers. It provides a simple console interface where the user can input two complex numbers and then perform operations such as addition, subtraction, multiplication, and division. The program also includes a set of mathematical constants such as Pi, Euler's number, the golden ratio, and Euler's constant.
Requirements
This program requires a Java Development Kit (JDK) version 8 or later to be installed on the system.
Usage
To use this program, follow these steps:
1.	Compile the ComplexCalculator.java file using the Java compiler.
  ### javac ComplexCalculator.java 


2.	Run the compiled program by typing the following command:

  ### java ComplexCalculator 

#

3.	Follow the prompts on the screen to input the two complex numbers and choose the desired arithmetic operation.

# Classes and Interfaces

## ComplexCalculator

The ComplexCalculator class is the main class that contains the main method. It uses the Scanner class to read input from the user and then creates instances of the Complex class to perform the arithmetic operations.

## MathConstants

The MathConstants interface defines a set of mathematical constants that can be used in the program. These constants include Pi, Euler's number, the golden ratio, and Euler's constant.

## ComplexOperations

The ComplexOperations interface defines a set of arithmetic operations that can be performed on complex numbers. These operations include addition, subtraction, multiplication, and division.

## Complex

The Complex class represents a complex number and implements the ComplexOperations interface. It provides methods to perform the basic arithmetic operations on complex numbers and overrides the toString method to display the complex number in the standard format.

# License

This program is licensed under the MIT License. See the LICENSE file for more information.
