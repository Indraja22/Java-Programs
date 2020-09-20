import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth : ");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int yearOfbirth = scanner.nextInt();
            //Handle next line character (Enter Key)
            scanner.nextLine();

            System.out.println("Enter your name : ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfbirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invaild year of birth");
            }

        }else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();
    }
}
