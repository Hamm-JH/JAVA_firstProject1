package Chapter8.Cp81_Interface;

public class p374_Television implements p373_RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>p373_RemoteControl.MAX_VOLUME) {
            this.volume = p373_RemoteControl.MAX_VOLUME;
        } else if (volume<p373_RemoteControl.MIN_VOLUME) {
            this.volume = p373_RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}
