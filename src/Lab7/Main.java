/*
C2 (9313 mod 2) = 1 (Set)
С3 (9313 mod 3) = 1 (Однозв'язний список)
 */
package Lab7;

public class Main {
    public static void main(String[] args) {
        StoneCollection<Stones> necklace = new StoneCollection<>();
        Stones s0 = new Stones("Emerald", 6.21, 150.0, 76);
        Stones s1 = new Stones("Topaz", 7.3, 467.0, 40);
        Stones s2 = new Stones("Rubin", 3.45, 174.0, 36);
        Stones s3 = new Stones("Diamond", 2.56, 14.5, 12879);
        Stones s4 = new Stones("Quartz", 9.5, 504.0, 23);
        Stones s5 = new Stones("Agate", 5.89, 200.0, 10);
        necklace.add(s0);
        necklace.add(s2);
        necklace.add(s3);
        necklace.add(s1);
        necklace.remove(s2);
        StoneCollection<Stones> necklace1 = new StoneCollection<>();
        necklace1.add(s4);
        necklace1.add(s5);
        necklace1.add(s5);
        necklace.addAll(necklace1);
        Object[] mas = necklace.toArray();
            for (Object object : mas) {
                Stones s = (Stones) object;
                System.out.println(s.getName());
        }
    }
}
