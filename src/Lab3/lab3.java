package Lab3;

/*
C3 (9313 mod 3) = 1 (StringBuffer)
C17 (9313 mod 17) = 14 (В кожному слові заданого тексту, видалити всі наступні входження першої літери цього слова.)
 */
public class lab3 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello hoHhohoH");
        char toDelete = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == toDelete || str.charAt(i) == Character.toUpperCase(toDelete) ||
                    str.charAt(i) == Character.toLowerCase(toDelete)) {
                str.deleteCharAt(i);
                i--;
            }
        }   
        System.out.println(str);
    }
}

