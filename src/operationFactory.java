public class operationFactory {
    //uses the operation class
    public Operation getOperation(String opInput) {
        if (opInput == null) {
            return null;
        }
        return switch (opInput) {
            case "+" -> new add();
            case "-" -> new sub();
            case "x" -> new multiply();
            case "/" -> new divide();
            default -> null;
        };
    }
}
