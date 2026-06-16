package oops.class_object;


/*Youtube channel example
*
* real life : name & subscriber*/

class YouTubeChannel{
    String channelName;
    int subscribers;

    void uploadVideo(){
        System.out.println(channelName + " uploaded a video.");
    }
}
public class Example3 {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();
        channel.channelName = "Mr. Chaule";
        channel.subscribers = 40;

        channel.uploadVideo();
    }
}
