package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view)
    {
        Log.i("Info","Button pressed");

        EditText myTextField = (EditText) findViewById(R.id.textField);
        // getText() get the text that the user entered in the text field
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        String str = myTextField.getText().toString();
        goToActivity2(str);

    }

   public void goToActivity2(String s)
    {
        Intent intent = new Intent(this, Main2Activity.class);
        // putExtra() function helps us pass data to the second activity
        intent.putExtra("message",s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
