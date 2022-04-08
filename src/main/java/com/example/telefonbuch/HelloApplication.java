package com.example.telefonbuch;

import javafx.application.Application;
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
        FilterArea searchArea = new FilterArea(tb::filter);
        EntryArea entryArea = new EntryArea(tb.getFilteredEntries());
        ActionArea actionArea = new ActionArea(
                () -> {tb.removeAll(entryArea.getSelectedEntries());},
                tb::addEmpty
        );

        bp.setTop(searchArea.getPane());
        bp.setCenter(entryArea.getPane());
        bp.setBottom(actionArea.getPane());

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