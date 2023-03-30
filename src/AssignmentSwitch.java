import java.util.Scanner;

public class AssignmentSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int button;
        System.out.println("Enter Switch 1/0:");
        button=input.nextInt();

        switch (button){
            case 0:
                System.out.println("False");
                break;
            case 1:
                System.out.println("True");
                break;
            default:
                System.out.println("You are press wrong button. Press 1/0");
        }
    }
}
