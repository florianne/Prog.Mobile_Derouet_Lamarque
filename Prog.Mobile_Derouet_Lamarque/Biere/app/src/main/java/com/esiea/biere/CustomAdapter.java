package com.esiea.biere;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private String[] mDataSet;

    public CustomAdapter(String[] dataSet){
        mDataSet = dataSet;
    }
    @Override
    public int getCount() {
        return mDataSet.length;
    }

    @Override
    public String getItem(int position) {
        return mDataSet[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent,false);
        }

        TextView biere = (TextView)convertView.findViewById(R.id.txt_row);
        biere.setText(getItem(position));

        return convertView;
    }
}
