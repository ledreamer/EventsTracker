package satyaki.com.eventstracker;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by satyaki on 11/11/15.
 */
public class EventsListActivity extends ArrayAdapter<String> {

    private String[] EventNames;
    private String[] VenueNames;
    private String[] EntryType;
    private Integer[] imageid;
    private Activity context;

    public EventsListActivity(Activity context, String[] EventNames, String[] VenueNames, String[] EntryType, Integer[] imageid){

        super(context, R.layout.activity_eventslistlayout, EventNames);

        this.context = context;
        this.EventNames = EventNames;
        this.VenueNames = VenueNames;
        this.EntryType = EntryType;
        this.imageid = imageid;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.activity_eventslistlayout, null, true);

        TextView ENames = (TextView) listViewItem.findViewById(R.id.EventName);
        TextView VNames = (TextView) listViewItem.findViewById(R.id.VenueName);
        TextView EType = (TextView) listViewItem.findViewById(R.id.EntryType);
        ImageView image = (ImageView) listViewItem.findViewById(R.id.imageView);

        ENames.setText(EventNames[position]);
        VNames.setText(VenueNames[position]);
        EType.setText(EntryType[position]);
        image.setImageResource(imageid[position]);
        return listViewItem;
    }


    }




