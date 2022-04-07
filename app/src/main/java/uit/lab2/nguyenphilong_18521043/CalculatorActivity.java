package uit.lab2.nguyenphilong_18521043;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    Button num0, num1, num2, num3, num4, num5, num6, num7, num8, num9,
            MinusButton, PlusButton, MultiplyButton, DivideButton, DotButton, PercentButton;

    Button DelButton, ResultButton;

    TextView inputTextView, resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        getButtonId();
        getTextViewId();
    }

    // Get all Button ID
    private void getButtonId() {
        // Numeric Buttons
        num0 = findViewById(R.id.btn_Zero);
        num1 = findViewById(R.id.btn_One);
        num2 = findViewById(R.id.btn_Two);
        num3 = findViewById(R.id.btn_Three);
        num4 = findViewById(R.id.btn_Four);
        num5 = findViewById(R.id.btn_Five);
        num6 = findViewById(R.id.btn_Six);
        num7 = findViewById(R.id.btn_Seven);
        num8 = findViewById(R.id.btn_Eight);
        num9 = findViewById(R.id.btn_Nine);

        // Operator Button
        MinusButton = findViewById(R.id.btn_Minus);
        PlusButton = findViewById(R.id.btn_Plus);
        MultiplyButton = findViewById(R.id.btn_Multiply);
        DivideButton = findViewById(R.id.btn_Divide);
        DotButton = findViewById(R.id.btn_Dot);
        PercentButton = findViewById(R.id.btn_Percent);
        DelButton = findViewById(R.id.btn_Clear);
        ResultButton = findViewById(R.id.btn_Equal);
    }

    // Get all TextView ID
    private void getTextViewId() {
        inputTextView = findViewById(R.id.textInput);
        resultTextView = findViewById(R.id.textResult);
    }
}