/**
 * UC3: OOPS Banner with String.join() - Memory Optimization
 * 
 * Use Case 3 demonstrates memory-efficient string construction:
 * - Replaces + operator concatenation with String.join() method
 * - Reduces intermediate String objects in memory
 * - Addresses performance issues from string immutability
 * - Maintains original banner layout with improved efficiency
 * - Example of using static methods for better memory footprint
 * 
 * @author Developer
 * @version 1.0
 */
public class UC3 {
    public static void main(String[] args) {
        System.out.println("OOPS");
        System.out.println();
        System.out.println(String.join(" ", " **** ", " **** ", "***** ", "***** "));
        System.out.println(String.join("", "*    *", "*    *", "*    *", "*     "));
        System.out.println(String.join("", "*    *", "*    *", "*    *", "*     "));
        System.out.println(String.join("", "*    *", "*    *", "***** ", "***** "));
        System.out.println(String.join("", "*    *", "*    *", "*     ", "     *"));
        System.out.println(String.join("", "*    *", "*    *", "*     ", "     *"));
        System.out.println(String.join(" ", " **** ", " **** ", "*     ", "***** "));
    }
}
