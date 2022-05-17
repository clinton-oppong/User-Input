import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
//                if (counter == 10) {
//                    break;
//                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }

//    Scanner scanner = new Scanner(System.in);
//    int min = 0;
//    int max = 0;
//    boolean first = true;
//        while (true) {
//        System.out.println("Enter number:");
//        boolean isAnInt = scanner.hasNextInt();
//        if (isAnInt) {
//            int number = scanner.nextInt();
//            if (number > max) {
//                max = number;
//            }
//            if (number < min) {
//                min = number;
//            }
//        } else {
//            break;
//        }
//        scanner.nextLine();
//    }

}