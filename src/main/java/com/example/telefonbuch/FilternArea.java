package com.example.telefonbuch;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FilternArea {

    private final AnchorPane anchorPane = new AnchorPane();
    private final TextField textField = new TextField();
    private final Button button = new Button("Filter");

    public FilternArea(){
        AnchorPane.setLeftAnchor(textField,10.0);
        AnchorPane.setTopAnchor(textField,10.0);
        AnchorPane.setBottomAnchor(textField,10.0);
        AnchorPane.setRightAnchor(textField,90.0);

        AnchorPane.setTopAnchor(button,10.0);
        AnchorPane.setBottomAnchor(button,10.0);
        AnchorPane.setRightAnchor(button,10.0);

        button.setPrefWidth(70);
        //button.onActionProperty().setValue(actionEvent -> FilterInterface.filter(textField.textProperty().getValue()));

        anchorPane.getChildren().addAll(textField,button);
    }

    public Node getPane() {
        return anchorPane;
    }
}
