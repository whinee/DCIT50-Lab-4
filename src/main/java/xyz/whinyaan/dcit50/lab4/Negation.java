package xyz.whinyaan.dcit50.lab4;

class Negation extends UnaryOperation {
    public Negation(Expression operand) {
        super(operand);
    }

    @Override
    public Integer getValue() {
        Integer operandValue = getOperand().getValue();
        return operandValue != null ? -operandValue : null;
    }

    @Override
    public String toString() {
        String operandStr = getOperand().toString();
        
        // If the operand is already a negation, avoid redundant negation
        if (getOperand() instanceof Negation) {
            return operandStr;
        // Else if the operand starts with the negative sign, remove it
        } else if (operandStr.startsWith("-")) {
            return operandStr.substring(1);
        }
        // Otherwise, prepend the negative sign
        return "-" + operandStr;
    }
}
