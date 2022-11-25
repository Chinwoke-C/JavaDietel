package ObjectOriented;

public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV(){
    }

    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void validateChannel(int newChannel) {
        boolean channelIsValid = on && newChannel >= 1 && newChannel <= 120;
        if (channelIsValid) {
            channel = newChannel;
        }
    }

    public void validateVolume(int newVolumeLevel){
        boolean volumeIsValid = on && newVolumeLevel >=1 && newVolumeLevel <=7;
        if (volumeIsValid){
            volumeLevel = newVolumeLevel;
        }
    }
    public void channelUp(){
        if (on && channel < 120){
            channel++;
        }
    }
    public void channelDown(){
        if (on && channel > 1){
            channel--;
        }
    }
    public void increaseVolume(){
        if (on && volumeLevel < 7);
        volumeLevel++;
    }
    public void decreaseVolume(){
        if (on && volumeLevel > 1);
        volumeLevel--;
    }
}
