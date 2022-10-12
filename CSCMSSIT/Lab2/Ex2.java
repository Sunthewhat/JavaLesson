public class Ex2 {
    public static void main(String[] args) {
        String st1 = new String("Hello");
        String st2 = "Programming";
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st2.length());
        System.out.println(st2.charAt(3));
        System.out.println(st2.concat(st1));
        System.out.println(st2.indexOf("a"));
        System.out.println(st2.indexOf("m", 7));
        System.out.println(st2.substring(3));
        System.out.println(st2.substring(3, 6));
    }
}
