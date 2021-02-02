package com.graphicalScene.graphical_objects;

public class Point extends GraphicalObject
{
    @Override
    public void draw() {
        System.out.println("Рисую точку с координатами: " +
                getCoordinates() + ", цвет " + getColor());
    }
}
