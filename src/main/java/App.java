import constants.FXMLFiles;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * JavaFX App
 */
public class App extends Application {

    /*==================================================*
     *==             START APPLICATION                ==*
     *==================================================*/

    public static void launch(String[] args) {
        launch();
    }

    /*==================================================*
     *==                   FIELDS                     ==*
     *==================================================*/

    private FXMLLoader fxmlLoader;
    private ResourceBundle bundle;

    /*==================================================*
     *==               JAVAFX-STARTER                 ==*
     *==================================================*/

    @Override
    public void start(Stage stage) throws IOException {

        // create FXML loader
        this.fxmlLoader = new FXMLLoader();

        // init language
        this.bundle = initLanguage();
        this.fxmlLoader.setResources(bundle);

        // init icons
        //initIcons(stage);

        // create scene
        Scene scene = new Scene(loadFXML(FXMLFiles.MAIN_WINDOW));
        stage.setScene(scene);
        stage.setTitle(this.bundle.getString("application.title"));

        // show window
        stage.show();
    }

    /*==================================================*
     *==               INITIALIZATION                 ==*
     *==================================================*/

    /**
     * Returns the resource bundle to use for the current application run.
     *
     * Returns the German bundle if German is set as system language.
     * If not so, the default bundle is returned which uses English strings.
     */
    private ResourceBundle initLanguage() {

        // for testing: change the language to be used
        //Locale.setDefault(new Locale("en"));

        // get location of language bundle
        String bundlesPkg = getClass().getPackageName();
        String bundlesLocation = "bundles.language";

        if (!bundlesPkg.isEmpty()) {
            bundlesLocation = bundlesPkg + "." + bundlesLocation;
        }

        // check if German is set to system language
        boolean germanAsSystemLanguage = Locale.getDefault().getLanguage().equals(new Locale("de").getLanguage());

        // load German package (if system is set so) or English package as default language
        ResourceBundle bundle = null;
        if (germanAsSystemLanguage) {
            bundle = ResourceBundle.getBundle(bundlesLocation, new Locale("de"));
        } else {
            bundle = ResourceBundle.getBundle(bundlesLocation, new Locale("en"));
        }
        return bundle;
    }

    /**
     * Adds icons for the application.
     *
     * @param stage the stage to which the icons should be added
     */
    private void initIcons(Stage stage) {
        stage.getIcons().addAll(
                new Image(getClass().getResourceAsStream("icon/icon48.png")),
                new Image(getClass().getResourceAsStream("icon/icon64.png"))
        );
    }

    /*==================================================*
     *==       HELPER METHOD FOR CHANGING FXMLs       ==*
     *==================================================*/

    /**
     * Loads the FXML with the given name from the resources and returns the created GUI.
     *
     * @param fxml the name of the FXML to load
     * @return the gui created from the FXML
     * @throws IOException throws an error if the FXML is not found etc.
     */
    private Parent loadFXML(String fxml) throws IOException {
        fxmlLoader.setLocation(App.class.getResource("fxml/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

}