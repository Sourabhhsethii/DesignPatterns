package june2024.patterns.structural.bridge;

public interface Device {
    Boolean isEnabled();
    Boolean enable();
    Boolean disable();
    Integer getVolume();
    Integer setVolume(Integer vol);
    Integer getChannel();
    Integer setChannel(Integer channel);
}
