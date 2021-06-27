# Code
```
/*
Author :Gayathri V
Challenge 5: Ceaser Cipher.
 */

import java.util.Scanner;
public class CaesarCipherEncoding
{

    public static StringBuffer encryptString(String string, int shiftSize)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<string.length(); i++)
        {
            if (Character.isUpperCase(string.charAt(i)))
            {
                char character = (char)(((int)string.charAt(i) +
                        shiftSize - 65) % 26 + 65);
                result.append(character);
            }
            else
            {
                char character = (char)(((int)string.charAt(i) +
                        shiftSize - 97) % 26 + 97);
                result.append(character);
            }
        }
        return result;
    }


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string :");
        String string= scanner.nextLine();
        System.out.println("Enter the shift size :");
        int shiftSize = scanner.nextInt();

        System.out.println("Text : " + string);
        System.out.println("Shift : " + shiftSize);
        System.out.println("Cipher Encoded String: " + encryptString(string, shiftSize));
    }
}


```

# Explanation

In the main method user able to give string as input and the required shift.
In the method encrypt string user able to perform encryption according to lowercase or uppercase of entered string.
For each character the shifting is done with the formula  (shiftSize - 65) % 26 + 65) or 97 for lowercase, by addding with ascii value of corresponding character.
Afer the shifting append it to string buffer result.
Finally print returned buffer and terminates.

