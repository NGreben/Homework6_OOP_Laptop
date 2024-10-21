package Homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Laptop {
    // поля класса - СОСТОЯНИЕ
    protected double price;
    public String color;
    public String os;

    public Laptop(double price, String color, String os) {
        this.price = price;
        this.color = color;
        this.os = os;
    }

    // // методы - ПОВЕДЕНИЕ

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLaptopType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getLaptopType() + " {" + "price=" + price + ", color='" + color + ", OS=" + os + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(price, laptop.price) == 0 && Objects.equals(color, laptop.color)
                && Objects.equals(os, laptop.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }
}
