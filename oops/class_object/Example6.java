package oops.class_object;


//Instagram post Example

class Post{
    String caption;
    int likes;

    void showPost(){
        System.out.println(caption);
        System.out.println("Likes: "+likes);
    }
}


public class Example6 {
    public static void main(String[] args) {
        Post p = new Post();

        p.caption = "Hello Beaytiful girl. ";
        p.likes = 1000;

        p.showPost();
    }
}
