package satyaki.com.eventstracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private ListView listView;
    private ListView activity_eventslistlayout;

    private String EventNames[] = {

            "Metallica Concert",
            "Saree Exhibition",
            "Wine Tasting",
            "Startups Meet",
            "Summer Noon Party",
            "Rock n Roll Nights",
            "Barbecue Fridays",
            "Summer Workshop",
            "Impressions & Expressions",
            "Italian Carnival"
    };

    private String VenueNames[] = {

            "Palace Grounds",
            "Malleswaram Grounds",
            "Links Brewery",
            "Kanteerava Indoor Stadium",
            "Kumara Park",
            "Sarjapur Road",
            "Whitefield",
            "Indiranagar",
            "MG Road",
            "Electronic City"
    };

    private String EntryType[] = {

            "Paid",
            "Free",
            "Paid",
            "Paid",
            "Paid",
            "Paid",
            "Paid",
            "Free",
            "Free",
            "Free"

    };

    private Integer imageid[] = {


            R.drawable.metallica,
            R.drawable.sareeexhibit,
            R.drawable.wine,
            R.drawable.startups,
            R.drawable.summernoon,
            R.drawable.rocknroll,
            R.drawable.barbecue,
            R.drawable.summerworkshop,
            R.drawable.impressionsnexpressions,
            R.drawable.italiancarnival

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EventsListActivity eventsListActivity = new EventsListActivity(this, EventNames, VenueNames, EntryType, imageid);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(eventsListActivity);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(MainActivity.this, SingleEventDetail.class);

                i.putExtra("Event Name", EventNames);
                i.putExtra("Venue Name", VenueNames);
                i.putExtra("Entry Type", EntryType);
                startActivity(i);
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
