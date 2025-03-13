public class Main {
    public static void main(String[] args) {
        System.out.println("Static variable before creating any instances: " + StaticInitializationDemo.getStaticVariable());

        StaticInitializationDemo instance1 = new StaticInitializationDemo("Instance 1");
        StaticInitializationDemo instance2 = new StaticInitializationDemo("Instance 2");
        System.out.println("Static variable after creating instances: " + StaticInitializationDemo.getStaticVariable());

        System.out.println("Instance 1 variable: " + instance1.getInstanceVariable());
        System.out.println("Instance 2 variable: " + instance2.getInstanceVariable());




        
    }
}