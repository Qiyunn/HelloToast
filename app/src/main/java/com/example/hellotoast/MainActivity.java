package com.example.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button toast;
    Button count;
    TextView mShowCount;
    int mCount =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast=findViewById(R.id.button_toast);
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "you clicked", Toast.LENGTH_SHORT).show();
            }
        });

        count=findViewById(R.id.button_count);
        mShowCount=findViewById(R.id.show_count);
        count.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mCount++;
                mShowCount.setText(Integer.toString(mCount));
            }
        });

    }
}
