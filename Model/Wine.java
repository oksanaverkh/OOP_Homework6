package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Controller.WineBuilder;

public class Wine extends AlcoholDrink {
    private String name;
    private String color;
    private String sugar;
    private double strength;
    private double volume;
    private String country;
    private int year;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getStrength() {
        return strength;
    }

    public String getSugar() {
        return sugar;
    }

    public double getVolume() {
        return volume;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", sugar=" + sugar +
                ", strength=" + strength +
                ", volume=" + volume +
                ", country=" + country +
                ", year=" + year +
                '}';
    }

    public List<Wine> getWineList() {
        List<Wine> wineList = new ArrayList<>();
        Wine wine1 = WineBuilder.getInstance().setName("Veuve Clicquot").setColor("Rose").setSugar("Brut")
                .setStrength(12.5).setCountry("France").setYear(2012).setVolume(0.75).build();
        Wine wine2 = WineBuilder.getInstance().setName("Pinot Grigio").setColor("White").setSugar("Dry")
                .setStrength(12.0).setCountry("Italy").setYear(2021).setVolume(0.75).build();
        Wine wine3 = WineBuilder.getInstance().setName("Chianti").setColor("Red").setSugar("Dry")
                .setStrength(13.5).setCountry("Italy").setYear(2020).setVolume(0.75).build();

        wineList.add(wine1);
        wineList.add(wine2);
        wineList.add(wine3);

        return wineList;
    }
}
