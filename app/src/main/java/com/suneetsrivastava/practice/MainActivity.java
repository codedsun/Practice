package com.suneetsrivastava.practice;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import com.suneetsrivastava.practice.Data.Item;
import com.suneetsrivastava.practice.ViewModel.DataViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private List<Item> itemList = new ArrayList<>();
    private DataViewModel dataViewModel;
    private FloatingActionButton floatingActionButton;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
//        dataViewModel = ViewModel;
        floatingActionButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == floatingActionButton.getId()){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
//            builder.setPositiveButton("Add")

        }
    }
}
