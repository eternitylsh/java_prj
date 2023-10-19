import java.util.Scanner;

public class First {

    private static int calc(int a, int b, String _o) {
        if ("+" == _o)
            return a + b;
        if ("-" == _o)
            return a - b;
        if ("*" == _o)
            return a * b;
        if ("/" == _o)
            return a / b;
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        // a = Integer.parseInt(args[0]);
        // b = Integer.parseInt(args[1]);

        System.out.printf("숫자 1 입력 : ");
        a = sc.nextInt();
        System.out.printf("숫자 2 입력 : ");
        b = sc.nextInt();

        sc.close();

        System.out.printf("%d + %d = %d \n", a, b, calc(a, b, "+"));
        System.out.printf("%d - %d = %d \n", a, b, calc(a, b, "-"));
        System.out.printf("%d * %d = %d \n", a, b, calc(a, b, "*"));
        System.out.printf("%d / %d = %d \n", a, b, calc(a, b, "/"));
    }
}
