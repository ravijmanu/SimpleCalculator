package com.example.simplecal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
    }
    public void calculate(View view){
        String tag = view.getTag().toString();
        result.setText(tag);

        double n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());

        double ans = 0;

//        if (tag.equals("add")){
//            ans = n1 + n2;
//        }
//
//        if (tag.equals("sub")){
//            ans = n1 - n2;
//        }
//
//        if (tag.equals("mul")){
//            ans = n1 * n2;
//        }
//
//        if (tag.equals("div")){
//            ans = n1 / n2;
//        }

        switch(tag){
            case "add": ans = n1 + n2; break;
            case "sub": ans = n1 - n2; break;
            case "mul": ans = n1 * n2; break;
            case "div": ans = n1 / n2; break;
        }

        result.setText("" + ans);

    }
    public void btnClr(View v) {
        num1.setText("");
        num2.setText("");
        result.setText("");
    }
}