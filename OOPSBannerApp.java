/**
 * OOPSBannerApp - A Java application for displaying banner text
 * 
 * This class serves as the main container for the OOPS Banner App project.
 * Use Case 1 (UC1): Prints the literal text "OOPS" to the console.
 * Use Case 2 (UC2): Displays "OOPS" as ASCII art banner using asterisks and spaces.
 * 
 * @author Rudi-rock
 * @version 2.0
 * @since 2026-02-10
 */
public class OOPSBannerApp {
    
    /**
     * Main method - Entry point of the application
     * 
     * This static method serves as the application's entry point where
     * program execution begins. It demonstrates:
     * - UC1: Basic console output using System.out.println()
     * - UC2: ASCII art banner creation using manual string concatenation
     * 
     * @param args Command line arguments (not used in current use cases)
     */
    public static void main(String[] args) {
        // UC1: Print the literal text "OOPS" to console
        System.out.println("OOPS");
        
        // UC2: Display "OOPS" as ASCII art banner (7-line grid)
        System.out.println(); // Empty line separator
        
        // Line 1: Top of letters
        System.out.println(" **** " + " **** " + "***** " + "***** ");
        
        // Line 2: Upper part of letters  
        System.out.println("*    *" + "*    *" + "*    *" + "*     ");
        
        // Line 3: Upper-middle part
        System.out.println("*    *" + "*    *" + "*    *" + "*     ");
        
        // Line 4: Middle part (key structural line)
        System.out.println("*    *" + "*    *" + "***** " + "***** ");
        
        // Line 5: Lower-middle part
        System.out.println("*    *" + "*    *" + "*     " + "     *");
        
        // Line 6: Lower part of letters
        System.out.println("*    *" + "*    *" + "*     " + "     *");
        
        // Line 7: Bottom of letters
        System.out.println(" **** " + " **** " + "*     " + "***** ");
    }
}