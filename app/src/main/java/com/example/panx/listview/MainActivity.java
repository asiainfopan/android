package com.example.panx.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView ls;

    private ArrayAdapter<ListCellData> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ls = (ListView) findViewById(R.id.listview);
//        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        adapter = new ArrayAdapter<ListCellData>(this, R.layout.list_cell);
        adapter.add(new ListCellData("小明","男",17));
        adapter.add(new ListCellData("小fei","女",17));
        ls.setAdapter(adapter);

        ls.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ListCellData data = adapter.getItem(position);
        Toast.makeText(this, String.format("名字：%s",data.getUsername()), Toast.LENGTH_SHORT).show();
    }
}
