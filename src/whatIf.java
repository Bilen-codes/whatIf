/*          pesudo code
* 1, Ask the user to enter two numbers
* 2, compute to find the sum of the two numbers by adding them.
* 3, if the sum is more than 200 and the addString to have * next to it using concatination.
* 4, else addString should be set to be just the sum number.
* 5, if the sum is again less than 100 then add a ~ next to the addString.
* 6, find the average of the two numbers by dividing by 2.
* 7, find the product of the two numbers by multiplying
* 8, display the final string of output.
* 9. End the program and say "good bye".
* */

import java.util.Scanner;
public class whatIf {
        public static void main(String[] args) {
            int num1, num2;
            int sum;
            String sumStr;
            double average;
            int product;
            String proStr;

            Scanner keyboard = new Scanner(System.in);

            System.out.print("First number? : ");
            num1 = keyboard.nextInt();

            System.out.print("Second number? : ");
            num2 = keyboard.nextInt();
             sum = num1+num2;
             if (sum > 200){
                 sumStr = sum + "*";
             }
             else {
                 sumStr = sum + " ";}

             //the average
             average = sum / 2;

             //the sum
            if (sum < 1000){
                sumStr  = sumStr + "~";
            }

            //the product
            product = num1 * num2;

            System.out.println("The sum of the two numbers is: " + sumStr +"\n Product is " + product + "\n The average is : " + average);


        }

    }