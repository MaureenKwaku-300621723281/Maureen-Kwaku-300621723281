package com.example.lab3;


import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText redColor, greenColor, blueColor;
    Model color;
    private int one, two, three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        color = new Model(255, 255, 255);
        setContentView(R.layout.activity_main);

        redColor = (EditText) findViewById(R.id.red);
        greenColor = (EditText) findViewById(R.id.green);
        blueColor = (EditText) findViewById(R.id.blue);

        TextChangeHandler tch = new TextChangeHandler();
        redColor.addTextChangedListener(tch);
        greenColor.addTextChangedListener(tch);
        blueColor.addTextChangedListener(tch);
    }
    public void Change(){
        String redText = redColor.getText().toString();
        String greenText = greenColor.getText().toString();
        String blueText = blueColor.getText().toString();

        TextView label = (TextView) findViewById(R.id.label_text);

        try {
            int red = Integer.parseInt(redText);
            int green = Integer.parseInt(greenText);
            int blue = Integer.parseInt(blueText);

            color.setFirst(red);
            color.setSecond(green);
            color.setThird(blue);

            one = color.getFirst();
            two = color.getSecond();
            three = color.getThird();

            label.setBackgroundColor(Color.rgb(one, two, three));
        }
        catch (NumberFormatException nfe){ }
    }

    private class TextChangeHandler implements TextWatcher{
        @Override
        public void afterTextChanged(Editable editable) {
            Change();
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
    }
}