package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    /*==================================================*
     *==             INTERNATIONALIZATION             ==*
     *==================================================*/

    private ResourceBundle bundle;

    /*==================================================*
     *==                GUI-COMPONENTS                ==*
     *==================================================*/

    // get access on GUI components via @FXML annotation

    /*==================================================*
     *==               INITIALIZATION                 ==*
     *==================================================*/

    /**
     * Initializes the Controller as adding listeners and filling the ComboBox to select a checksum algorithm.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // save resource bundle for internationalization
        this.bundle = resourceBundle;
    }
}
