package com.justinemirgreen.visitchattanooga;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsFragment extends Fragment {

    public EventsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.riverbend_name, R.string.riverbend_address, R.string.riverbend_description, R.drawable.riverbendfestival));
        locations.add(new Location(R.string.coolidge_name, R.string.coolidge_address, R.string.coolidge_description, R.drawable.coolidgepark));
        locations.add(new Location(R.string.chatt_market_name, R.string.chatt_market_address, R.string.chatt_market_description, R.drawable.chattanoogamarket));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}
