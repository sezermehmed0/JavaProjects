package com.company;

public class Machine extends Engine {
    double heightOfTheMachine;
    String colourOfTheMachine;


    public String getColor() {
        return colourOfTheMachine;
    }

    public void setColor(String color) {
        this.colourOfTheMachine = color;
    }

    public double getHeightOfTheMachine() {
        return heightOfTheMachine;
    }

    public void setHeightOfTheMachine(double heightOfTheMachine) {
        this.heightOfTheMachine = heightOfTheMachine;
    }

}
