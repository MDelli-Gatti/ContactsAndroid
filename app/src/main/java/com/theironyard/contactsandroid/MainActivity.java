package com.theironyard.contactsandroid;

import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayAdapter<Contact> contacts;

    ListView list;
    EditText name;
    EditText phone;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listView);
        name = (EditText) findViewById(R.id.name);
        phone = (EditText) findViewById(R.id.phone);
        add = (Button) findViewById(R.id.add);

        add.setOnClickListener(this);
        list.setAdapter(contacts);
    }

    @Override
    public void onClick(View v) {
        Contact c = new Contact(name.getText().toString(), phone.getText().toString());
        contacts.add(c);
    }
}
