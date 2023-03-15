package testingacademy.maths;

import java.util.Scanner;

public class Mathdemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a = scanner.nextDouble();
        //double a = 27;
        System.out.println("Enter the value of b: ");
        double b = scanner.nextDouble();
       // double b = 32;
        System.out.println("Enter the value of z: ");
        double z = scanner.nextDouble();;
        double result = 0;

        result = Math.cbrt(Math.pow(a,2)+Math.pow(b,2)-Math.abs(z));
        System.out.println("result of the function is: " + result);
        scanner.close();
    }
}
