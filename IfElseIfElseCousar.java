
/*
 * If-Else If-Else
 
 * 1. Test if an integer input from the keyboard is odd or even; modulus is a great
choice to use for this.
 * 
 *     Sample Run 1:
 *        Enter a Number:
 *        78
 *        Even
 * 
 *     Sample Run 2:
 *        Enter a Number:
 *        17
 *        Odd
 * 
 * 2. Ask the user to input the number of wheels. Based on their input, print out 
what type of vehicle it is.
 * Please include at least 3 vehicles and use a range of wheels using &&, and a 
choice of either set of wheels using ||
 * If they do not choose a number you have, give them a catch all answer using 
else.
 *    
 *    Sample Run 1: 
         Enter number of wheels:
         2
         Bike
         
      Sample Run 2:
         Enter number of wheels:
         18
         Tractor trailer
         
      Sample Run 3:
         Enter number of wheels:
         0 //not in the code selection
         Hoverboard
 */
import java.util.Scanner;

class IfElseIfElseCousar {
    public static void main(String[] args) {

        ///////////////////// PART1/////////////////////////////

        // Scanner
        Scanner scan = new Scanner(System.in);

        // Input: firstNum is the variable
        System.out.println("\n\n Please enter a number here: \n");
        Integer firstNum = scan.nextInt();

        // If-else statement
        if (firstNum % 2 == 0) {
            System.out.println(firstNum + " is Even");
        } else {
            System.out.println(firstNum + " is Odd");
        }

        ///////////////////// PART2/////////////////////////////

        // Input: wheelCount is the variable
        System.out.println("\n\n How many wheels does your vehicle have: \n");
        Integer wheelCount = scan.nextInt();
        // Code here
        if (wheelCount <= 0) {
            System.out.println(" You have a Hoverboard");
        }
        if (wheelCount > 0 && wheelCount <= 1) {
            System.out.println("You have a Unicycle");
            System.out.println("Please...");
            System.out.println("Sell it");
        }
        if (wheelCount == 2 || wheelCount == 3) {
            System.out.println("You have a motorcycle");
        }
        if (wheelCount == 4) {
            System.out.println("You have a car");
        }
        if (wheelCount == 8 || wheelCount == 12 || wheelCount == 18) {
            System.out.println("I hope you have your CDLs for your commerical truck");
        }
        if (wheelCount >= 3 && wheelCount % 2 != 0) {
            System.out.println("You either have a spaceship or a weird truck because " + wheelCount
                    + " is a strange number for a vehicle");
        }

        scan.close();
    }// end of main

}// eoc