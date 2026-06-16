package oops.class_object;


//Class methods
/*--> In java we have public and static methods. So what is the Difference between them?
* --> Public methods are accessed by making objects of the class whereas
* Static methods do not need objects to be accessed, we can directly access static methods. */


import java.util.Arrays;

public class classMethodExample {

    //public method

    public void fruits(){
        String fruits[] = {"Apple", "Mango", "Banana", "Strawberry"};
        System.out.println("Fruits : ");
        for(int i = 0; i<fruits.length; i++){
            System.out.println(fruits[i]);
        }
    }


    //static method

    static void vegetables(){
        String vegies[] = {"onion", "potato", "carrot", "Radish"};
        System.out.println("Vegetables : ");

        for(int i = 0; i<vegies.length; i++){
            System.out.println(vegies[i]);
        }
    }


    public static void main(String[] args) {
        classMethodExample obj = new classMethodExample();
        obj.fruits();

        System.out.println();

        vegetables();
    }
}
