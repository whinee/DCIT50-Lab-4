package xyz.whinyaan.dcit50.lab4;

class Variable extends Expression {
    private final String name;
    private Integer value;

    public Variable(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public Variable(String name) {
        this.name = name;
        this.value = null;
    }

    public String getName() {
        return name;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name;
    }
}