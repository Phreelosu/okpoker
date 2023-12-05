/*
* File: App.java
* Author: Nagy József
* Copyright: 2021, Nagy József 
* Date: 2021-09-11
* Licenc: MIT
* Refaktor: Rátkay Dániel
* Github: https://github.com/Phreelosu
*
*/

import controllers.MainController;
import views.MainWindow;

public class App {
    public static void main(String[] args) throws Exception {
        runApplication();
    }

    private static void runApplication() {
        MainWindow mainWindow = createMainWindow();
        MainController mainController = new MainController(mainWindow);
        showMainWindow(mainWindow);
    }

    private static MainWindow createMainWindow() {
        return new MainWindow();
    }

    private static void showMainWindow(MainWindow mainWindow) {
        mainWindow.setVisible(true);
    }
}
