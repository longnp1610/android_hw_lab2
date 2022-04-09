package uit.lab2.nguyenphilong_18521043;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class ColorChangeActivity extends AppCompatActivity {

    RadioButton redRadio, greenRadio, blueRadio, grayRadio;

    View themeBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_change);
        getRadioButtonId();
        getViewId();
        redRadio.setOnClickListener((View v) -> themeBackground.setBackgroundResource(R.color.red));
        greenRadio.setOnClickListener((View v) -> themeBackground.setBackgroundResource(R.color.green));
        blueRadio.setOnClickListener((View v) -> themeBackground.setBackgroundResource(R.color.blue));
        grayRadio.setOnClickListener((View v) -> themeBackground.setBackgroundResource(R.color.gray));
    }

    private void getRadioButtonId() {
        redRadio = findViewById(R.id.radio_red);
        greenRadio = findViewById(R.id.radio_green);
        blueRadio = findViewById(R.id.radio_blue);
        grayRadio = findViewById(R.id.radio_gray);
    }

    private void getViewId() {
        themeBackground = findViewById(R.id.view_color);
    }
}