public class multiply implements Operation {
    @Override
    public String operate(double input1, double input2) {
        return String.valueOf(input1 * input2);
    }
}
