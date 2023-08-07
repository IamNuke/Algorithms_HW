package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("enter number:");
            int num = Integer.parseInt(scan.nextLine());
            if (num <= 0){
                throw new InvalidNumberException("Incorrect number");

            }else {
                System.out.println("Number is correct!");

            }
        }catch (InvalidNumberException e){
            System.out.println("Error:" + e.getMessage());

        }
    }
}
