package com.graphicalScene.build_configuration;

import com.graphicalScene.coordinates.Coordinates;
import com.graphicalScene.graphical_objects.Circle;
import com.graphicalScene.graphical_objects.GraphicalObject;
import com.graphicalScene.graphical_objects.Point;
import com.graphicalScene.scene.Scene;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BuilderConfiguration
{
    @Bean
    @Scope("prototype")
    public Coordinates coordinates() {
        Coordinates coordinates = new Coordinates();
        coordinates.setX(Math.random() * 10);
        coordinates.setY(Math.random() * 10);
        return coordinates;
    }

    @Bean
    @Scope("prototype")
    public Point point() {
        Point point = new Point();
        point.setCoordinates(coordinates());
        point.setColor("Green");
        return point;
    }

    @Bean
    @Scope("prototype")
    public Circle circle() {
        Circle circle = new Circle();
        circle.setCoordinates(coordinates());
        circle.setColor("Blue");
        return circle;
    }

    @Bean
    public Scene scene() {
        Scene scene = new Scene();
        List<GraphicalObject> graphicalObjects = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            graphicalObjects.add(point());
            graphicalObjects.add(circle());
        }
        scene.setGraphicalObjects(graphicalObjects);
        return scene;
    }
}
