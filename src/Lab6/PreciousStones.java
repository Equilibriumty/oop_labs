package Lab6;

public class PreciousStones extends Stones{
    private int rarity;
    PreciousStones(String name, double weight, int price, double opacity, int rarity) {
        super(name, weight, opacity, price);
        this.rarity = rarity;
    }
}
