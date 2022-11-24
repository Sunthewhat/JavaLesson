import java.util.Scanner;
import java.util.StringTokenizer;

class BasicCalculator {
    // ATTRIBUTES===============
    private double result;

    // CONSTRUCTOR===============
    public BasicCalculator() {

    }

    // METHOD====================
    public double getResult() {
        return result;
    }

    public void clear() {
        result = 0;
    }

    public void add(double input) {
        result += input;
    }

    public void substract(double input) {
        result -= input;
    }

    public void divide(double input) {
        result /= input;
    }

    public void multiply(double input) {
        result *= input;
    }
}

class calculatorOOP {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BasicCalculator cal = new BasicCalculator();
        String expression = sc.nextLine();
        StringTokenizer st = new StringTokenizer(expression);
        int count = 1;
        String operator = "";
        while (st.hasMoreTokens()) {
            // System.out.println(st.nextToken());
            if (count == 1) {
                cal.add(Double.parseDouble(st.nextToken()));
            } else {
                if (count % 2 == 1) {
                    operator = st.nextToken();
                } else {
                    switch (operator) {
                        case "+":
                            cal.add(Double.parseDouble(st.nextToken()));
                            break;
                        case "-":
                            cal.substract(Double.parseDouble(st.nextToken()));
                            break;
                        case "/":
                            cal.divide(Double.parseDouble(st.nextToken()));
                            break;
                        case "*":
                            cal.multiply(Double.parseDouble(st.nextToken()));
                            break;
                    }
                }
            }
            count++;
        }
        System.out.println(cal.getResult());
    }
}
