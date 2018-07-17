package com.justinemirgreen.visitchattanooga;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    public FoodFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.loc_eight_name, R.string.loc_eight_address, R.string.loc_eight_description, R.drawable.urbanstack));
        locations.add(new Location(R.string.loc_nine_name, R.string.loc_nine_address, R.string.loc_nine_description, R.drawable.publichousechattanooga));
        locations.add(new Location(R.string.loc_ten_name, R.string.loc_ten_address, R.string.loc_ten_description, R.drawable.sluggosnorthvegetariancafe));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}
