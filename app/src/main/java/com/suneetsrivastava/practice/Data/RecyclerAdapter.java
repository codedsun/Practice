package com.suneetsrivastava.practice.Data;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.suneetsrivastava.practice.R;

import java.util.List;

/**
 * Created by suneetsrivastava on 12/01/18.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private List<Item> items;
    private Context c;

    public RecyclerAdapter(List<Item> items, Context c) {
        this.items = items;
        this.c = c;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(LayoutInflater.from(c).inflate(R.layout.adapter,parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.id.setText(items.get(position).getText());
        holder.text.setText(items.get(position).getText());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView id;
        private TextView text;
        public ViewHolder(View itemView) {
            super(itemView);
            id = (TextView) itemView.findViewById(R.id.id);
            text = (TextView) itemView.findViewById(R.id.text);

        }
    }
}
