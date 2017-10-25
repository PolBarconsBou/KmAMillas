package edu.upc.eseiaat.pma.kmamillas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btn_a_millas);
        final EditText edit_km = (EditText) findViewById(R.id.edit_km);
        final EditText edit_millas = (EditText) findViewById(R.id.edit_millas);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String skm = edit_km.getText().toString();
                float km = Float.parseFloat(skm);
                float millas = km / 1.609f;
                String smillas = String.format("%f", millas);
                edit_millas.setText(smillas);
            }
        });
    }
}
