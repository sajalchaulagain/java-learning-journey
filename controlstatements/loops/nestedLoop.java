package controlstatements.loops;

public class nestedLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}

// A loop inside another loop
