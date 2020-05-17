package Lab7;

public class Stones {
    private double weight, opacity;
    private int price;
    private String name;
    Stones(String name, double weight, double opacity, int price) {
        this.name = name;
        this.weight = weight;
        this.opacity = opacity;
        this.price = price;

    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public int getPrice() {
        return price;
    }
    public double getOpacity() {
        return opacity;
    }
}

