package com.example.neilbond.userinput1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int coffeecups = 0;



    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = coffeecups * 5 ;
        String priceMessage = "total due : £" + price +"\n thank you " ;
        displayMessage(priceMessage);

    }


    public void plus (View view ){

        coffeecups=coffeecups +1;
        display(coffeecups);

    }
    public void minus (View view){

        coffeecups=coffeecups -1 ;
        display (coffeecups);
    }




    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));

    }





    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

}