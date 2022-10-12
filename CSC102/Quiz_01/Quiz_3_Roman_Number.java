public class Quiz_3_Roman_Number {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'I') {
                if (i + 1 != A.length()) {
                    if (A.charAt(i + 1) == 'V') {
                        sum += 4;
                        i++;
                    } else if (A.charAt(i + 1) == 'X') {
                        sum += 9;
                        i++;
                    } else
                        sum += 1;
                } else
                    sum += 1;
            } else if (A.charAt(i) == 'V')
                sum += 5;
            else if (A.charAt(i) == 'X') {
                sum += 10;
                if (i + 1 != A.length()) {
                    if (A.charAt(i + 1) == 'L') {
                        sum += 30;
                        i++;
                    } else if (A.charAt(i + 1) == 'C') {
                        sum += 80;
                        i++;
                    }
                }
            } else if (A.charAt(i) == 'L')
                sum += 50;
            else if (A.charAt(i) == 'C') {
                sum += 100;
                if (i + 1 != A.length()) {
                    if (A.charAt(i + 1) == 'D') {
                        sum += 300;
                        i++;
                    } else if (A.charAt(i + 1) == 'M') {
                        sum += 800;
                        i++;
                    }
                }
            } else if (A.charAt(i) == 'D')
                sum += 500;
            else if (A.charAt(i) == 'M')
                sum += 1000;
        }
        System.out.println(sum);
        sc.close();
    }
}