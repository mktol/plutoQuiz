package org.pluto.controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.pluto.MainApp;

/**
 * This class
 */
public class RootController {
    private MainApp main;

    public void setMain(MainApp main) {
        this.main = main;
    }

    @FXML
    private TreeView<String> topicView;

    public RootController() {
    }
    @FXML
    private void initialize(){
        Node rootIcon = new ImageView(
                new Image(getClass().getResourceAsStream("/image/briefcase.png"))
        );
        TreeItem<String> rootItem = new TreeItem<String>("Topics", rootIcon);
        rootItem.setExpanded(true);
        for (int i = 0; i < 4; i++) {
            TreeItem<String> item = new TreeItem<String>("message"+i);
            rootItem.getChildren().add(item);
        }
        topicView.setRoot(rootItem);
    }
}
