package strings.basics;


/* Concatenation between two strings in Java is done using the '+' Operator. */


public class ConcatenateString {
    public static void main(String[] args) {
        String fname, lname;
        fname = "Rohit ";
        lname = "Sharma";
        System.out.println(fname + " " + lname);

        /* Alternatively, we can use the concat() method to concatenate two strings. */

        System.out.println(fname.concat(lname));
    }
}


/* Question: What if we concatenate a string with a integer?
* Answer: Concatenating a string and a integer will result in a string. */




