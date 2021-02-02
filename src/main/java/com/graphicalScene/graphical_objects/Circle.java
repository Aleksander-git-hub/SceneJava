package com.graphicalScene.graphical_objects;

public class Circle extends GraphicalObject
{
    @Override
    public void draw() {
        System.out.println("Рисую окружность с координатами: " +
                getCoordinates() + ", цвет " + getColor());
    }
}
