/*
C13 (9313 mod 13) = 5 (Визначити ієрархію дорогоцінного та напівкоштовного каміння. Відібрати камені для намиста.
Порахувати загальну вагу (у каратах) і вартість намиста. Провести сортування каміння намиста за цінністю.
Знайти каміння в намисто, що відповідає заданому діапазону параметрів прозорості.)
 */
package Lab6;

public class Main {
    public static void main(String[] args) {
        int stones_Number = 5;
        Necklace n = new Necklace(stones_Number);
        n.addStone(new SemipreciousStones("Emerald", 6.21, 150, 9, 76));
        n.addStone(new FakeStones("Topaz", 40, 467, 7.3, 5));
        n.addStone(new PreciousStones("Diamond", 2.56, 12879, 14.5, 45));
        n.addStone(new FakeStones("Quartz", 23, 504, 9.5, 7));
        n.addStone(new SemipreciousStones("Rubin", 3.45, 174, 4, 36));
        System.out.println("Price of the necklace equals: " + n.totalPrice() + " $.");
        System.out.println("Weight of the necklace equlas: " + n.totalWeight() + " ct.");
        double start = 10;
        double finish = 500;
        Stones[] chooseOpacity = n.searchStone(start, finish);
        System.out.println("\n" + "Stones with defined opacity from " + start + " to " + finish);
        for (int i = 0; chooseOpacity[i] != null && i < chooseOpacity.length; i++) {
            System.out.println("Name: " + chooseOpacity[i].getName());
            System.out.println("Opacity of the chosen stone: " + chooseOpacity[i].getOpacity());

        }
        n.sortByPrice();
        System.out.println(n);
    }
}
