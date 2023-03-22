package Model;

import java.util.ArrayList;
import java.util.List;

import Controller.BeerBuilder;

public class Beer extends AlcoholDrink {
    private String name;
    private String color;
    private String type;
    private double strength;
    private double volume;
    private String country;
    private String containerType;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getStrength() {
        return strength;
    }

    public String getType() {
        return type;
    }

    public double getVolume() {
        return volume;
    }

    public String getCountry() {
        return country;
    }

    public String getContainerType() {
        return containerType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", color=" + color +
                ", strength=" + strength +
                ", volume=" + volume +
                ", country=" + country +
                ", containerType=" + containerType +
                '}';
    }

    public List<Beer> getBeerList() {
        List<Beer> beerList = new ArrayList<>();
        Beer beer1 = BeerBuilder.getInstance().setName("Hoegaarden").setColor("White").setType("Non-filtered")
                .setStrength(4.9).setCountry("Belgium").setVolume(0.33).setContainerType("Bottle").build();
        Beer beer2 = BeerBuilder.getInstance().setName("Guinnes").setColor("Dark").setType("Filtered")
                .setStrength(4.2).setCountry("Ireland").setVolume(0.44).setContainerType("Can").build();
        Beer beer3 = BeerBuilder.getInstance().setName("Chapeau Kriek").setColor("Red").setType("Fruit")
                .setStrength(3.5).setCountry("Belgium").setVolume(0.25).setContainerType("Bottle").build();

        beerList.add(beer1);
        beerList.add(beer2);
        beerList.add(beer3);

        return beerList;
    }
}
