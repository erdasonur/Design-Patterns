public class AdapterPattern {
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("Mp3", "alone.mp3");
        audioPlayer.play("Vlc", "alone.vlc");
        audioPlayer.play("Mp4", "alone.mp4");
        audioPlayer.play("Avi", "alone.avi");
    }
}
