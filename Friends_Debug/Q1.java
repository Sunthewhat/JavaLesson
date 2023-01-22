import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Student 1: Enter ID, birthday, name");
        int id = sc.nextInt();
        int day = sc.nextInt();
        int month = sc.nextInt() - 1;
        int year = sc.nextInt();
        String fname = sc.next();
        String lname = sc.next();
        GregorianCalendar student1BD = new GregorianCalendar(year, month, day);
        Student stu1 = new Student(fname + " " + lname, id, student1BD);

        System.out.println("Student 2: Enter ID, name");
        int id2 = sc.nextInt();
        String fname2 = sc.next();
        String lname2 = sc.next();
        Student stu2 = new Student(fname + " " + lname, id2);

        System.out.println("Student 1: " + stu1.getId() + " " + stu1.getName() + " " + stu1.getAge());
        System.out.println("Student 2: " + stu2.getId() + " " + stu2.getName() + " " + stu2.getAge());

        System.out.println(stu1.equals(stu2) ? "Same" : "not same");

        System.out.println("Enter birthday for Student 2");
        int st2d = sc.nextInt();
        int st2m = sc.nextInt();
        int st2y = sc.nextInt();
        GregorianCalendar st2BD = new GregorianCalendar(st2y, st2m, st2d);
        stu2.setBD(st2BD);

        System.out.println("Student 1: " + stu1.getId() + " " + stu1.getName() + " " + stu1.getAge());
        System.out.println("Student 2: " + stu2.getId() + " " + stu2.getName() + " " + stu2.getAge());

        System.out.println(stu1.equals(stu2) ? "Same" : "not same");
        sc.close();
    }
}

class Student {
    // Atributes
    private String name;
    private int id;
    private GregorianCalendar BD;

    // Constructors
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        BD = new GregorianCalendar();
    }

    public Student(String name, int id, GregorianCalendar BD) {
        this.name = name;
        this.id = id;
        this.BD = BD;
    }

    // Methods
    public void setBD(GregorianCalendar BD) {
        this.BD = BD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GregorianCalendar getBD() {
        return BD;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        GregorianCalendar present = new GregorianCalendar();
        return present.get(Calendar.YEAR) - BD.get(Calendar.YEAR);
    }

    public int daysToYears(int days) {
        return days / 365;
    }

    public boolean equals(Student st) {
        return this.name.equals(st.getName()) &&
                this.id == st.getId() &&
                dateEquals(st.getBD())
                        ? true
                        : false;
    }

    public boolean dateEquals(GregorianCalendar BD) {
        return this.BD.get(Calendar.YEAR) == BD.get(Calendar.YEAR)
                && this.BD.get(Calendar.MONTH) == BD.get(Calendar.MONTH)
                && this.BD.get(Calendar.DATE) == BD.get(Calendar.DATE)
                        ? true
                        : false;
    }

    public String toString() {
        return name + Integer.toString(id) + Integer.toString(BD.get(Calendar.DATE)) +
                Integer.toString(BD.get(Calendar.MONTH)) +
                Integer.toString(BD.get(Calendar.YEAR));
    }
}