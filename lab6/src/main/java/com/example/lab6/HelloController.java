package com.example.lab6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.event.Event;

public class HelloController {
    public Button number7;
    @FXML
    public TextField txtResult;
    String op ="";
    long number1;
    long number2;
    @FXML
    public void onNumberClicked(ActionEvent event)
    {
        String no = ((Button)event.getSource()).getText();
        txtResult.setText(txtResult.getText()+no);
    }
    public void Operation (ActionEvent ae){

        String operation = ((Button)ae.getSource()).getText();
        if (!operation.equals("=")){

            if(!op.isEmpty()){
                return;
            }
            op = operation;
            number1 = Long.parseLong(txtResult.getText());
            txtResult.setText("");
        }else {

            if(op.isEmpty()){
                return;
            }
            number2 = Long.parseLong(txtResult.getText());
            calculate(number1, number2, op);
            op="";
        }
    }
    public void calculate (long n1, long n2, String op){

        switch (op){

            case "+" : txtResult.setText(n1 + n2 + "");break;
            case "-" : txtResult.setText(n1 - n2 + "");break;
            case "x" : txtResult.setText(n1 * n2 + "");break;
            case "/" :
                if (n2 == 0){
                    txtResult.setText("0");break;
                }
                txtResult.setText(n1/n2+ "");break;

        }

    }


}