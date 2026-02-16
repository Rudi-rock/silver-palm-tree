/**
 * UC4: OOPS Banner with Arrays and Loops - Modularity & Reusability
 * 
 * Use Case 4 demonstrates improved code organization:
 * - String arrays for centralized data storage
 * - Enhanced for-loops for cleaner output traversal
 * - String.join() for efficient line construction
 * - Improved modularity and scalability
 * - Reduced code repetition
 * 
 * Key Improvements over UC3:
 * - All banner lines stored in a single array
 * - Eliminates repetitive print statements
 * - Easy to modify or extend in future versions
 * - Better separation of data from logic
 * 
 * @author Developer
 * @version 1.0
 */
public class UC4 {
    public static void main(String[] args) {
        // Display title
        System.out.println("OOPS");
        System.out.println();
        
        // Store all banner lines in a String array
        String[] bannerLines = {
            String.join(" ", " **** ", " **** ", "***** ", "***** "),
            String.join("", "*    *", "*    *", "*    *", "*     "),
            String.join("", "*    *", "*    *", "*    *", "*     "),
            String.join("", "*    *", "*    *", "***** ", "***** "),
            String.join("", "*    *", "*    *", "*     ", "     *"),
            String.join("", "*    *", "*    *", "*     ", "     *"),
            String.join(" ", " **** ", " **** ", "*     ", "***** ")
        };
        
        // Use enhanced for-loop to print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
