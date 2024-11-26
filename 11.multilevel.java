public class Main {
    public static void main(String[] args) {
        child obj = new child();
        obj.gran();
        obj.par();
        obj.chi();
    }
}
class grandparent {
    void gran() {
        System.out.println("i am the grandparent");
    }
}
class parent extends grandparent{
    void par() {
        System.out.println("i am the parent");
    }
}
class child extends parent{
    void chi() {
        System.out.println("i am the child");
    }
}
