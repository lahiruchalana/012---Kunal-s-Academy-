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
        kasun.changeName("K Padmila");

        Student random = new Student(lahiru);

        System.out.println(random.sno);
        System.out.println(random.name);
        System.out.println(random.marks);
        random.greeting();

        Student isuru = new Student(23, "Isuru", 49.8f);
        Student random2 = isuru;
        isuru.name = "isuru maldeniya";

        System.out.println(random2.name);


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

    void changeName(String name) {
        this.name = name;
    }

//    Student () {
//        this.sno = 13;
//        this.name = "LC";
//        this.marks = 34.5f;
//    }

    Student () {
        this(25, "Lahiru", 46.2f);
    }

    Student (Student otherObject) {
        this.sno = otherObject.sno;
        this.name = otherObject.name;
        this.marks = otherObject.marks;
    }

    Student (int sno, String name, float marks) {
        this.sno = sno;
        this.name = name;
        this.marks = marks;
    }

}
