package com.coco.numcount.javafxstuffm3p219;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NumberCounterController {
    @FXML
    private Label numberText;
    private int ctr = 0;

    @FXML
    protected void onIncreaseButtonClick(){
        ctr+=1;
        updateLabel();
    }

    @FXML
    protected void onDecreaseButtonClick(){
        ctr-=1;
        updateLabel();
    }

    private void updateLabel(){
        numberText.setText(String.valueOf(ctr));
    }
}
