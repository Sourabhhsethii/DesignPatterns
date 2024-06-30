package june2024.patterns.structural.bridge;

public class Client {
    public static void main(String[] args) {

        Device device = new TV();

        Remote remote = new Remote(device);
        remote.togglePower();
        System.out.println(remote);
        remote.togglePower();
        System.out.println(remote);
        remote.togglePower();
        if(device.isEnabled()){
            remote.volumeUp(50);
            remote.volumeDown(30);
        }

        if(device.isEnabled()){
            remote.channelUp(50);
            remote.channelDown(30);
        }

        System.out.println(device);
        System.out.println(remote);

        Device device2 = new Radio();
        Remote remote2 = new Remote(device2);
        System.out.println(device2);
        System.out.println(remote2);
    }
}
