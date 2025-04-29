package ObserverPattern.New;

import ObserverPattern.New.Notifiers.EmailNotifier;
import ObserverPattern.New.Notifiers.FacebookNotifier;
import ObserverPattern.New.Notifiers.PhoneNotifier;
import ObserverPattern.New.Notifiers.YoutubeNotifier;

public class Program {
    public static void main(String[] args) {
        VideoData videoData = new VideoData();
         EmailNotifier email = new EmailNotifier (videoData);
         PhoneNotifier phone = new PhoneNotifier (videoData);
        YoutubeNotifier youtubeNotifier = new YoutubeNotifier(videoData);

        videoData.setTitle("Observer Design Pattern");

        videoData.detachObserver(youtubeNotifier);
        System.out.println("-------------------------------");
        videoData.setDescription("anh chiến đẹp traia video");


        new FacebookNotifier(videoData);
        System.out.println("-------------------------------");
        videoData.setFileName("A very good tutorial");
        videoData.detachObserver(email);
        System.out.println("-------------------------------");
        videoData.setFileName("Anh Văn chiến");

        // Trong Java, không cần Console.ReadKey(), chương trình sẽ tự kết thúc.
    }
}
