public class ConstructorOL {

    public ConstructorOL() {
        System.out.println("No arguments called");
    }

    public ConstructorOL(int x) {
        System.out.println("one argument is called: " + x);
    }

    public ConstructorOL(int x, String name) {
        System.out.println("two arguments are called: " + x + ", " + name);
    }

    public static void main(String[] args) {
        ConstructorOL obj1 = new ConstructorOL();
        ConstructorOL obj2 = new ConstructorOL(10);
        ConstructorOL obj3 = new ConstructorOL(20, "John");
    }
}
