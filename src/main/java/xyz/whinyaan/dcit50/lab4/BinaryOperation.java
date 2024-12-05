package xyz.whinyaan.dcit50.lab4;

abstract class BinaryOperation extends Expression {
    private final Expression leftOperand;
    private final Expression rightOperand;

    public BinaryOperation(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    final Expression getLeftOperand() {
        return leftOperand;
    }

    final Expression getRightOperand() {
        return rightOperand;
    }
}
