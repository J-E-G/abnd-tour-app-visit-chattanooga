package com.justinemirgreen.visitchattanooga;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalSitesFragment extends Fragment {

    public HistoricalSitesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.choo_choo_name, R.string.choo_choo_address, R.string.choo_choo_description));
        locations.add(new Location(R.string.civil_war_museum_name, R.string.civil_war_museum_address, R.string.civil_war_museum_description));
        locations.add(new Location(R.string.chickamauga_dam_name, R.string.chickamauga_dam_address, R.string.chickamauga_dam_description));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}
