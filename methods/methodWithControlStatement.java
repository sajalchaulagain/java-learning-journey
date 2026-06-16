package methods;

public class methodWithControlStatement {
    static void Details(int marks){
        if(marks < 35){
            System.out.println("Fail");
        }
        else if(marks >= 35 && marks < 65){
            System.out.println("B grade");
        }
        else if(marks >= 65 && marks < 75){
            System.out.println("A grade");
        }
        else if(marks >= 75 && marks < 100){
            System.out.println("A+ grade");
        }
        else{
            System.out.println("Invalid marks");
        }
    }

    public static void main(String[] args){
        Details(30);
        Details(90);
        Details(80);
        Details(65);
    }
}
