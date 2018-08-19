package com.example.dell.myapplication;

import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.LoginFilter;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    private StorageReference mStorageRef ;
    public ArrayList  orders = new ArrayList<>();

    ListView ordersListView;
    OrdersAdapter ordersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference().child("orders");
        //mStorageRef = FirebaseStorage.getInstance().getReference();

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot childSnapshot: dataSnapshot.getChildren()) {
//                    Log.i("deewani",childSnapshot.getKey());
                        ArrayList eachOrder = new ArrayList();
                        OrdersItem ordersItem = childSnapshot.getValue(OrdersItem.class);
                        ordersAdapter.add(ordersItem);

                    for(DataSnapshot ordersSnapshot : childSnapshot.getChildren()){
                        //loop 2 to go through all the child nodes of orders node
                        //Log.i("OrdersSnapshor",ordersSnapshot.child("pinCode").getValue().toString());
//                        Log.i("ChildrenChildren",dataSnapshot.child("area").getValue().toString());
//                        eachOrder.add(ordersSnapshot.getValue().toString());
//                        OrdersItem ordersItem = childSnapshot.getValue(OrdersItem.class);
//                        ordersAdapter.add(ordersItem);
//                        Log.i("Orders Item", ordersItem.toString());
                    }
//                    Log.i("EachOrder",eachOrder.toString());
//                    orders.add(eachOrder);
//                    //Log.i("AllOrders",orders.toString());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        ordersListView = (ListView) findViewById(R.id.orders_list_view);

        final List<OrdersItem> orders = new ArrayList<OrdersItem>();
//        orders.add(new OrdersItem("04","BE:555","Electrician","Pending",0,R.drawable.naruto));
//        orders.add(new OrdersItem("04","BE:555","Electrician","Pending",0,R.drawable.naruto));
//        orders.add(new OrdersItem("04","BE:555","Electrician","Pending",0,R.drawable.naruto));
//        orders.add(new OrdersItem("04","BE:555","Electrician","Pending",0,R.drawable.naruto));
//        orders.add(new OrdersItem("04","BE:555","Electrician","Pending",0,R.drawable.naruto));
//        orders.add(new OrdersItem("04","BE:555","Electrician","Pending",0,R.drawable.naruto));

        ordersAdapter = new OrdersAdapter(this, (ArrayList<OrdersItem>) orders);
        ordersListView.setAdapter(ordersAdapter);

        ordersListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),OrderDetailsActivity.class);
                intent.putExtra("Order", (Serializable) orders.get(i));
                startActivity(intent);
            }
        });




    }
}
