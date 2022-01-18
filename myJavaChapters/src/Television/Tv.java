package Television;

public class Tv {
    private String onButton;
    private String offButton;
    private String volumeUpButton;
    private String volumeDownButton;
    private String changeChannelButton;

    public Tv(String TvOn, String TvOff, String volumeIncreased, String volumeDecreased, String channelChange) {
        this.onButton = TvOn;
        this.offButton = TvOff;
        this.volumeUpButton = volumeIncreased;
        this.volumeDownButton = volumeDecreased;
        this.changeChannelButton = channelChange;
    }

    public String getTvOnStatus() {
        return onButton;
    }

    public String getTvOffStatus() {
        return offButton;
    }
    public String getVolumeUpStatus(){
        return volumeUpButton;
    }

    public String getVolumeDownStatus() {
        return volumeDownButton;
    }


//    public int getVolumeUpStatus(int input) {
//        input = input++;
//        return input;
//    }
}
