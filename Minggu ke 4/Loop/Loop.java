package Loop;

public class Loop {

    public static void main(String[] args) {
        System.out.println("Contoh for:");
        for (int i = 1; i <= 15; i++) {
            System.out.println("Loop ke-" + i);
        }

        System.out.println("\nContoh while:");
        int a = 1;
        while (a <= 15) {
            System.out.println("Loop ke-" + a);
            a++;
        }

        System.out.println("\nContoh do-while:");
        int b = 1;
        do {
            System.out.println("Loop ke-" + b);
            b++;
        } while (b <= 15);
    }
}


