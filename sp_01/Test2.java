public class Test2 {
    public static void main(String[] args) {
        char a, b, c, d, e;

        a = 'A';
        System.out.printf("%c \n", a);
        System.out.printf("%d \n", (int) a);

        b = (char) ((int) a + 1);
        System.out.printf("%c \n", b);
        System.out.printf("%d \n", (int) b);
    }
}
