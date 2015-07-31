package com.nganga.dare2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.airbnb.android.airmapview.AirMapView;
import com.dexafree.materialList.cards.SmallImageCard;
import com.dexafree.materialList.controller.OnDismissCallback;
import com.dexafree.materialList.controller.RecyclerItemClickListener;
import com.dexafree.materialList.model.Card;
import com.dexafree.materialList.model.CardItemView;
import com.dexafree.materialList.view.MaterialListView;

/**
 * Created by nganga on 7/31/15.
 */
public class Nairobi extends Activity {
    private MaterialListView mListView;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nairobi);

       /* / Save a reference to the context*/
        mContext = this;


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
        mListView.add(card4);

        // Set the dismiss listener
        mListView.setOnDismissCallback(new OnDismissCallback() {
            @Override
            public void onDismiss(Card card, int position) {

                // Recover the tag linked to the Card
                String tag = card.getTag().toString();

                // Show a toast
                Toast.makeText(mContext, "You have dismissed a " + tag, Toast.LENGTH_SHORT).show();
            }
        });

        mListView.addOnItemTouchListener(new RecyclerItemClickListener.OnItemClickListener() {

            @Override
            public void onItemClick(CardItemView view, int position) {
                mapView = (AirMapView) findViewById(R.id.map_view);
                mapView.initialize(getSupportFragmentManager());
            }

            @Override
            public void onItemLongClick(CardItemView view, int position) {
                Log.d("LONG_CLICK", view.getTag().toString());
            }
        });

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
