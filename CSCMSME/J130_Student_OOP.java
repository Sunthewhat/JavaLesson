class Student {
    int id;
    String Name;
    char Gender;
    int Score;

    public Student(int id, String Name, char Gender, int Score) {
        this.id = id;
        this.Name = Name;
        this.Gender = Gender;
        this.Score = Score;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public char getGender() {
        return Gender;
    }

    public char calGPA() {
        if (Score >= 80)
            return 'A';
        else if (Score >= 70)
            return 'B';
        else if (Score >= 60)
            return 'C';
        else if (Score >= 50)
            return 'D';
        else
            return 'F';
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }
}

public class J130_Student_OOP {
    public static void main(String[] args) {
        // DO NOT MODIFY THE DRIVER CLASS
        Student boy = new Student(1133, "Thanaphon", 'M', 73);
        Student c = new Student(1130, "Sethanant", 'M', 60);
        boy.setName("Thanaphon Sombunkaeo");

        System.out.println(boy.getName());
        System.out.println(boy.getGender());
        System.out.println(boy.calGPA());

        boy.setScore(53);
        System.out.println("After change score : ");
        System.out.println(boy.calGPA());

        System.out.println("----C-----");
        System.out.println(c.getGender());
        System.out.println(c.getId());
        c.setId(230);
        c.setGender('F');
        System.out.println(c.getId());
        System.out.println(c.getScore());
        System.out.println(c.calGPA());
        System.out.println(c.getGender());
    }
}