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

        Child kill ;
        for (int i =0; i<1000000 ; i++ ) {
            kill = new Child("some name" + i);
            System.out.println(kill.name);
        }
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

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object move to the Garbage Collector");
    }
}