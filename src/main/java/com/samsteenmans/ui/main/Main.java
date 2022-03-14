package com.samsteenmans.ui.main;

import com.samsteenmans.database.DatabaseHandler;
import com.samsteenmans.exceptions.ExceptionUtil;
import com.samsteenmans.util.LibraryAssistantUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {



    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/library/assistant/ui/login/login.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        stage.setTitle("Library Assistant Login");

        LibraryAssistantUtil.setStageIcon(stage);

        new Thread(() -> {
            ExceptionUtil.init();
            DatabaseHandler.getInstance();
        }).start();
    }

    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();

        launch(args);

    }

}
