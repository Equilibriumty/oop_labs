package Lab4;

public class Inventory {
    public String Type;
    public int Weight;
    public int Price;
    public String Sport;
    public int Amount;

    /***
     * @param t type of inventory
     * @param w weight of inventory
     * @param p price of inventory
     * @param s sport in which this inventory is used for
     * @param A amount of inventories
     */
    public Inventory (String t, int w, int p, String s, int A) {
        Type = t;
        Weight = w;
        Price = p;
        Sport = s;
        Amount = A;
    }
}

