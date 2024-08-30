/**
 * Author: Vaibhav Diwan
 * User: Vaibhav Diwan
 * Date: 8/28/2024
 * Time: 7:52 PM
 */

public class CharArrayCountingVowels {
    public static void main(String[] args) {
        char[] array = {'V','a' ,'I', 'b','H', 'A', 'V',' ' , 'D', 'i', 'w', 'a', 'n'};
        int count = 0;
        for (int index = 0; index < array.length; index++) {
            char temp = array[index];
            if(temp >= 'A' && temp <= 'Z') {
                temp = (char)(temp + 32);
            }

            if(temp == 'a' ||
                   temp == 'e' ||
                    temp == 'i' ||
                    temp == 'o' ||
                    temp == 'u' ){
                count++;
            }

        }//WAP to count the vowels in the given array
        // arr = {V,a ,I, b,H, A, V, , D, i, w, a, n}
        System.out.println("Number of vowels in given array = " + count);
    }
}
/*
WAP to count the uppercase letters in the given character array
 */
