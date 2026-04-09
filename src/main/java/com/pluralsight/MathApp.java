package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //Question 1:
        // Create salary variables
        double bobSalary= 10000;
        double garySalary= 12000;

        // Find highest salary using Math.max()
        double highestSalary = Math.max(bobSalary, garySalary);

        // Print result
        System.out.println("The highest salary is $" + highestSalary);

        //Question 2:

        // Create variables
        double carPrice=20000;
        double truckPrice=30000;

        // Find smallest price using Math.min()
        double lowestPrice = Math.min(carPrice, truckPrice);

        // Print result
        System.out.println("The lowest price is $" + lowestPrice);

        //Question 3:

        // Set variable
        double radius= 7.25;
        // Find Circle Area
        double area= Math.PI * Math.pow(radius, 2);
        //Using %.2f for a 2 digit output after point and using printf which understand it where println don't understand it
        System.out.printf("Area of circle is: %.2f\n", area);

        //Question 4:

        // Set variable
        double number = 5.0;

        // Find square root
        double result = Math.sqrt(number);

        // Print result
        System.out.printf("The square root is: %.2f\n", result);

        //Question 5:

        // Set variable

        double x1=5;
        double y1=10;
        double x2=85;
        double y2=50;

        // distance between 2 point is distance=root((x2-x1)^2+(y2-y1)^2)

        double distance= Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));

        // Print result
        System.out.printf("Distance between 2 points is: %.2f\n", distance);

        //Question 6:

        // Set variable
        double number_for_Q6 = -3.8;

        // Get absolute value
        double result_for_Q6 = Math.abs(number_for_Q6);

        // Print result
        System.out.println("The absolute value is: " + result_for_Q6);

        // Question 7:

        //random number between 0 and 1
        int random_number= (int)(Math.random() * 2);

        //Print Result
        System.out.println("The Random number between 0 and 1 is: " + random_number);

        //Question 8:

        int day=24;
        int hours=day*24;
        int minutes=hours*60;
        int second= minutes*60;
        long milli_second=(long)second*1000;

        //print result

        System.out.println("In 24 days there are "+ minutes +" minutes and "+ milli_second + " milliseconds");






    }
}
