# Java CLI Utilities: Number Base Converter & Matrix Operations

This repository contains two simple yet useful command-line interface (CLI) utility programs written in Java:

1.  **Binary-Decimal Converter:** Converts numbers between binary and decimal representations.
2.  **Matrix Operation Tool:** Performs addition and multiplication on two randomly generated matrices of user-defined dimensions.

These programs serve as straightforward examples of basic algorithm implementation and user interaction in Java.

## Features

### 1. Binary-Decimal Converter (`BinaryDecimalConverter.java`)

*   **Binary to Decimal Conversion:** Takes a binary string as input and outputs its decimal equivalent.
*   **Decimal to Binary Conversion:** Takes an integer decimal number as input and outputs its binary string equivalent.
*   Interactive menu for selecting the conversion type.

### 2. Matrix Operation Tool (`MatrixOperation.java`)

*   **Matrix Generation:** Randomly generates integer matrices with user-specified dimensions (values between 0 and 100).
*   **Matrix Addition:** Adds two matrices, provided their dimensions are compatible.
*   **Matrix Multiplication:** Multiplies two matrices, provided their dimensions are compatible for multiplication.
*   Displays the input matrices and the resulting matrix.
*   Interactive menu for selecting the matrix operation.
*   Input validation for matrix dimensions based on the chosen operation.

## How to Run

1.  **Prerequisites:**
    *   Java Development Kit (JDK) installed (e.g., version 8 or higher).
2.  **Compilation:**
    *   Navigate to the directory containing the `.java` files.
    *   Compile the desired utility:
        ```bash
        javac BinaryDecimalConverter.java
        # OR
        javac MatrixOperation.java
        ```
3.  **Execution:**
    *   Run the compiled class file:
        ```bash
        java BinaryDecimalConverter
        # OR
        java MatrixOperation
        ```
4.  **Follow On-Screen Prompts:**
    *   The programs will guide you through selecting operations and providing necessary inputs.

## Code Structure

*   **`BinaryDecimalConverter.java`:** Contains the logic for number base conversions.
    *   `main()`: Handles user interaction and menu.
    *   `binaryToDecimal(String binary)`: Converts binary string to decimal integer.
    *   `decimalToBinary(int decimal)`: Converts decimal integer to binary string.
*   **`MatrixOperation.java`:** Contains the logic for matrix operations.
    *   `main()`: Handles user interaction, matrix dimension input, and operation selection.
    *   `generateMatrix(int rows, int cols, Random random)`: Creates a matrix with random integer values.
    *   `printMatrix(int[][] matrix)`: Prints a matrix to the console.
    *   `addMatrices(int[][] matrix1, int[][] matrix2)`: Adds two matrices.
    *   `multiplyMatrices(int[][] matrix1, int[][] matrix2)`: Multiplies two matrices.

## Example Usage

**Binary-Decimal Converter:**

```Choose an operation:
(1) Convert binary to decimal
(2) Convert decimal to binary
(3) Quit
1
Enter a binary number:
1011
Decimal: 11
Choose an operation:
(1) Convert binary to decimal
(2) Convert decimal to binary
(3) Quit
2
Enter a decimal number:
13
Binary: 1101
Choose an operation:
(1) Convert binary to decimal
(2) Convert decimal to binary
(3) Quit
3
```

**Matrix Operation Tool:**

```Choose an operation:
(1) Add two matrices
(2) Multiply two matrices
(3) Quit
1
Enter the number of rows and columns for the first matrix:
2 2
Enter the number of rows and columns for the second matrix:
2 2
Matrix A:
[values...]
Matrix B:
[values...]
Result of addition:
[values...]
```
