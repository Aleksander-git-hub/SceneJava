package com.graphicalScene;

import com.graphicalScene.build_configuration.BuilderConfiguration;
import com.graphicalScene.scene.Scene;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BuilderConfiguration.class);

        Scene scene = context.getBean(Scene.class);
        scene.drawScene();
    }
}
