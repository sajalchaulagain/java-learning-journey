package oops.encapsulation;

class Book{
    public String title = "Seto Bagh";
}

public class publicModifierEg {
    public static void main(String[] args) {
        Book b = new Book();
        System.out.println(b.title);
    }
}
