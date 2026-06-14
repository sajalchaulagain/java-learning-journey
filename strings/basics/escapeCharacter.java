package strings.basics;

public class escapeCharacter {
    public static void main(String[] args) {

        //Try running this code..
//        System.out.println("He said, "I believe that the earth is flat. "");        //--> show error
        /* As we can see, the code gives an error.
        * This is because the compiler assumes that the string ends after the 2nd quotion mark.
        * So this problem can be solved by using \(backshash).
        * Backslash acts as an escape character allowing us to use quotation marks in strings. */


        System.out.println("He said, \"I believe that the earth is flat\".");
        System.out.println("She said, \"But the Earth is Spherical\".");

        System.out.println();

        /* Similarly, to use a backslash in the string we must escape it with anothe backslash.*/
        System.out.println("The path is D:\\Docs\\Java\\strings.");


        System.out.println();

        /*we also have an escape character for printing on a new line (\n), inserting a tab (\t), backspacing (\b), etc...*/

        System.out.println("My name is Sajal. \n I'm a IT Student at Texas college of Management & IT.");

        System.out.println();

        System.out.println("Age :\t 20 years old.");
        System.out.println("Address \b : Dolakha");
    }
}
