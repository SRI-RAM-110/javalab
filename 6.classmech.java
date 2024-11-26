public class ClassMech {

    String name;
    int age;

    public ClassMech(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void greet() {
        System.out.println("Hello, " + name + "!\n");
    }

    public static void main(String[] args) {
        ClassMech person1 = new ClassMech("Raj", 30);
        ClassMech person2 = new ClassMech("Priya", 25);
        ClassMech person3 = new ClassMech("Amit", 28);

        person1.displayDetails();
        person1.greet();

        person2.displayDetails();
        person2.greet();

        person3.displayDetails();
        person3.greet();
    }
}
