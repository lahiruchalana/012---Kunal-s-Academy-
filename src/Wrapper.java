public class Wrapper {
    public static void main(String[] args) {

        int a = 1;

        Integer num = 5;

        final Child vish = new Child("vish");
        // in this case we can modify "vish" object because
        // this final not used in the primitive data type
        vish.name = "vishwajith";

        System.out.println(vish.name);

        // but can not reassign that object
//        vish = new Child("dauifaf"); // error occur

    }
}

class Child {
    // when final using primitive data type, it is not permitting to change that value of
    // final variable and, it should be initialized at first stage
    final int age = 5;
    String name;

    Child(String name) {
        this.name = name;
    }

}