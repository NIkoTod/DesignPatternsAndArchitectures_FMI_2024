package Product;

import Filter.CarFilter;
import Product.Utils.FloatingDot;

public class Car extends Product{

    String brand;
    FloatingDot engineVolume;
    int doorAmount;
    int year;

    public Car(String brand, FloatingDot engineVolume, int doorAmount, int year, FloatingDot price, ProductType type) {
        this.brand = brand;
        this.engineVolume = engineVolume;
        this.doorAmount = doorAmount;
        this.year = year;
        super.setPrice(price);
        super.setType(type.toString());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public FloatingDot getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(FloatingDot engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getDoorAmount() {
        return doorAmount;
    }

    public void setDoorAmount(short doorAmount) {
        this.doorAmount = doorAmount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String getStrValueByStr(String field){
        if(field.equals("brand")){return brand;}
        return super.getStrValueByStr(field);
    }

    @Override
    public Double getIntValueByStr(String field) {
        if(field.equals("engineVolume")){return (double) engineVolume.getX();}
        if(field.equals("doorAmount")){return (double) doorAmount;}
        if(field.equals("year")){return (double) year;}
        return super.getIntValueByStr(field);
    }

    @Override
    public boolean isMatchingFilter(String filter) {
        CarFilter carFilter = new CarFilter(filter);
        return carFilter.filter(this);
    }

    @Override
    public String toString() {
        return brand + " " + engineVolume.getX() + " " + doorAmount + " " + year;
    }


}
