public class Constructorex {

    int age;
    String name;

    public Constructorex(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Constructorex obj = new Constructorex("soulfinder", 19);
        obj.displayDetails();
    }
}
