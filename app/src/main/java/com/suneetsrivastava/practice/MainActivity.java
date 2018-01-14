package com.suneetsrivastava.practice;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.suneetsrivastava.practice.Data.Item;
import com.suneetsrivastava.practice.Data.RecyclerAdapter;
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
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        final RecyclerAdapter recyclerAdapter = new RecyclerAdapter(itemList, this);
        recyclerView.setAdapter(recyclerAdapter);
        dataViewModel = ViewModelProviders.of(this).get(DataViewModel.class);
        Observer<List<Item>> listObserver = new Observer<List<Item>>() {
            @Override
            public void onChanged(@Nullable List<Item> items) {
                recyclerAdapter.notifyDataSetChanged();
            }
        };
        floatingActionButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == floatingActionButton.getId()){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            LayoutInflater layoutInflater = this.getLayoutInflater();
            View v1 = layoutInflater.inflate(R.layout.alert_dialog,null);
            final EditText id = (EditText) v1.findViewById(R.id.alertId);
            final EditText text = (EditText) v1.findViewById(R.id.alertTitle);
            builder.setView(v1);
            builder.setTitle("Enter the Item");
            builder.setMessage("Enter the id, description of item");
            builder.setPositiveButton("Add Item", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                 itemList.add(new Item(id.getText().toString(),text.getText().toString()));
                }
            });

            builder.setNegativeButton("Cancel",null);

          AlertDialog alertDialog = builder.create();
          alertDialog.show();


        }
    }
}
