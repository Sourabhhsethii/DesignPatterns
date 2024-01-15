package jan2024.patterns.bridge;

public class Radio implements Device {
    boolean on;
    Integer volume;
    Integer channel;

    @Override
    public Boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        this.on = true;
    }

    @Override
    public void disable() {
        this.on = false;
    }

    @Override
    public Integer getVolume() {
        return volume;
    }

    @Override
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public Integer getChannel() {
        return channel;
    }

    @Override
    public void setChannel(Integer channel) {
        this.channel  = channel;
    }
}
