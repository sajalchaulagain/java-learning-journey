package CollegeAssignmentExamples.StringTokenizer;

import java.util.StringTokenizer;

public class shoppingItems {
    public static void main(String[] args) {
        String items = "Laptop,Mouse,Keyboard,Headphones";
        StringTokenizer st = new StringTokenizer(items, ",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
