package com.example.sql_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayPage extends AppCompatActivity {
    TextView contents;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_page);
        contents = (TextView) findViewById(R.id.content);
        dbHelper = new DBHelper(DisplayPage.this,DBHelper.DBNAME,null,DBHelper.DBVERSION);
        String data = dbHelper.displayUsers();
        contents.setText(data);
    }
}