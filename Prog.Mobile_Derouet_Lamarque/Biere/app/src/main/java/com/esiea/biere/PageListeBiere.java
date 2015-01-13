package com.esiea.biere;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.List;
import java.util.Vector;


public class PageListeBiere extends ActionBarActivity {

    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_layout);
        initialisePaging();
    }

    private void initialisePaging() {
        List<Fragment> fragments = new Vector<Fragment>();
        fragments.add(Fragment.instantiate(this,Nom.class.getName()));
        fragments.add(Fragment.instantiate(this,Categorie.class.getName()));
        mPagerAdapter = new PagerAdapter(this.getSupportFragmentManager(), fragments);

        ViewPager pager = (ViewPager)findViewById(R.id.viewpager);
        pager.setAdapter(mPagerAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_page_liste_biere, menu);
        //return true;
        MenuInflater mif = getMenuInflater();
        mif.inflate(R.menu.main_activity_action, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            settingsPopup();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void settingsPopup() {

        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Nous contacter :");
        alertDialog.setMessage("- Florianne Derouet\nderouet-pulin@et.esiea.fr\n- Renaud Lamarque\nlamarque@et.esiea.fr");
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alertDialog.show();
    }
}
