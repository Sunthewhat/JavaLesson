public class J077_Coin_Change {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int prz = sc.nextInt();
        int mon = sc.nextInt();
        mon -= prz;
        if (mon < 0)
            System.out.println("Not enough money.");
        else if (mon == 0)
            System.out.println("No change for you.");
        else {
            System.out.println("Change: " + mon);
            System.out.println("1000THB: " + mon / 1000);
            while (mon >= 1000)
                mon -= 1000;
            System.out.println("500THB: " + mon / 500);
            while (mon >= 500)
                mon -= 500;
            System.out.println("100THB: " + mon / 100);
            while (mon >= 100)
                mon -= 100;
            System.out.println("50THB: " + mon / 50);
            while (mon >= 50)
                mon -= 50;
            System.out.println("20THB: " + mon / 20);
            while (mon >= 20)
                mon -= 20;
            System.out.println("10THB: " + mon / 10);
            while (mon >= 10)
                mon -= 10;
            System.out.println("5THB: " + mon / 5);
            while (mon >= 5)
                mon -= 5;
            System.out.println("2THB: " + mon / 2);
            while (mon >= 2)
                mon -= 2;
            System.out.println("1THB: " + mon);
        }
        sc.close();
    }
}
