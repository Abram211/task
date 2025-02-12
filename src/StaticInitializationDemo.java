public class StaticInitializationDemo {
    private static int staticVariable;
    private String instanceVariable;
    static {
        System.out.println("Static block is executed.");
        staticVariable = 42;
    }

    public StaticInitializationDemo(String instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    public static int getStaticVariable() {
        return staticVariable;
    }

    public String getInstanceVariable() {
        return instanceVariable;
    }
}
