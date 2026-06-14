package controlstatements.switchcase;
import java.util.Scanner;

//Day of week system.


public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day number (1-7) : ");
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Day 1: Sunday");
                break;

                case 2:
                    System.out.println("Day 2: Monday");
                    break;

                    case 3:
                    System.out.println("Day 3: Tuesday");
                    break;

                    case 4:
                    System.out.println("Day 4: Wednesday");
                    break;

                    case 5:
                    System.out.println("Day 5: Thursday");
                    break;

                    case 6:
                    System.out.println("Day 6: Friday");
                    break;

                    case 7:
                    System.out.println("Day 7: Saturday");
                    break;

            default:
                System.out.println("Invalid day number");

        }

        sc.close();
    }
}
