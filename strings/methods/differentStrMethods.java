package strings.methods;

public class differentStrMethods {
    public static void main(String[] args) {
        String quote = "To be or not to be";


        //    length() : This method is used to find the length of string
        System.out.println(quote.length());  //18
        System.out.println();

        //indexOf() : This method is used to return the first occurence of a specified character or text in a string.
        System.out.println(quote.indexOf("be"));  //3
        System.out.println(quote.indexOf("r"));     //7
        System.out.println();

        //toLowercase():Converts String to lower case characters.
        //toUppercase():Converts String to Upper case characters.
        String statement = "THOR: Love and Thunder";
        System.out.println(statement.toLowerCase());
        System.out.println(statement.toUpperCase());
    }
}
