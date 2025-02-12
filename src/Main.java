public class Main {
    public static void main(String[] args) {
        System.out.println("Static variable before creating any instances: " + StaticInitializationDemo.getStaticVariable());

        StaticInitializationDemo instance1 = new StaticInitializationDemo("Instance 1");
        StaticInitializationDemo instance2 = new StaticInitializationDemo("Instance 2");
        
    }
}