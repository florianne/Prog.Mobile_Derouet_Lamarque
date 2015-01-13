package com.esiea.biere;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class Categorie extends Fragment {

    protected String[] mDataset;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }
        return (LinearLayout) inflater.inflate(R.layout.categorie, container, false);
    }
    private void initDataset(){
        mDataset = new String[60];
        for(int i=0; i<60; i++){
            mDataset[i] = "This is element #"+i;
        }
    }
}