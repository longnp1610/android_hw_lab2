package uit.lab2.nguyenphilong_18521043;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowContactInfoActivity extends AppCompatActivity {

    TextView nameTextView, emailTextView, projectTextView;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_contact_info);

        getTextViewId();
        getButtonId();

        String name = getIntent().getExtras().getString("name");
        String email = getIntent().getExtras().getString("email");
        String project = getIntent().getExtras().getString("project");

        nameTextView.setText(name);
        emailTextView.setText(email);
        projectTextView.setText(project);

        backBtn.setOnClickListener((View v) -> {
            Intent intent = new Intent().setClass(this, ContactInfoActivity.class);
            startActivity(intent);
        });

    }

    private void getTextViewId() {
        nameTextView = findViewById(R.id.nameTextView);
        emailTextView = findViewById(R.id.emailTextView);
        projectTextView = findViewById(R.id.projectTextView);
    }

    private void getButtonId() {
        backBtn = findViewById(R.id.backBtn);
    }
}