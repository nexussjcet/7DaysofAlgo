# Code
```

/*
Author : Gayathri V
Challenge 3: Base to Hex.
 */

import java.util.Scanner;
public class Conversion1Oto16{
    public static String toHex(int decimal){
        int reminder;
        String hex="";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(decimal>0)
        {
            reminder=decimal%16;
            hex=hexchars[reminder]+hex;
            decimal=decimal/16;
        }
        return hex;
    }
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("1.Binary 2.Decimal.\nEnter your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                                int[] hex = new int[1000];
                                int i = 1, j = 0, reminder, decimal = 0, binary;
                                System.out.print("Input a Binary Number: ");
                                binary = in.nextInt();
                                while (binary > 0) {
                                    reminder = binary % 2;
                                    decimal = decimal + reminder * i;
                                    i = i * 2;
                                    binary = binary / 10;
                                }
                                System.out.print("HexaDecimal value: "+toHex(decimal));
                                break;
            case 2 : System.out.print("Input a Decimal Number: ");
                     int decimal  = in.nextInt();
                     System.out.print("HexaDecimal value: "+toHex(decimal));

        }
    }
    }


```

# Explanation
In the Main method user can enter their number either in decimal or binary form.
When decimal number entered , in function toHex it will perform division and reminder is stored in a string and number is updated by dividing with 16.
When the number entered is decimal it will perform above operation with 10 and then covert to hexadecimal using toHex method.
Print the output and program terminates.


