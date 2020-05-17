package Lab4;

import java.util.Arrays;
/*
C11 (9313 mod 11) = 7 (Визначити клас спортивний інвентар, який складається як мінімум з 5-и полів.)
 */

public class Main {
    public static void main(String[] args) {
        Inventory equipment1 = new Inventory("Гантеля", 5, 50, "athletics", 2);
        Inventory equipment2 = new Inventory("Футбольний мяч", 3, 100 ,"football", 1);
        Inventory equipment3 = new Inventory("Мяч для гольфу", 1, 25, "Golf", 5);
        Inventory Array[] = {equipment1, equipment2, equipment3};
        System.out.println("\nСортування за ціною (у спадаючому порядку)");
        Arrays.sort(Array, new CompareByPrice());
        for (Inventory inventory : Array) {
            System.out.println(inventory.Price);
        }
        System.out.println("\nСортування за масою (у зростаючому порядку)");
        Arrays.sort(Array, new CompareByWeight());
        for (Inventory inventory : Array) {
            System.out.println(inventory.Weight);
        }
    }
}
