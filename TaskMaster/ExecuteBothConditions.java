package TaskMaster;

class ExecuteBothConditions {
    public static void main(String[] args) {
        executeBothConditions(true);
        executeBothConditions(false);
    }

    public static void executeBothConditions(boolean condition) {
        if (condition) {
            System.out.println("If condition is executed");
        } else {
            System.out.println("Else condition is executed");
        }
    }
}