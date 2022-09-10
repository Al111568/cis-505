/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by A. Burgos 2022
 */
public class BurgosHelloWorld {
    /**
     * Method with two arguments, used to print the user's first and last name.
     * @param firstName String 
     * @param lastName String 
     * @printf writes the results to the System.out window.
     */
    public static void myName(String firstName, String lastName) {
        System.out.println(String.format("Hello World from %s %s", firstName, lastName));
    } // end myName

    public static void main(String[] args) {
        myName("Alvaro", "Burgos"); // Call the myName() method with the values "Alvaro" and "Burgos."
    } // end main
} // end Assignment1

