package fundamentals;

public class Split {
    public static void main(String[] args) {

        String s = "tenis meia pé ";

        String [] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println(word3);
        System.out.println(word2);
        System.out.println(word1);

    }
}
