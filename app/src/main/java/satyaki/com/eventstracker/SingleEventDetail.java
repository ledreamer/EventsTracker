package satyaki.com.eventstracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by satyaki on 11/11/15.
 */
public class SingleEventDetail extends Activity{

    TextView ENames;
    TextView VNames;
    TextView Etype;

    String[] EventName;
    String[] VenueName;
    String[] EntryType;
    int position;

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleeventdetail);

        Intent i = getIntent();

        position = i.getExtras().getInt("position");
        EventName = i.getStringArrayExtra("EventName");
        VenueName = i.getStringArrayExtra("VenueName");
        EntryType = i.getStringArrayExtra("EntryType");

        ENames = (TextView) findViewById(R.id.EventName);
        VNames = (TextView) findViewById(R.id.VenueName);
        Etype = (TextView) findViewById(R.id.EntryType);

        ENames.setText(EventName[position]);
        VNames.setText(VenueName[position]);
        Etype.setText(EntryType[position]);
    }
}
