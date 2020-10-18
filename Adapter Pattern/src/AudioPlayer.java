

public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("Mp3")){
            System.out.println("Playing Mp3 music");
        }
        else if(audioType.equals("Vlc") || audioType.equals("Mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }
        else
        {
            System.out.println("Invalid media " + audioType + " isn't supported");
        }
    }
}
