package Lab6;

public class SemipreciousStones extends Stones{
        private int durability;
        SemipreciousStones(String name, double weight, double opacity, int durability, int price) {
            super(name, weight, opacity, price);
            this.durability = durability;
        }
}
