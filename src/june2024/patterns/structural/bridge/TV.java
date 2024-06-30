package june2024.patterns.structural.bridge;

public class TV implements Device{

    Boolean power = false;
    Integer volume = 0;
    Integer channel = 0;

    @Override
    public Boolean isEnabled() {
        return power;
    }

    @Override
    public Boolean enable() {
        power = true;
        return power;
    }

    @Override
    public Boolean disable() {
        power = false;
        return power;
    }

    @Override
    public Integer getVolume() {
        return volume;
    }

    @Override
    public Integer setVolume(Integer vol) {
        this.volume = vol;
        return volume;
    }

    @Override
    public Integer getChannel() {
        return channel;
    }

    @Override
    public Integer setChannel(Integer channel) {
        this.channel = channel;
        return channel;
    }

    @Override
    public String toString() {
        return "TV{" +
                "power=" + power +
                ", volume=" + volume +
                ", channel=" + channel +
                '}';
    }
}
