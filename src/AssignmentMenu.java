import java.util.Scanner;

public class AssignmentMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter 0 for Exit: ");
            System.out.println("Enter 1 for File: ");
            System.out.println("Enter 2 for Edit: ");
            System.out.println("Enter 3 for Format: ");
            System.out.println("Enter your choice (0-3): ");

            choice = input.nextInt();

            switch (choice) {
                case 0->
                    System.out.println("Exit");

                case 1->
                    System.out.println("File");

                case 2->
                    System.out.println("Edit");

                case 3->
                    System.out.println("Format");

                case 4->
                    System.out.println("Invalid choice");

                default->
                    System.out.println("Invalid");
            }


        }
        while(choice != 0);
//        System.out.println("At last: ");


    }
}
