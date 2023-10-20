import java.util.Scanner;

public class Test1 {

    private static char Getascii(int __num) {
        return (char) __num;
    }

    public static void main(String[] args) {

        // System.out.printf("안녕하세요!");
        // System.out.println("안녕하세요!");
        // System.out.print("안녕하세요!");
        // System.out.print("안녕하세요!");

        // System.out.printf("%d %d\\n" + //
        // "", 100, 200);
        // System.out.printf("\n, 100, %s \n", "100\t".getClass());

        // Integer a, b;
        // a = 10;
        // b = 20;
        // Integer c = a + b;
        // System.out.printf("%d + %d = %d", a, b, c);
        // System.out.printf("\n");
        // System.out.printf("100 + 100");
        // System.out.printf("\n");

        // // 자릿수 맞춘 출력.
        // System.out.printf("%d \n", 123);
        // System.out.printf("%5d \n", 123);
        // System.out.printf("%5d \n", 123456);
        // System.out.printf("%05d \n", 123);
        // System.out.printf("%f \n", 123.45);
        // System.out.printf("%5.2f \n", 123.45);
        // System.out.printf("%7.1f \n", 123.45678);

        // // 문자열..

        // System.out.printf("줄 바꿈\n연습\n");
        // System.out.printf("탭\t연습\n");
        // System.out.printf("\"쌍따옴표\" 연습\n");

        int a = 10;
        byte bt = 10;
        short sh = 10;
        long lo = 10;

        Integer i = 1;

        char c = 'c';
        boolean b = true;
        float f = 3.14f;
        double d = 2.5555555;

        System.out.println("%d".formatted(a));
        System.out.println("%d".formatted(bt));
        System.out.println("%d".formatted(sh));
        System.out.println("%d".formatted(lo));

        System.out.printf("%s\n", i.getClass());

        System.out.printf("%c \n", c);
        System.out.printf("%b \n", b);
        System.out.printf("%f \n", f);
        System.out.printf("%f \n", d);

        int i1 = 0;
        // Integer I1 = new Integer(null);

        String str = new String("abc");
        // str.concat(str.format("%d", 111));
        System.out.printf("%s\n", str);

        // char ch = '\u004A';
        char ch = 66;
        System.out.printf("%c\n", ch);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.printf("아스키 10진수로 입력해보자 : ");
        ch = Getascii(sc.nextInt());
        sc.close();
        System.out.printf("%c\n", ch);
    }
    // void main() {
    // System.out.printf("안녕하세요!");
    // System.out.println("안녕하세요!");
    // System.out.print("안녕하세요!");
    // System.out.print("안녕하세요!");
    // }
}
