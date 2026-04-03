package com.coco.numcount.javafxstuffm3p219;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class PizzaOrderSystemController {
    @FXML
    private Label totalLabel;
    @FXML
    private ComboBox<String> pizzaSizeChoice;
    @FXML
    private ComboBox<String> pizzaToppingsChoice;
    @FXML
    private ComboBox<String> extraCheeseChoice;
    private int sizeCost;
    private int toppingsCost;
    private int cheeseCost;
    private int totalCost;

    @FXML
    public void initialize(){
        pizzaSizeChoice.getItems().addAll("Small", "Medium", "Large");
        pizzaToppingsChoice.getItems().addAll("Mushrooms", "Pepperoni", "Onions");
        extraCheeseChoice.getItems().addAll("Yes", "No");
    }

    @FXML
    protected void onPizzaSizeChoiceChosen(){
        if (pizzaSizeChoice.getValue().equals("Small")) sizeCost = 10;
        else if (pizzaSizeChoice.getValue().equals("Medium")) sizeCost = 15;
        else sizeCost = 20;
    }

    @FXML
    protected void onPizzaToppingsChoiceChosen(){
        if (pizzaToppingsChoice.getValue() == null) toppingsCost = 0;
        else toppingsCost = 2;
    }

    @FXML
    protected void onExtraCheeseChoiceChosen(){
        if(extraCheeseChoice.getValue().equals("Yes")) cheeseCost = 3;
        else cheeseCost = 0;
    }

    @FXML
    protected void onCalculateButtonClicked(){
        if(pizzaSizeChoice.getValue() == null ||
           pizzaToppingsChoice.getValue() == null ||
           extraCheeseChoice.getValue() == null){
            totalLabel.setText("0");
            return;
        }
        totalCost = sizeCost + toppingsCost + cheeseCost;
        totalLabel.setText(String.valueOf(totalCost));

    }
}
