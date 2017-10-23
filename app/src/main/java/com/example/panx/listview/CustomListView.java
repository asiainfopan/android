package com.example.panx.listview;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by panx on 2017/10/21.
 */

public class CustomListView extends Activity {

    private ListView lv;

//    public BaseAdapter adapter = new BaseAdapter() {
//
////        private String[] data = new String[]{"eoe1", "eoe2", "eoe3", "eoe4", "eoe5", "eoe6", "eoe7", "eoe8", "eoe9", "eoe10"};
//
//        private CustomListCellData[] data = new CustomListCellData[]{
//                new CustomListCellData("张三", "zs", R.drawable.img1),
//                new CustomListCellData("李四", "ls", R.drawable.img2),
//                new CustomListCellData("王五", "ww", R.drawable.img3)
//        };
//
//        @Override
//        public int getCount() {
//            return data.length;
//        }
//
//        @Override
//        public CustomListCellData getItem(int position) {
//            return data[position];
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return position;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
////            TextView tx = null;
////            if (convertView != null) {
////                tx = (TextView) convertView;
////            } else {
////                tx = new TextView(CustomListView.this);
////            }
//////                    TextView tx = new TextView(CustomListView.this);
////            tx.setText(getItem(position));
////            tx.setTextSize(50);
////            return tx;
//
//            LinearLayout ll = null;
//            if (convertView != null) {
//                ll = (LinearLayout) convertView;
//            } else {
//                ll = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.custom_list_cell, null);
////                ll = (LinearLayout) findViewById(R.layout.custom_list_cell);
//            }
//            ImageView icon = ll.findViewById(R.id.icon);
//            TextView name = ll.findViewById(R.id.name);
//            TextView des = ll.findViewById(R.id.des);
//
//            CustomListCellData data = getItem(position);
//            icon.setImageResource(data.iconId);
//            name.setText(data.name);
//            des.setText(data.des);
//            return ll;
//        }
//    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_view);
        lv = findViewById(R.id.lv);
        lv.setAdapter(new CustomListViewAdapter(this));
    }
}
