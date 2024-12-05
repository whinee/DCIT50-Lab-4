package xyz.whinyaan.dcit50.lab4;


class Constant extends Expression {
    private final Integer value;

    public Constant(Integer value) {
        this.value = value;
    }

    @Override
    Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
