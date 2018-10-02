package com.example.waf7qp.recyclerviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ListItem> itemList;
    private Context context;

    public MyAdapter(List<ListItem> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ListItem listItem = itemList.get(i);

        viewHolder.textViewHeader.setText(listItem.getHeader());
        viewHolder.textViewDetails.setText(listItem.getDetails());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewHeader;
        public TextView textViewDetails;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewHeader = (TextView) itemView.findViewById(R.id.heading);
            textViewDetails = (TextView) itemView.findViewById(R.id.details);
        }
    }
}
