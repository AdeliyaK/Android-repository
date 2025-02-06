package com.example.secondhelloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //TODO: complete this





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onBtnClick(View view){
        TextView textHello = findViewById(R.id.txtMessage);
        EditText edtTxtName = findViewById(R.id.edtTextName);
        EditText edtTxtFamilyname = findViewById(R.id.edtTextFamilyname);
        EditText editTxtEmail = findViewById(R.id.edtTextEmail);



        //textHello.setText("Hello ".concat(edtTxtName.getText().toString()));
        textHello.setText("Hello " + edtTxtName.getText().toString() + " " + edtTxtFamilyname.getText().toString() + "\n" + "Your email is: " + editTxtEmail.getText().toString());
    }

}