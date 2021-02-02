package com.graphicalScene.scene;

import com.graphicalScene.graphical_objects.GraphicalObject;

import java.util.List;

public class Scene
{
    private List<GraphicalObject> graphicalObjects;

    public void drawScene() {
        System.out.println("---DRAW SCENE---");
        for (GraphicalObject object : graphicalObjects) {
            object.draw();
        }
    }

    public List<GraphicalObject> getGraphicalObjects() {
        return graphicalObjects;
    }

    public void setGraphicalObjects(List<GraphicalObject> graphicalObjects) {
        this.graphicalObjects = graphicalObjects;
    }
}
