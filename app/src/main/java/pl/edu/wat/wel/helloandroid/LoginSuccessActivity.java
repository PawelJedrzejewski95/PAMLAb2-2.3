package pl.edu.wat.wel.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginSuccessActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login_success);

        Intent intent = getIntent();
        String username = intent.getStringExtra(MainActivity.USER_NAME);
        TextView textView1 = findViewById(R.id.textshow);
        textView1.setText("Witaj "+ username);





    }
}
