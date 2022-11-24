import java.util.ArrayList;
import java.util.jar.Attributes.Name;

import javax.print.attribute.standard.MediaSize.NA;

public class J149_Libraly {
    public static void main(String[] args) {
        Library rb = new Library("Ratchaburi KMUTT");
        rb.setName("Ratchaburi KMUTT campus");
        rb.addEmployee(new Employee(42647, "Kim Seok-jin", 10891, 25000));
        rb.addEmployee(new Employee(42648, "Kim Tae-hyung", 10892, 24000));
        rb.addEmployee(new Employee(42649, "Choi Soobin ", 10893, 3000));
        rb.addEmployee(new Employee(42650, "Yeonjun", 10894, 32000));
        Employee e = new Employee(42651, "beomgyu", 10895, 20000);
        e.setSalary(21000);
        e.setName("Beomgyu");
        rb.addEmployee(e);

        System.out.println("There are " + rb.getNumberOfEmployees() + " employees work for library " + rb.getName());
        System.out.println("The total salary is " + rb.getTotalSalary());
        System.out.println("===========================================================================");

        if (rb.removeEmployee(20890)) {
            System.out.println("Remove employee id 20890 in library " + rb.getName() + " successfully");
        } else {
            System.out.println("There is no employee id 20890 in library " + rb.getName());
        }

        if (rb.removeEmployee(10893)) {
            System.out.println("Remove employee id 10893 in library " + rb.getName() + " successfully");
        } else {
            System.out.println("There is no employee id 10893 in library " + rb.getName());
        }

        if (rb.removeEmployee(10893)) {
            System.out.println("Remove employee id 10893 in library " + rb.getName() + " successfully");
        } else {
            System.out.println("There is no employee id 10893 in library " + rb.getName());
        }

        if (rb.removeEmployee(10892)) {
            System.out.println("Remove employee id 10892 in library " + rb.getName() + " successfully");
        } else {
            System.out.println("There is no employee id 10892 in library " + rb.getName());
        }

        System.out.println("There are " + rb.getNumberOfEmployees() + " employees work for library " + rb.getName());
        System.out.println("The total salary is " + rb.getTotalSalary());
        System.out.println("===========================================================================");

        rb.addBook(new Book(3871, "Introduction to Programming1"));
        rb.addBook(new Book(3869, "Data structure and Algorithms"));
        rb.addBook(new Book(3899, "Introduction to Programming1"));
        rb.addBook(new Book(3833, "Advance Database"));
        rb.addBook(new Book(3812, "Introduction to Programming1"));

        rb.printInfoOfAllBooks();
        int idx = rb.searchBookById(3833);
        if (idx != -1) {
            System.out.println("Found book id 3833 at index " + idx);ß
        } else {
            System.out.println("There is no book id 3833 in library " + rb.getName());
        }

        idx = rb.searchBookById(3899);
        if (idx != -1) {
            System.out.println("Found book id 3899 at index " + idx);
        } else {
            System.out.println("There is no book id 3899 in library " + rb.getName());
        }

        idx = rb.searchBookById(3900);
        if (idx != -1) {
            System.out.println("Found book id 3900 at index " + idx);
        } else {
            System.out.println("There is no book id 3900 in library " + rb.getName());
        }

        int cnt = rb.searchBookByName("Advance Database");
        System.out.println("There are " + cnt + " books name Advance Database");

        cnt = rb.searchBookByName("Introduction to Programming1");
        System.out.println("There are " + cnt + " books name Introduction to Programming1");

        cnt = rb.searchBookByName("Introduction to Programming3");
        System.out.println("There are " + cnt + " books name Introduction to Programming3");

        Book borrow1 = rb.borrowBook(3800);
        if (borrow1 != null) {
            System.out.println("Borrow book id 3800 successfully");
        } else {
            System.out.println("There is no book id 3800 in Library " + rb.getName());
        }
        rb.printInfoOfAllBooks();
        System.out.println("There are " + rb.getAmountOfBooks() + " books in library " + rb.getName());

        Book borrow2 = rb.borrowBook(3869);
        if (borrow2 != null) {
            System.out.println("Borrow book id 3869 successfully");
        } else {
            System.out.println("There is no book id 3869 in Library " + rb.getName());
        }
        rb.printInfoOfAllBooks();
        System.out.println("There are " + rb.getAmountOfBooks() + " books in library " + rb.getName());

        Book borrow3 = rb.borrowBook(3812);
        if (borrow3 != null) {
            System.out.println("Borrow book id 3812 successfully");
        } else {
            System.out.println("There is no book id 3812 in Library " + rb.getName());
        }
        rb.printInfoOfAllBooks();
        System.out.println("There are " + rb.getAmountOfBooks() + " books in library " + rb.getName());

        rb.returnBook(borrow3);
        rb.printInfoOfAllBooks();
        System.out.println("There are " + rb.getAmountOfBooks() + " books in library " + rb.getName());

        idx = rb.searchBookById(3869);
        if (idx != -1) {
            System.out.println("Found book id 3869 at index " + idx);
        } else {
            System.out.println("There is no book id 3869 in library " + rb.getName());
        }
    }
}

class Human {
    private int Id;
    private String Name;

    public Human(int Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }
}

class Employee {
    private int employeeId;
    private double salary;
    private Human human;

    public Employee(int Id, String Name, int employeeId, double salary) {
        this.human.setId(Id);
        this.human.setName(Name);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Book {
    private int Id;
    private String Name;

    public Book(int Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }
}

class Library {
    private String name;
    private ArrayList<Employee> employees;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public boolean removeEmployee(int employeeId) {
        for (int i = 0; i < employees.size(); i++) {
            Employee A = employees.get(i);
            if (A.getEmployeeId() == employeeId) {
                employees.remove(i);
                return true;
            }
        }
        return false;
    }

    public int getNumberOfEmployees() {
        return employees.size();
    }

    public double getTotalSalary() {
        double TotalSalary = 0;
        for (Employee i : employees) {
            TotalSalary += i.getSalary();
        }
        return TotalSalary;
    }

    public void addBook(Book book) {
        books.add(book);
        books.sort((o1, o2) -> String.valueOf(o1.getId()).compareTo(String.valueOf(o2.getId())));
    }

    public void printInfoOfAllBooks() {
        for (int i = 0; i < this.books.size(); i++) {
            System.out.println("(id: " + this.books.get(i).getId() + ", name : " + this.books.get(i).getName() + ")");
        }
    }

    public int searchBookByName(String Name) {
        int cnt = 0;
        for (Book i : books) {
            cnt += i.getName().equals(Name) ? 1 : 0;
        }
        return cnt;
    }

    public int searchBookById(int Id) {
        int idx = -1;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == Id)
                idx = i;
        }
        return idx;
    }
    public
}
