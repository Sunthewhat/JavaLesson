class stringLearn {
    public static void main(String[] args) {
        String s1 = "Hello this*is jerry 101 string learning";
        String s2 = "Hello";
        // System.out.println(s1.concat(s2));
        String compare = "                   A B C      ";
        char c = 'A';

        char[] s1Arr = s1.toCharArray();

        // System.out.println(s1.equals("abcd"));
        // System.out.println(s1.equalsIgnoreCase("abcd"));
        String[] s1s = s1.split("is");
        System.out.println(compare);
        System.out.println(compare.trim());
    }
}