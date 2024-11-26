public class SingleInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.who(); 
        obj.show();
    }
}

class Parent {
    void who() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child");
    }
}

