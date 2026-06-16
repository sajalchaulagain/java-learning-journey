package oops.class_object;


/*Cricketer player Example:
* --> players have : name, runs*/

class Player{
    String name;
    int runs;

    void showScore(){
        System.out.println(name + " scored "+ runs + " runs.");
    }
}


public class Example4 {
    public static void main(String[] args) {

        Player p1 = new Player();
        p1.name = "Rohit";
        p1.runs = 264;

        p1.showScore();
    }
}

