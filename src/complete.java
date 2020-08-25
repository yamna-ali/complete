import java.util.Scanner;

public class complete {

    public static void main(String[] args){
/*
The code below determines if the pre-set number is a positive or negative number.

Edit the application to prompt an integer user input, and state if the number entered is greater than 10, less than 10, or is equal to 10.

Use if, else if, else statements.
 */
        Scanner keybd = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = keybd.nextInt();
                int num = 10;


                if (number > num) {
                    System.out.println("Number is greater than "+ num );
                }
                else if(number < num) {
                    System.out.println("Number is less than "+ num);
                }
else{
                System.out.println("Number is equal to 10. " + num);
            }



















    }}


