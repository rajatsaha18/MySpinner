package com.example.myspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] countryNames;
    private Spinner spinner;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.country_names);
        spinner = (Spinner) findViewById(R.id.spinnerId);
        textView = (TextView) findViewById(R.id.textViewId);
        button = (Button) findViewById(R.id.buttonId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view, R.id.textViewSampleId,countryNames );
        spinner.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = spinner.getSelectedItem().toString();
                textView.setText(value);
            }
        });
        @Override
        public int getCount(){
            return 0;
        }

    }
}