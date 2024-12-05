package xyz.whinyaan.dcit50.lab4;

class Multiplication extends BinaryOperation {
    public Multiplication(Expression leftOperand, Expression rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public Integer getValue() {
        Integer leftValue = getLeftOperand().getValue();
        Integer rightValue = getRightOperand().getValue();
        return (leftValue != null && rightValue != null) ? leftValue * rightValue : null;
    }

    @Override
    public String toString() {
        return "(" + getLeftOperand().toString() + "*" + getRightOperand().toString() + ")";
    }
}