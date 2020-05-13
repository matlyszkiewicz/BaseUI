package ui;

import javafx.fxml.FXML;

public class MenuController {

    private MainController mainController;

    @FXML
    public void initialize() {
    }

    void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

}
