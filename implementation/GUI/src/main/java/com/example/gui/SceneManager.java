package com.example.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author
 */
public class SceneManager {

    private final Scene scene;
    private final Callback<Class<?>, Object> controllerFactory;
    private final Map<String, Parent> views = new HashMap<>();

    public SceneManager(Callback<Class<?>, Object> controllerFactory, String initialView) {
        this.controllerFactory = controllerFactory;
        scene = new Scene(loadScene(initialView,null));
    }

    public final void changeScene(String view) {
        scene.setRoot(loadScene(view, null));
    }

    public final <T> void changeScene(String view, Consumer<T> consumer) {
        scene.setRoot(loadScene(view, consumer));
    }

    private <T> Parent loadScene(String fxml, Consumer<T> consumer) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml + ".fxml"));
        fxmlLoader.setControllerFactory(controllerFactory);
//        System.out.println(Locale.getDefault()+"scene");
        fxmlLoader.setResources(ResourceBundle.getBundle("frontend.editAisStrings", Locale.getDefault()));
        try {
           Parent load = fxmlLoader.load();
            if (consumer != null) {
                var controller = (T) fxmlLoader.getController();
                consumer.accept(controller);
     
            }
            return load;
        } catch (IOException ex) {
            Logger.getLogger(SceneManager.class.getName()).log(Level.SEVERE, "Unable to load fxml", ex);
            Logger.getLogger(SceneManager.class.getName()).log(Level.SEVERE, "Unable to load fxml", ex.getCause());
            return createErrorPane(HelloApplication.class.getResource(fxml + ".fxml"), ex);
        }
    }

    void displayOn(Stage stage, int width, int height) {
        stage.setScene(scene);
        stage.setIconified(true);
        stage.getIcons().add(new Image(HelloApplication.class.getResourceAsStream("AISLogo1.png")));
        stage.setWidth(width);
        stage.setHeight(height);
        stage.show();
    }

    void displayOn(Stage stage) {
        stage.setScene(scene);
        stage.setIconified(true);
        stage.getIcons().add(new Image(HelloApplication.class.getResourceAsStream("AISLogo1.png")));
        stage.show();
    }

    Parent createErrorPane(URL fxmlResource, IOException ex) {
        var parent = new VBox();
        var titleLabel = new Label("Unable to load fxml");
        titleLabel.setTextFill(Paint.valueOf("#FF0000"));
        titleLabel.setFont(new Font(titleLabel.getFont().getName(), 32));
        parent.getChildren().add(titleLabel);

        var loader = HelloApplication.class.getClassLoader();
        var loaderName = loader.getName();

        addRow(parent, "File", fxmlResource.toString());
        addRow(parent, "Loader name", loaderName);

        addRow(parent, "Cause class", ex.getCause().getClass().toString());
        addRow(parent, "Cause message", ex.getCause().getMessage());

        var stackTrace = Stream.of(ex.getStackTrace()).limit(10).map(st -> st.toString()).collect(Collectors.joining("\n"));
        var stLabel = new Label("Stacktrace:");
        stLabel.setStyle("-fx-font-weight: bold;");
        parent.getChildren().add(stLabel);
        parent.getChildren().add(new TextArea(stackTrace));
        return parent;
    }

    void addRow(VBox parent, String label, String text) {
        var row = new HBox();

        var nameLabel = new Label(label + ": ");
        nameLabel.setStyle("-fx-font-weight: bold;");

        var textLabel = new Label(text);
        textLabel.setWrapText(true);

        row.getChildren().addAll(
                nameLabel,
                textLabel
        );

        parent.getChildren().add(row);
    }

}