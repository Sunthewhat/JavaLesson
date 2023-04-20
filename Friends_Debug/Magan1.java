import java.util.*;

public class Magan1 {
    public static void main(String[] args) {
        System.out.println("Student 1: Enter ID, name");
        Scanner input = new Scanner(System.in);
        String convert = input.nextLine();
        String[] data1 = convert.split(" ");
        String ID1 = data1[0];
        Student student1 = new Student(data1[1] + " " + data1[2], ID1);

        System.out.println("Student 2: Enter ID, name");
        convert = input.nextLine();
        String[] data2 = convert.split(" ");
        String ID2 = data2[0];
        Student student2 = new Student(data2[1] + " " + data2[2], ID2);
        input.close();

        // if (student1.sameyear(student2) && student1.sameLevel(student2) &&
        // student1.sameFaculty(student2)) {
        // System.out.println("same year, same level, same faculty");
        // } else if ((!student1.sameyear(student2)) && (student1.sameLevel(student2))
        // && student1.sameFaculty(student2)) {
        // System.out.println("different year, same level, same faculty");
        // } else if ((student1.sameyear(student2)) && (!student1.sameLevel(student2))
        // && student1.sameFaculty(student2)) {
        // System.out.println("same year, different level, same faculty");
        // } else if ((student1.sameyear(student2)) && (student1.sameLevel(student2))
        // && (!student1.sameFaculty(student2))) {
        // System.out.println("same year, same level, different faculty");
        // } else if ((student1.sameyear(student2)) && (!student1.sameLevel(student2))
        // && (!student1.sameFaculty(student2))) {
        // System.out.println("same year, different level, different faculty");
        // } else if ((!student1.sameyear(student2)) && (student1.sameLevel(student2))
        // && (!student1.sameFaculty(student2))) {
        // System.out.println("different year, same level, different faculty");
        // } else if ((!student1.sameyear(student2)) && (!student1.sameLevel(student2))
        // && (student1.sameFaculty(student2))) {
        // System.out.println("different year, different level, same faculty");
        // } else {
        // System.out.println("different year, different level, different faculty");
        // }

        if (student1.sameyear(student2))
            System.out.print("Same year, ");
        else
            System.out.print("Different year, ");
        if (student1.sameLevel(student2))
            System.out.print("same level, ");
        else
            System.out.print("different level, ");
        if (student1.sameFaculty(student2))
            System.out.println("same faculty");
        else
            System.out.println("different faculty");
    }
}

class Student {
    private String ID;
    private String name;

    public Student(String name, String id) {
        this.name = name;
        this.ID = id;
    }

    private int getDigit(int start, int end) {
        // String num = new String();
        // for (int i = start; i < end + 1; i++) {
        // num += ID.substring(i);
        // }
        // int fin = Integer.valueOf(num);
        // return fin;
        return Integer.parseInt(ID.substring(start, end + 1));
    }

    public int getFacultyCode() {
        int facode = getDigit(8, 9);
        return facode;
    }

    public int getLevelCode() {
        int lecode = getDigit(2, 2);
        return lecode;
    }

    public int getYear() {
        int ye = getDigit(0, 1);
        return ye;
    }

    public boolean sameyear(Student student) {
        if (student.getYear() == this.getYear()) {
            return true;
        } else
            return false;
    }

    public boolean sameLevel(Student student) {
        if (student.getLevelCode() == this.getLevelCode()) {
            return true;
        } else
            return false;
    }

    public boolean sameFaculty(Student student) {
        if (student.getFacultyCode() == this.getFacultyCode()) {
            return true;
        } else
            return false;
    }
}