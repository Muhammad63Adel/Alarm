package com.example.muhammad.alarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {

    int status  = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




/*

        size.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                    large.setVisibility(View.VISIBLE);
                    small.setVisibility(View.INVISIBLE);
                    size.setText("make it small");




            }
        });



    }


*/

    }
    public void onClickBtn(View v)
    {


    final Button size = (Button) findViewById(R.id.size_button);
    final TextView small = (TextView) findViewById(R.id.small_clock);
    final TextView large = (TextView) findViewById(R.id.big_clock);


        if (status == 0) {
            large.setVisibility(View.VISIBLE);
            small.setVisibility(View.INVISIBLE);
            size.setText("make it small");
            status = 1;
        }else {
            small.setVisibility(View.VISIBLE);
            large.setVisibility(View.INVISIBLE);
            size.setText("make it large");
            status = 0;
        }
    }


}
