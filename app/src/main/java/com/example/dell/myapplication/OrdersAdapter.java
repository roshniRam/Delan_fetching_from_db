package com.example.dell.myapplication;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class OrdersAdapter extends ArrayAdapter<OrdersItem> {

    public OrdersAdapter(@NonNull Activity context, @NonNull ArrayList<OrdersItem> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.orders_list,parent,false);
        }

        OrdersItem ordersItem = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(R.drawable.naruto);

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_text_view);
        dateTextView.setText(ordersItem.getDate());

        TextView billNumberTextView = (TextView) listItemView.findViewById(R.id.bill_number_text_view);
        billNumberTextView.setText(ordersItem.getBillNumber());

        TextView typeTextView = (TextView) listItemView.findViewById(R.id.type_text_view);
        typeTextView.setText(ordersItem.getType());

        TextView statusTextView = (TextView) listItemView.findViewById(R.id.status_text_view);
        statusTextView.setText(ordersItem.getStatus());

        TextView amountTextView = (TextView) listItemView.findViewById(R.id.garnd_total_text_view);
        amountTextView.setText("Rs."+ ordersItem.getGrandTotal());

        TextView personName = (TextView) listItemView.findViewById(R.id.personName);
        personName.setText(ordersItem.getPersonJobAssignedTo());

        return listItemView;
    }
}
