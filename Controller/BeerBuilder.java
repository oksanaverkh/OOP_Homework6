package Controller;

import Model.Beer;

public class BeerBuilder {
    public static BeerBuilder instance = null;
    Beer obj;

    public BeerBuilder() {

    }

    public static BeerBuilder getInstance() {
        if (instance == null)
            instance = new BeerBuilder();
        instance.obj = new Beer();

        return instance;
    }

    public BeerBuilder setName(String name) {
        obj.setName(name);
        return this;
    }

    public BeerBuilder setColor(String color) {
        obj.setColor(color);
        return this;
    }

    public BeerBuilder setType(String type) {
        obj.setType(type);
        return this;
    }

    public BeerBuilder setContainerType(String containerType) {
        obj.setContainerType(containerType);
        return this;
    }

    public BeerBuilder setStrength(double strength) {
        obj.setStrength(strength);
        return this;
    }

    public BeerBuilder setVolume(double volume) {
        obj.setVolume(volume);
        return this;
    }

    public BeerBuilder setCountry(String country) {
        obj.setCountry(country);
        return this;
    }

    public Beer build() {
        return obj;
    }

    @Override
    public String toString() {
        return "BeerBuilder{" +
                "obj=" + obj +
                '}';
    }
}
