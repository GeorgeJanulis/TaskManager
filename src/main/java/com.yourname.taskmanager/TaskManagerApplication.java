package com.yourname.taskmanager;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class TaskManagerApplication {
    public static void main(String[] args) {
        // This launches JavaFX, which then starts Spring in its init() method
        Application.launch(JavaFXApplication.class, args);
    }
}