package com.example.administrator.gustoso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class admin_complete_delivery extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_complete_delivery);


    }
    public void deliverySummary(View view) {
        Intent intent = new Intent(this, admin_view_complete_delivery.class);
        startActivity(intent);
    }
}
