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

        lahiru.sno = 123;
        lahiru.name= "Lahiru C.";
        lahiru.marks = 56.5F;

        System.out.println(lahiru.name);
        System.out.println(lahiru.marks);
        System.out.println(lahiru.sno);
    }

}

// create a class
class Student {
    int sno;
    String name;
    float marks;
}
