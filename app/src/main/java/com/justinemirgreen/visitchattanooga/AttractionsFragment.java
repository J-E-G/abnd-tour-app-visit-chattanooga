package com.justinemirgreen.visitchattanooga;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.chattanooga_zoo_name, R.string.chattanooga_zoo_address, R.string.chattanooga_zoo_description, R.drawable.chatanoogazoo));
        locations.add(new Location(R.string.tn_aquarium_name, R.string.tn_aquarium_address, R.string.tn_aquarium_description, R.drawable.tennesseeaquarium));
        locations.add(new Location(R.string.rock_city_name, R.string.rock_city_address, R.string.rock_city_description, R.drawable.rockcity));
        locations.add(new Location(R.string.lake_winnie_name, R.string.lake_winnie_address, R.string.lake_winnie_description, R.drawable.lakewinnie));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}
