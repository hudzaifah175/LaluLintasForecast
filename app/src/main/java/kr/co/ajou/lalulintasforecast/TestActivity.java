package kr.co.ajou.lalulintasforecast;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestActivity extends AppCompatActivity {
    private TextView currentHours, currentDay, currentDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        currentHours = findViewById(R.id.currentTime);
        SimpleDateFormat hoursFormat = new SimpleDateFormat("h:mm a");
        String currentTime = hoursFormat.format(new Date());
        currentHours.setText(currentTime);

        currentDay = findViewById(R.id.currentDay);
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        String currentDayFormat = dayFormat.format(new Date());
        currentDay.setText(currentDayFormat);

        currentDate = findViewById(R.id.currentDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMd, dd, yyyy");
        String currentDateFormat = dateFormat.format(new Date());
        currentDate.setText(currentDateFormat);

        // get CurrentLocation
        
    }
}
