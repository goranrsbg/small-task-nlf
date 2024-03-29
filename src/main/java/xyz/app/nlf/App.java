package xyz.app.nlf;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import xyz.app.nlf.jpa.DBUtil;
import xyz.app.nlf.utils.ViewManager;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void init() throws Exception {
        DBUtil.connect();
    }

    @Override
    public void stop() throws Exception {
        DBUtil.close();
    }

    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(ViewManager.get().loadPrimary(), 960d, 540d);
        stage.setScene(scene);
        stage.setMinHeight(480d);
        stage.setMinWidth(640d);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
