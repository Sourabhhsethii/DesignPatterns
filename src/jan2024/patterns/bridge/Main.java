package jan2024.patterns.bridge;

public class Main {
    public static void main(String[] args) {

        Radio radio = new Radio();


        radio.on = false;
        radio.channel =1;
        radio.volume = 20;
        Remote remote = new Remote(radio);
        remote.togglePower();
        remote.volumeUp();
        System.out.println(radio.isEnabled());
        System.out.println(radio.getChannel());
        remote.volumeUp();
        remote.channelUp();
        System.out.println(radio.getChannel());
        System.out.println(radio.getVolume());

        TV tv = new TV();
        tv.on = true;
        tv.channel =20;
        tv.volume = 10;
        Remote remote1 = new Remote(tv);
        remote1.channelUp();
        remote1.volumeUp();
        System.out.println(tv.getChannel());
        System.out.println(tv.getVolume());


    }
}
