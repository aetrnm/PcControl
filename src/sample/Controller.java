package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane mainPanel;

    @FXML
    private Button shutdownButton;

    @FXML
    private Button restartButton;

    @FXML
    private Button sleepButton;

    @FXML
    private Button logoutButton;

    @FXML
    void restart(ActionEvent event) throws IOException
    {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("shutdown -r -t 0");
    }

    @FXML
    void shutdown(ActionEvent event) throws IOException
    {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("shutdown -s -t 0");
    }

    @FXML
    void sleep(ActionEvent event) throws IOException
    {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("powercfg -h off");
        runtime.exec("rundll32.exe powrprof.dll,SetSuspendState 0,1,0");
    }

    @FXML
    void logout(ActionEvent event) throws IOException
    {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("shutdown -l");
    }

    @FXML
    void initialize() {
        shutdownButton.setFocusTraversable(false);
        sleepButton.setFocusTraversable(false);
        restartButton.setFocusTraversable(false);
        logoutButton.setFocusTraversable(false);
    }
}