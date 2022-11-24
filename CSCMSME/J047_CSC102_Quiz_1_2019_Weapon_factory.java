public class J047_CSC102_Quiz_1_2019_Weapon_factory {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int sw = 0, sh = 0, hm = 0 , al =0;
        al = n/21;
        n = n%21;
        sw = n/10;
        n = n%10;
        sh = n/8;
        n = n%8;
        hm = n/3;
        n = n%3;
        
        System.out.println((al+sw) + " " + (al+sh) + " " + (al+hm) + " " + n);
        sc.close();


    }
}
