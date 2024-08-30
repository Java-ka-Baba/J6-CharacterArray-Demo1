import java.util.Scanner;

/**
 * Author: Vaibhav Diwan
 * User: Vaibhav Diwan
 * Date: 8/28/2024
 * Time: 7:42 PM
 */

public class CharacterArray {
    public static void main(String[] args) {
        // An array to hold characters
        char[] array = new char[5];
        //default value of character ?
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        // initialize all the index with the input from user
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < array.length; index++) {
            System.out.println("Enter a vowel");
            array[index] = scanner.next().charAt(0);
        }
        System.out.println("Printing char array");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
