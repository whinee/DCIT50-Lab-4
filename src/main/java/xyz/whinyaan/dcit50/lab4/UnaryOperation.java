package xyz.whinyaan.dcit50.lab4;

abstract class UnaryOperation extends Expression {
    private final Expression operand;

    public UnaryOperation(Expression operand) {
        this.operand = operand;
    }

    protected Expression getOperand() {
        return operand;
    }
}
