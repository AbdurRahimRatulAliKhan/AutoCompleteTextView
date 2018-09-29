package com.example.dell.autocompletetextview;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView searchView;
    String[] country = {"America", "Bangladesh", "Canada", "Japan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        searchView = findViewById(R.id.aucompleteTxtViewId);

        String[] country = getResources().getStringArray(R.array.name);

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.simple_layout, R.id.txtViewId, country);
        searchView.setAdapter(adapter);
    }

    public void showAlert(View view) {
        AlertDialog.Builder builder = new  AlertDialog.Builder(this);
        builder.setIcon(R.drawable.ic_launcher_background);
        builder.setTitle("Exit ?");
        builder.setMessage("Are you sure to exit ?");
        builder.setCancelable(false);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });

        builder.setNegativeButton("No", null);
    }
}
