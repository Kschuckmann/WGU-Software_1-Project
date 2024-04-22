package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Models.InHouse;
import Models.Inventory;
import Models.Outsourced;
import Models.Product;

/**
 *
 * @author Karl Schuckmann
 */

public class InventoryProgram extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/MainScreen.fxml"));
        primaryStage.setTitle("Inventory Management System");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {

        //Add sample parts
        int partId = Inventory.getNewPartId();
        InHouse digitalInd01 = new InHouse(partId,"Digital Indicator 0-1", 50.50, 100, 1, 150,
                1101);
        partId = Inventory.getNewPartId();
        InHouse digitalInd12 = new InHouse(partId,"Digital Indicator 1-2", 111.12, 10, 1, 25,
                12004);
        partId = Inventory.getNewPartId();
        InHouse digitalInd23 = new InHouse(partId,"Digital Indicator 2-3", 156.45, 3, 1, 10,
                13007);
        partId = Inventory.getNewPartId();
        Outsourced t50Element = new Outsourced(partId, "T50 Penetration Element",145.45, 7, 25,
                100, "Acument");
        Inventory.addPart(digitalInd01);
        Inventory.addPart(digitalInd12);
        Inventory.addPart(digitalInd23);
        Inventory.addPart(t50Element);

        //Add sample product
        int productId = Inventory.getNewProductId();
        Product t50Gage = new Product(productId, "T50 Gage - 1", 145.45, 7, 1,
                25);
        t50Gage.addAssociatedPart(digitalInd01);
        t50Gage.addAssociatedPart(digitalInd12);
        t50Gage.addAssociatedPart(digitalInd23);
        t50Gage.addAssociatedPart(t50Element);
        Inventory.addProduct(t50Gage);

        launch(args);
    }
}
