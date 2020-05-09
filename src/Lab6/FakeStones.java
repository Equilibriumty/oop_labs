package Lab6;

public class FakeStones extends Stones{
    private double defectsNumber;
    FakeStones(String name, int price, double opacity, double weight, double defectsNumber) {
        super(name, weight, opacity, price);
        this.defectsNumber = defectsNumber;
    }
}
