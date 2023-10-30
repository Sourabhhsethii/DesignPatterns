package learning.patterns.decorator;

/**
 * Icecream is the interface implemented by Base class & Addon Classes.
 * Base Class will have two constructor, one paramaterized constructor will have parameter as Icecream ic -> interface & set the Icecream data member on the class.
 * Addon Class will only have one paramaterized constructor ->  paramaterized constructor will have parameter as Icecream ic -> set the Icecream data member on the class
 */
public interface IceCream {

    String getDesc();
    Integer getCost();
}
