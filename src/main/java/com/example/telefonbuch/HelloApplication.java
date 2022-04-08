package com.example.telefonbuch;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        TelefonBook tb = new TelefonBook();
        BorderPane bp = new BorderPane();
        FilternArea searchArea = new FilternArea();
        EntryArea entryArea = new EntryArea(tb.getEntries());

        bp.setTop(searchArea.getPane());
        bp.setCenter(entryArea.getPane());

//        b1.onActionProperty().setValue(e->
//        {
//            for (TelefonEntry te : tb.getEntries()){
//                System.out.println(te.getName() + ", " + te.getSurname() + ", " + te.getNumber());
//            }
//        });

        Scene scene = new Scene(bp, 320, 240);

        stage.setTitle("Telefonbookü!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void testButton(){
        System.out.println("Test");
    }

}