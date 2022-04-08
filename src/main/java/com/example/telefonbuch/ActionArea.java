package com.example.telefonbuch;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class ActionArea {

    private final AnchorPane anchorPane = new AnchorPane();
    private final Button delButton = new Button("Löschen");
    private final Button addButton = new Button("Hinzufügen");

    public ActionArea(Runnable performDelete,Runnable performAdd){
        AnchorPane.setTopAnchor(delButton,10.0);
        AnchorPane.setBottomAnchor(delButton,10.0);
        AnchorPane.setRightAnchor(delButton,10.0);

        AnchorPane.setTopAnchor(addButton,10.0);
        AnchorPane.setBottomAnchor(addButton,10.0);
        AnchorPane.setLeftAnchor(addButton,10.0);

        anchorPane.getChildren().addAll(delButton);
        anchorPane.getChildren().addAll(addButton);
        delButton.onActionProperty().setValue(e -> performDelete.run());
        addButton.onActionProperty().setValue(e -> performAdd.run());
    }

    public Node getPane() {
        return anchorPane;
    }
}
