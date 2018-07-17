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
        locations.add(new Location(R.string.chattanooga_zoo_name, R.string.loc_one_address, R.string.loc_one_description, R.drawable.chatanoogazoo));
        locations.add(new Location(R.string.loc_two_name, R.string.loc_two_address, R.string.loc_two_description, R.drawable.tennesseeaquarium));
        locations.add(new Location(R.string.loc_three_name, R.string.loc_three_address, R.string.loc_three_description, R.drawable.rockcity));
        locations.add(new Location(R.string.loc_four_name, R.string.loc_four_address, R.string.loc_four_description, R.drawable.lakewinnie));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}
