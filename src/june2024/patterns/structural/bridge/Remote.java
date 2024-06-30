package june2024.patterns.structural.bridge;

public class Remote {

    private Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public boolean togglePower() {
        boolean power = false;
        if(device.isEnabled()) {
            power = device.disable();
        } else {
            power = device.enable();
        }
        return power;
    }

    public Integer volumeUp(Integer vol)
    {
        Integer temp = 0;
        if(device.getVolume() < 100){
            temp = device.setVolume(vol);
        }
        return temp;
    }

    public Integer volumeDown(Integer vol)
    {
        Integer temp = 0;
        if(device.getVolume() > 0){
            temp = device.setVolume(vol);
        }
        return temp;
    }

    public Integer channelUp(Integer vol)
    {
        Integer temp = 0;
        if(device.getChannel() < 100){
            temp = device.setChannel(vol);
        }
        return temp;
    }

    public Integer channelDown(Integer vol)
    {
        Integer temp = 0;
        if(device.getChannel() > 0){
            temp = device.setChannel(vol);
        }
        return temp;
    }

    @Override
    public String toString() {
        return "Remote{" +
                "device=" + device +
                '}';
    }
}
