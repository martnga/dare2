package com.nganga.dare2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.dexafree.materialList.cards.SmallImageCard;
import com.dexafree.materialList.view.MaterialListView;

/**
 * Created by nganga on 7/31/15.
 */
public class Nairobi extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nairobi);

        MaterialListView mListView = (MaterialListView) findViewById(R.id.material_listview);

        SmallImageCard card = new SmallImageCard(this);
        card.setDescription("Kenya's Tourism Hub");
        card.setTitle("Mombasa");
        card.setDrawable(R.drawable.mombasa);


        SmallImageCard card2 = new SmallImageCard(this);
        card.setDescription("Africa's Rising Star");
        card.setTitle("Nairobi");
        card.setDrawable(R.drawable.nairobi);


        SmallImageCard card3 = new SmallImageCard(this);
        card.setDescription("The Lake Side");
        card.setTitle("Kisumu");
        card.setDrawable(R.drawable.kisumu);


        SmallImageCard card4 = new SmallImageCard(this);
        card.setDescription("City In the Sun");
        card.setTitle("Moyale");
        card.setDrawable(R.drawable.moyale);

        mListView.add(card);
        mListView.add(card2);
        mListView.add(card3);
        mListView.add(card4git);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
