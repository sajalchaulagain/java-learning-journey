package CollegeAssignmentExamples.stringBuffer;

public class foodOrder {
    public static void main(String[] args) {
        StringBuffer order = new StringBuffer("Order : Pizza");

        order.append(", Burger");
        order.append(", Coffee");

        System.out.println(order);
    }
}
