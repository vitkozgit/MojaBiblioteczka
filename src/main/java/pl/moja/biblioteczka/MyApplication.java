package pl.moja.biblioteczka;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl.moja.biblioteczka.utils.FXMLUtils;

import java.util.Locale;

public class MyApplication extends Application {

    private static final String BORDER_PANE_MAIN_FXML = "/fxml/BorderPaneMain.fxml";

    @Override
    public void start(Stage primaryStage) {
        Locale.setDefault(new Locale("pl"));
        Pane borderPane = FXMLUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle(FXMLUtils.getResourceBundle().getString("tittle.application"));
        primaryStage.show();
    }
}