/**
 * Application is non rectangle window template for futures applications.
 *
 * Window has implemented:
 * - non rectangle window shape;
 * - semi-transparent window inside;
 * - separated layout pane for title and main content;
 * - base functions as minimize and close window;
 * - CSS styles;
 *
 * To do (development ideas):
 * - implementing resizable class
 *
 * The window template created and tested on Windows 10 with 1920x1080px screen resolution.
 * Requirements (will be changed):
 * Java SE 13
 * JavaFX 13
 *
 * @author  Mateusz Łyszkiewicz
 * @version 0.1
 * @since   2019-12-05
 */

import ui.MainController;

public class Main {

    public static void main(String[] args) {
        MainController.launch(MainController.class);
    }
}


