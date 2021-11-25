package com.example.statechangesexample;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class StateChangeActivity extends ListActivity {
    private final List<String> stateChanges = new ArrayList<String>();

    private void displayListView() {
//        List<String> stateChanges = new ArrayList<String>(Arrays.asList(stateChangeList));
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this,
                R.layout.state_changes_layout, stateChanges);
        setListAdapter(dataAdapter);

        ListView listView = getListView();

        listView.setTextFilterEnabled(true);

    }
    protected void onCreate(Bundle savedInstanceState) {
        stateChanges.add("onCreate");
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "onCreate Called", Toast.LENGTH_LONG).show();
//
        displayListView();
    }

    protected void onStart() {
        stateChanges.add("onStart");
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart Called", Toast.LENGTH_LONG).show();
        displayListView();
    }

    protected void onRestart() {
        stateChanges.add("onRestart");
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart Called", Toast.LENGTH_LONG).show();
        displayListView();
    }

    protected void onResume() {
        stateChanges.add("onResume");
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume Called", Toast.LENGTH_LONG).show();
        displayListView();
    }
    protected void onPause() {
        stateChanges.add("onPause");
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause Called", Toast.LENGTH_LONG).show();
        displayListView();
    }
    protected void onStop() {
        stateChanges.add("onStop");
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop Called", Toast.LENGTH_LONG).show();
        displayListView();
    }
    protected void onDestroy() {
        stateChanges.add("onDestroy");
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy Called", Toast.LENGTH_LONG).show();
        displayListView();
    }
}
