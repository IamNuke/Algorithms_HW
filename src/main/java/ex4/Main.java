package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("enter password:");
            String psw = scan.nextLine();
            PasswordVerifier pv = new PasswordVerifier();
            if (pv.PasswordIsCorrect(psw)) {
                System.out.println("Password is correct!");
            }
        }catch (IncorrectPasswordException e){
            System.out.println("Error:" + e.getMessage());

        }
    }
}
