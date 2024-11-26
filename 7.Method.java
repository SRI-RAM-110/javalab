public class Main {

    public static void main(String[] args) {

        Method obj = new Method();

        System.out.println(obj.add(1, 2));
        System.out.println(obj.add(1, 2, 3));
        System.out.println(obj.add(1.2, 2.3));
    }
}
class Method{

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}