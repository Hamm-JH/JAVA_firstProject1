package Chapter8.Cp81_Interface;

public interface p373_RemoteControl {
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    // 추상 메소드 (메소드 선언부만 작성)
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);
}
