import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//# to request a user input

        System.out.println("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int year0fBirth = scanner.nextInt();
            scanner.nextLine();//# need to handle next line character i.e.(enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2022 - year0fBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is" + name + ", and you are " + age + " old");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Invalid");
        }

        scanner.close();
    }
}