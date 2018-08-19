package com.example.dell.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrderDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        Intent i = getIntent();
        OrdersItem ordersItem = (OrdersItem) i.getSerializableExtra("Order");

        String billNumber = ordersItem.getBillNumber();
        this.setTitle(billNumber);

        TextView type = (TextView) findViewById(R.id.type);
        type.setText(ordersItem.getType());

        TextView date = (TextView) findViewById(R.id.date);
        date.setText(ordersItem.getDate());

        TextView status = (TextView) findViewById(R.id.status);
        status.setText(ordersItem.getStatus());

        TextView street = (TextView) findViewById(R.id.street);
        street.setText(ordersItem.getStreet());

        TextView area = (TextView) findViewById(R.id.area);
        area.setText(ordersItem.getArea());

        TextView pincode = (TextView) findViewById(R.id.pincode);
        pincode.setText(ordersItem.getPinCode());

        TextView city = (TextView) findViewById(R.id.city);
        city.setText(ordersItem.getCity());

        TextView state = (TextView) findViewById(R.id.state);
        state.setText(ordersItem.getState());

        TextView country = (TextView) findViewById(R.id.country);
        country.setText(ordersItem.getCountry());

        TextView personJobAssignedTo = (TextView) findViewById(R.id.personJobAssignedTo);
        personJobAssignedTo.setText(ordersItem.getPersonJobAssignedTo());

        TextView rate = (TextView) findViewById(R.id.Rate);
        rate.setText(ordersItem.getRate());

        TextView tax = (TextView) findViewById(R.id.Tax);
        tax.setText(ordersItem.getTax());

        TextView discount = (TextView) findViewById(R.id.discount);
        discount.setText(Integer.toString(ordersItem.getDiscount()));

        TextView grandTotal = (TextView) findViewById(R.id.grandTotal);
        grandTotal.setText(Integer.toString(ordersItem.getGrandTotal()));

        TextView startTime = (TextView) findViewById(R.id.startTime);
        startTime.setText(ordersItem.getStartTime());

        TextView endTime = (TextView) findViewById(R.id.endTime);
        endTime.setText(ordersItem.getEndTime());

        TextView paymentStatus = (TextView) findViewById(R.id.paymentStatus);
        paymentStatus.setText(ordersItem.getStatus());

        TextView servicesRequiredFor = (TextView) findViewById(R.id.servicesRequiredFor);
        servicesRequiredFor.setText(ordersItem.getServicesRequiredFor());

        TextView servicePlace = (TextView) findViewById(R.id.servicePlace);
        servicePlace.setText(ordersItem.getServicePlace());


    }
}
