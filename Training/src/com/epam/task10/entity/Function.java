package com.epam.task10.entity;

public class Function {
    private double startingValue;
    private double finiteValue;
    private double step;

    public Function(double startingValue, double finiteValue, double step) {
        this.startingValue = startingValue;
        this.finiteValue = finiteValue;
        this.step = step;
    }

    public double getStartingValue() {
        return startingValue;
    }

    public void setStartingValue(double startingValue) {
        this.startingValue = startingValue;
    }

    public double getFiniteValue() {
        return finiteValue;
    }

    public void setFiniteValue(double finiteValue) {
        this.finiteValue = finiteValue;
    }

    public double getStep() {
        return step;
    }

    public void setStep(double step) {
        this.step = step;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Function{");
        sb.append("startingValue=").append(startingValue);
        sb.append(", finiteValue=").append(finiteValue);
        sb.append(", step=").append(step);
        sb.append('}');
        return sb.toString();
    }
}
