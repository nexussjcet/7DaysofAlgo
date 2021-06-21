import java.util.Scanner;
public class PrimeChecker {

    public static void main(String[] args) {
        int temporary;
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int inputNumber = scanner.nextInt();
        scanner.close();
        if (inputNumber<=1){ //Line 1
            isPrime=false;
        }else {
            for(int i=2;i<=inputNumber/2;i++) //Line 2
            {
                temporary=inputNumber%i;
                if(temporary==0)
                {
                    isPrime=false;
                    break;
                }
            }
        }
        if (isPrime){ //Line 3
            System.out.println("True");
        }else {
            System.out.println("False");
        }
