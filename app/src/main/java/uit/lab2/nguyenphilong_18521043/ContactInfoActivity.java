package uit.lab2.nguyenphilong_18521043;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ContactInfoActivity extends AppCompatActivity {
    EditText nameEditText, emailEditText, projectEditText;
    Button viewContactBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);
        getEditTextId();
        getButtonId();

        viewContactBtn.setOnClickListener((View v) -> {
            Intent intent = new Intent(ContactInfoActivity.this, ShowContactInfoActivity.class);
            intent.putExtras(putBundle());
            startActivity(intent);
        });
    }

    private void getEditTextId() {
        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        projectEditText = findViewById(R.id.projectEditText);
    }

    private void getButtonId() {
        viewContactBtn = findViewById(R.id.viewContactBtn);
    }

    private Bundle putBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("name", nameEditText.getText().toString());
        bundle.putString("email", emailEditText.getText().toString());
        bundle.putString("project", projectEditText.getText().toString());
        return bundle;
    }
}