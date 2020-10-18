public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equals("Vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }
        else if(audioType.equals("Mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("Vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }
        else if(audioType.equals("Mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
