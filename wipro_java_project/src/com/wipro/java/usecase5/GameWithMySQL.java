package com.wipro.java.usecase5;

import java.sql.*;
import java.util.Scanner;

public class GameWithMySQL {

    // JDBC URL for MySQL database
    private static final String DB_URL = "jdbc:mysql://localhost:3306/game_db";
    private static final String USER = "root"; // replace with your MySQL username
    private static final String PASSWORD = "Root"; // replace with your MySQL password
    private static Connection connection;

    public static void main(String[] args) {
        // Establish connection to the MySQL database
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("Connected to the MySQL database!");

            // Create table if not exists
            createTableIfNotExists();

            // Start the game
            startGame();

        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Failed to close the connection: " + e.getMessage());
            }
        }
    }

    // Method to create a table in the database if it doesn't exist
    private static void createTableIfNotExists() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS player_data ("
                                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                                + "name VARCHAR(255) NOT NULL, "
                                + "age INT NOT NULL, "
                                + "high_score INT NOT NULL);";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(createTableSQL);
            System.out.println("Player data table is ready.");
        } catch (SQLException e) {
            System.err.println("Error creating table: " + e.getMessage());
        }
    }

    // Method to start the game and interact with the user
    private static void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Game!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your high score: ");
        int highScore = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left by nextInt()

        // Save the data to the database
        savePlayerData(name, age, highScore);

        // Ask if the user wants to view stored data
        System.out.print("Do you want to view the stored player data? (yes/no): ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            viewStoredData();
        }

        scanner.close();
    }

    // Method to save player data into the database
    private static void savePlayerData(String name, int age, int highScore) {
        String insertSQL = "INSERT INTO player_data (name, age, high_score) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setInt(3, highScore);
            pstmt.executeUpdate();
            System.out.println("Player data saved to the database!");
        } catch (SQLException e) {
            System.err.println("Error saving data: " + e.getMessage());
        }
    }

    // Method to retrieve and display stored player data
    private static void viewStoredData() {
        String selectSQL = "SELECT * FROM player_data";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {
            System.out.println("\nStored Player Data:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                int highScore = rs.getInt("high_score");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", High Score: " + highScore);
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving data: " + e.getMessage());
        }
    }
}
