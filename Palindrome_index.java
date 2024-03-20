public class Main {
    public static void main(String[] args) {
        String[] str = {"abc", "aba", "aaaa", "cbc"};
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("a")) {
                System.out.print(i+" ");
            }
        }
    }
}