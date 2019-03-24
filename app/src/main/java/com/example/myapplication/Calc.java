package com.example.myapplication;

public class Calc {

    private double dispNum;
    private double firstOperand;
    private double secondOperand;
    private boolean operatorFlag;


    public Calc() {
        dispNum = 0;
        firstOperand = 0;
        secondOperand = 0;
        operatorFlag = Boolean.FALSE;

    }

    public double getSum() {
        return firstOperand + secondOperand;
    }

    public boolean isOperatorFlag() {
        return operatorFlag;
    }

    public void setOperatorFlag(boolean operatorFlag) {
        this.operatorFlag = operatorFlag;
    }

    public double getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public double getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(double secondOperand) {
        this.secondOperand = secondOperand;
    }

    public double getDispNum() {
        return dispNum;
    }

    public void setDispNum(double dispNum) {
        this.dispNum = dispNum;
    }
}
