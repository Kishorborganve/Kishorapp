package com.kishorapp.app;

import androidx.appcompat.app.AppCompatActivity;

//import android.content.Intent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//..import android.view.View;
//import android.widget.Button;


public class MainActivity2 extends AppCompatActivity {
Button Calendar;
TextView the_date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Calendar =findViewById(R.id.button1);
        the_date=findViewById(R.id.button2);

        Intent incomingIntent = getIntent();
        String date = incomingIntent.getStringExtra("date");
        the_date.setText(date);

        Calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this, CalendarLayout.class);
                startActivity(intent);
            }
        });
    }
}