import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] field = new boolean[10][10];
        int q = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < q; i++) {
            int xpos = sc.nextInt();
            int ypos = sc.nextInt();
            if (field[xpos][ypos] == false) {
                field[xpos][ypos] = true;
                cnt++;
            }
            if (xpos - 1 >= 0) {

                if (field[xpos - 1][ypos] == false) {
                    field[xpos - 1][ypos] = true;
                    cnt++;
                }
            }
            if (xpos + 1 <= 9) {

                if (field[xpos + 1][ypos] == false) {
                    field[xpos + 1][ypos] = true;
                    cnt++;
                }
            }
            if (ypos - 1 >= 0) {

                if (field[xpos][ypos - 1] == false) {
                    field[xpos][ypos - 1] = true;
                    cnt++;
                }
            }
            if (ypos + 1 <= 9) {

                if (field[xpos][ypos + 1] == false) {
                    field[xpos][ypos + 1] = true;
                    cnt++;
                }
            }
            if (xpos + 1 <= 9 && ypos + 1 <= 9) {

                if (field[xpos + 1][ypos + 1] == false) {
                    field[xpos + 1][ypos + 1] = true;
                    cnt++;
                }
            }
            if (xpos + 1 <= 9 && ypos - 1 >= 0) {

                if (field[xpos + 1][ypos - 1] == false) {
                    field[xpos + 1][ypos - 1] = true;
                    cnt++;
                }
            }
            if (xpos - 1 >= 0 && ypos + 1 <= 9) {

                if (field[xpos - 1][ypos + 1] == false) {
                    field[xpos - 1][ypos + 1] = true;
                    cnt++;
                }
            }
            if (xpos - 1 >= 0 && ypos - 1 >= 0) {

                if (field[xpos - 1][ypos - 1] == false) {
                    field[xpos - 1][ypos - 1] = true;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}