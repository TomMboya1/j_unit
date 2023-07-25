public class Main {
    public static void main(String[] args) {

        MathOperations mathOperations = new MathOperations();
        org.junit.runner.JUnitCore.runClasses(mathOperations.getClass());
    }
}
