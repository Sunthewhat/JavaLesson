import java.util.*;

public class Bomb_3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int xpos;
        int ypos;
        int zpos;
        boolean field[][][] = new boolean[5][5][5];
        for (int j = 0; j < n; j++) {
            xpos = sc.nextInt();
            ypos = sc.nextInt();
            zpos = sc.nextInt();

            for (int i = 0; i < 5; i++) {
                if (field[xpos][ypos][i])
                    continue;
                count++;
                field[xpos][ypos][i] = true;
            }
            for (int i = 0; i < 5; i++) {
                if (field[xpos][i][zpos])
                    continue;
                count++;
                field[xpos][i][zpos] = true;
            }
            for (int i = 0; i < 5; i++) {
                if (field[i][ypos][zpos])
                    continue;
                count++;
                field[i][ypos][zpos] = true;
            }
        }
        System.out.println(count);
        sc.close();
    }
}