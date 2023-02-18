package Homework_8;

public class Product {
    private String name;
    private double cost;

    public Product (String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public Product (String name) {
        this (name, 100);
    }

    public String getName () {
        return name;
    }

    public double getCost () {
        return cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}'+"\n";
    }
}
