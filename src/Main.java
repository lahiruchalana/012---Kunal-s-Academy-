import javax.swing.text.html.StyleSheet;

public class Main {
    public static void main(String[] args) {

        // store 5 numbers
        int[] number = new int[5];
        number[1] = 12;

        // store 5 names
        String[] names = new String[5];

        // Classes are similar to above type of data types
        // So Classes are same to data types
        // Class is a data type with different properties and methods

//        System.out.println(number[1]);

        // declare
        Student lahiru = new Student();
//        lahiru.greeting();

        Student kasun = new Student(12,"kasun padmilar", 46.5f);

        System.out.println(kasun.sno);
        System.out.println(kasun.name);
        System.out.println(kasun.marks);
        kasun.greeting();

//        lahiru.sno = 123;
//        lahiru.name= "Lahiru C.";
//        lahiru.marks = 56.5F;

//        System.out.println(lahiru.name);
//        System.out.println(lahiru.marks);
//        System.out.println(lahiru.sno);
    }

}

// create a class
class Student {
    int sno;
    String name;
    float marks;

    void greeting() {
        System.out.println("Welcome " + this.name);
    }

    Student () {
        this.sno = 13;
        this.name = "LC";
        this.marks = 34.5f;
    }

    Student (int sno, String name, float marks) {
        this.sno = sno;
        this.name = name;
        this.marks = marks;
    }

}
