package Lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.println("Input some text: ");
        String string1 = string.next();
        Text text1 = new Text(string1);
        System.out.println("Your modified text: " + Text.my_permutation(string1));

    }
}
