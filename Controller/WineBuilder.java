package Controller;

import Model.Wine;

public class WineBuilder {
    public static WineBuilder instance = null;
    Wine obj;

    public WineBuilder() {

    }

    public static WineBuilder getInstance() {
        if (instance == null)
            instance = new WineBuilder();
        instance.obj = new Wine();

        return instance;
    }

    public WineBuilder setName(String name) {
        obj.setName(name);
        return this;
    }

    public WineBuilder setColor(String color) {
        obj.setColor(color);
        return this;
    }

    public WineBuilder setYear(int year) {
        obj.setYear(year);
        return this;
    }

    public WineBuilder setSugar(String sugar) {
        obj.setSugar(sugar);
        return this;
    }

    public WineBuilder setStrength(double strength) {
        obj.setStrength(strength);
        return this;
    }

    public WineBuilder setVolume(double volume) {
        obj.setVolume(volume);
        return this;
    }

    public WineBuilder setCountry(String country) {
        obj.setCountry(country);
        return this;
    }

    public Wine build() {
        return obj;
    }

    @Override
    public String toString() {
        return "WineBuilder{" +
                "obj=" + obj +
                '}';
    }
}
