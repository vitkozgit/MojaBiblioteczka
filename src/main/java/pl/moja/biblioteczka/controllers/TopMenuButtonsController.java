package pl.moja.biblioteczka.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class TopMenuButtonsController {

    private static final String LIST_BOOKS_FXML = "/fxml/ListBooks.fxml";
    private static final String LIBRARY_FXML = "/fxml/Library.fxml";
    private static final String STATISTICS_FXML = "/fxml/Statistics.fxml";
    private MainController mainController;

    @FXML
    private ToggleGroup toogleButtons;

    @FXML
    public void openLibrary() {
        mainController.setCenter(LIBRARY_FXML);
    }

    @FXML
    public void openListBooks() {
        mainController.setCenter(LIST_BOOKS_FXML);
    }

    @FXML
    public void openStatistics() {
        mainController.setCenter(STATISTICS_FXML);
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    @FXML
    public void addBook() {
        if(toogleButtons.getSelectedToggle() != null) {
            toogleButtons.getSelectedToggle().setSelected(false);
        }

        mainController.setCenter("/fxml/addBook.fxml");
    }
}
