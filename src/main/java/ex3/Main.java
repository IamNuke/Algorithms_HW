package ex3;

import ex2.InvalidNumberException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("enter first number:");
            int num1 = Integer.parseInt(scan.nextLine());
            System.out.print("enter second number:");
            int num2 = Integer.parseInt(scan.nextLine());
            if (num2 == 0){
                throw new DivisionByZeroException("Division by zero not supported!");

            }else {
                System.out.println("Result: " + num1/num2);

            }
        }catch (DivisionByZeroException e){
            System.out.println("Error:" + e.getMessage());

        }
    }
}
