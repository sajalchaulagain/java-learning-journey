package basics.inputoutput;
import java.util.Scanner; //--> this is necessary for taking input

public class inputOutputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name : ");
        String name = sc.nextLine();            // nextLine() used to read line

        System.out.println("Enter Roll : ");
        int Roll = sc.nextInt();                // nextInt() used to read int

        System.out.println("Enter Marks : ");
        double Marks = sc.nextDouble();            // nextDouble() used to read double

        System.out.println("Enter Grade : ");
        char Grade = sc.next().charAt(0);           // next().charAt(0) used to read till space


        System.out.println("Name : " + name);
        System.out.println("Roll : " + Roll);
        System.out.println("Marks : " + Marks);
        System.out.println("Grade : " + Grade);

        sc.close();
    }
}
