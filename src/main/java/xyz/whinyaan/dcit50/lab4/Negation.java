package xyz.whinyaan.dcit50.lab4;

class Negation extends UnaryOperation {
    public Negation(Expression operand) {
        super(operand);
    }

    @Override
    Integer getValue() {
        Integer operandValue = getOperand().getValue();
        return operandValue != null ? -operandValue : null;
    }

    @Override
    public String toString() {
        return "-" + getOperand().toString();
    }
}
