package ui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainController extends Application {

    @FXML
    private Pane titlePane;

    @FXML
    private Polygon polygon;

    @FXML
    private Button closeButton;

    @FXML
    private Line leftResizableBorder;

    @FXML
    private Line rightResizableBorder;

    @FXML
    private Line topResizableBorder;

    @FXML
    private Line bottomResizableBorder;

    @FXML
    private Button minimizeButton;

    @FXML
    private Button firstNaviButton;

    @FXML
    private Button secondNaviButton;

    @FXML
    private Button thirdNaviButton;

    @FXML
    private AnchorPane mainAnchorPane;

    @FXML
    private StackPane mainStackPane;

    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/ui/MainStack.fxml"));

        this.stage = stage;
        stage.setTitle("Untitled");
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setMinWidth(700);
        stage.setMinHeight(650);

        Scene scene = new Scene(root, stage.getWidth(), stage.getHeight(), false, SceneAntialiasing.BALANCED);
        scene.setFill(Color.TRANSPARENT);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void initialize() {
        loadMenuScreen();
    }

    @FXML
    private void close() {
        Platform.exit();
        System.exit(0);
    }

    @FXML
    private void minimize() {
        stage.setIconified(true);
    }

    private void loadTitleBar() {
    }

    private void loadMenuScreen() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/ui/MenuScreen.fxml"));
        AnchorPane pane = null;

        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        MenuController menuController = loader.getController();
        menuController.setMainController(this);
        setScreen(pane);
    }

    void setScreen(Region region) {
        mainStackPane.getChildren().add(region);
    }
}