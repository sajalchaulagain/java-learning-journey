package arrays.onedimensional;

// change array elements --> the value of any element within the array can be changed by referring to its index number.

public class changeArray {
    public  static void main(String[] args) {
        // creating array objects
        String[] fruits = {"mango", "orange", "apple"};
        fruits[1]= "banana";
        System.out.println(fruits[1]);
    }
}
