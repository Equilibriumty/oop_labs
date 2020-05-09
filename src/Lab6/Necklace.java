package Lab6;

import java.util.Arrays;

public class Necklace {
    private Stones[] stone;
    Necklace(int number) {
        stone = new Stones[number];
    }
    void addStone(Stones stn) {
        int n = 0;
        boolean t = true;
        for (int i = 0; (i < stone.length)&&t; i++) {
            if (stone[i] == null) {
                n = i;
                t = false;

            }
        }
            if (n != stone.length) {
                stone[n] = stn;
        }
    }
    public int totalPrice() {
        int total_Price = 0;
        for (int i = 0; i < stone.length; i++) {
            total_Price += stone[i].getPrice();
        } return total_Price;
    }
    public double totalWeight() {
        double total_weight = 0;
        for (int i = 0; i < stone.length; i++) {
            total_weight += stone[i].getWeight();
        } return total_weight;
    }
    public void sortByPrice() {
        Arrays.sort(stone, new Sort());
    }
    public Stones[] searchStone(double startpoint, double finishpoint) {
        Stones[] stn = new Stones[stone.length];
        int n = 0;
        for (int i = 0; i < stone.length; i++) {
            if(stone[i].getOpacity() >= startpoint && stone[i].getOpacity() <= finishpoint) {
                stn[n] = stone[i];
                n++;
            }
        } return stn;
    }
    @Override
    public String toString() {
        String s = '\n' + "Stones sorted by price: ";
        for (int i = 0; i < stone.length; i++) {
            s += "\n" + "Name: " + stone[i].getName() + "\n"+"Price: " + stone[i].getPrice();
        }  return s;
    }
}
