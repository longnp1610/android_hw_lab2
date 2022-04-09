package uit.lab2.nguyenphilong_18521043;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button calcButton, colorChangeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getButtonId();

        calcButton.setOnClickListener((View view) -> redirectToCalc());
        colorChangeButton.setOnClickListener((View view) -> redirectToColorChange());
    }

    private void getButtonId() {
        calcButton = (Button) findViewById(R.id.calculator_btn);
        colorChangeButton = (Button) findViewById(R.id.colorChange_btn);
    }

    private void redirectToCalc() {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, CalculatorActivity.class);
        startActivity(intent);
    }

    private void redirectToColorChange() {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, ColorChangeActivity.class);
        startActivity(intent);
    }
}