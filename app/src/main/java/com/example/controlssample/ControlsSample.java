package com.example.controlssample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ControlsSample extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final EditText userName = (EditText) findViewById(R.id.user_name);
        userName.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN)
                        && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    Toast.makeText(getApplicationContext(),
                            userName.getText(),
                            Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });

        Button btnCleare = (Button) findViewById(R.id.btn);

        btnCleare.setOnClickListener(this);
    }

    public void onButtonClicked(View v) {
        Toast.makeText(this, "Кнопка нажата", Toast.LENGTH_SHORT).show();
    }

    public void onCheckboxClicked(View v) {
        if (((CheckBox) v).isChecked()) {
            Toast.makeText(this, "Отмечено", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Не відмічено", Toast.LENGTH_SHORT).show();
        }
    }

    public void onToggleClicked(View v) {
        if (((ToggleButton) v).isChecked()) {
            Toast.makeText(this, "Ввівккнено", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Вимкнено", Toast.LENGTH_SHORT).show();
        }
    }

    public void onRadioButtonClicked(View v) {
        RadioButton rb = (RadioButton) v;
        Toast.makeText(this, "Вибраний звір: " + rb.getText(),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        EditText userName = (EditText) findViewById(R.id.user_name);

        userName.setText("");
    }
}

