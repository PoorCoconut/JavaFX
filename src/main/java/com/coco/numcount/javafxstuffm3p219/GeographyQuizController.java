package com.coco.numcount.javafxstuffm3p219;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import org.kordamp.bootstrapfx.scene.layout.Panel;

public class GeographyQuizController {

    @FXML
    private Label scoreLabel;

    @FXML
    private Pane panel1;
    @FXML
    private TextField question1TextField;
    private int isQ1Correct;

    @FXML
    private Pane panel2;
    @FXML
    private TextField question2TextField;
    private int isQ2Correct;

    @FXML
    private Pane panel3;
    @FXML
    private TextField question3TextField;
    private int isQ3Correct;

    @FXML
    private Pane panel4;

    @FXML
    private Button nextButton;
    @FXML
    private Button prevButton;

    private int score = 0;
    private int panel_ctr = 1;

    @FXML
    public void initialize(){
        panel1.setVisible(true);
        panel1.setManaged(true);

        panel2.setVisible(false);
        panel2.setManaged(false);

        panel3.setVisible(false);
        panel3.setManaged(false);

        panel4.setVisible(false);
        panel4.setManaged(false);

        prevButton.setVisible(false);
    }

    @FXML
    protected void onNextButtonClicked(){
        if(panel_ctr == 1){
            if(question1TextField.getText().equals("Paris")){
                isQ1Correct = 1;
            }
            else{
                isQ1Correct = 0;
            }
        } else if (panel_ctr == 2) {
            if(question2TextField.getText().equals("Tokyo")){
                isQ2Correct = 1;
            }
            else{
                isQ2Correct = 0;
            }
        } else if (panel_ctr == 3) {
            if(question3TextField.getText().equals("Berlin")){
                isQ3Correct = 1;
            }
            else{
                isQ3Correct = 0;
            }
        }
        score = isQ1Correct + isQ2Correct + isQ3Correct;
        scoreLabel.setText("Your Score: " + score + "/3");
        panel_ctr++;
        updateQuiz();
    }

    @FXML
    protected void onPrevButtonClicked(){
        panel_ctr--;
        updateQuiz();
    }

    private void updateQuiz(){
        if(panel_ctr == 1){
            panel1.setVisible(true);
            panel1.setManaged(true);

            panel2.setVisible(false);
            panel1.setManaged(false);

            prevButton.setVisible(false);
        } else if (panel_ctr == 2) {
            panel1.setVisible(false);
            panel1.setManaged(false);

            panel2.setVisible(true);
            panel2.setManaged(true);

            panel3.setVisible(false);
            panel3.setManaged(false);

            prevButton.setVisible(true);
        } else if (panel_ctr == 3) {
            panel2.setVisible(false);
            panel2.setManaged(false);

            panel3.setVisible(true);
            panel3.setManaged(true);

            panel4.setVisible(false);
            panel4.setManaged(false);

            nextButton.setVisible(true);
        } else{
            panel3.setVisible(false);
            panel3.setManaged(false);

            panel4.setVisible(true);
            panel4.setManaged(true);

            nextButton.setVisible(false);
        }
    }
}
