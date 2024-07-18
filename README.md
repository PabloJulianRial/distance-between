# Distance Between Two Cities

## Brief

This project involves developing a command-line program that takes in the names of two cities and returns the distance between them. The program uses a predefined list of cities and their coordinates for the calculation.

## Features

- **Input Handling**: The program accepts user input for two city names.
- **Distance Calculation**: It calculates the distance between the two cities based on their coordinates.
- **City List**: The program reads a list of cities and their coordinates from a CSV file.

## Classes

- **City**: Defines the name and coordinates of a city.
- **CityList**: Creates an ArrayList of cities by reading a CSV file using the `FileRead` class.
- **DistanceCalculator**: Main class that combines all other classes and methods to run the program.
- **FileRead**: Reads cities and coordinates from a CSV file.
- **Input**: Handles user input for the names of the two cities.

## How to Use

1. **Clone the Repository**:
    ```sh
    git clone https://github.com/PabloJulianRial/distance-between.git
    cd distance-between
    ```

2. **Compile the Program**:
    ```sh
    javac DistanceCalculator.java
    ```

3. **Run the Program**:
    ```sh
    java DistanceCalculator
    ```

4. **Follow the Prompts**:
    - Enter the names of the two cities when prompted.
    - View the calculated distance between the two cities.

## Project Structure

- **City.java**: Defines the name and coordinates of a city.
- **CityList.java**: Creates an ArrayList of cities by reading a CSV file using the `FileRead` class.
- **DistanceCalculator.java**: Main class that combines all other classes and methods to run the program.
- **FileRead.java**: Reads cities and coordinates from a CSV file.
- **Input.java**: Handles user input for the names of the two cities.
- **README.md**: This file, providing an overview and usage instructions for the project.

## Contact

For any questions or suggestions, please reach out to rialpabloj@hotmail.com.

