package com.justinemirgreen.visitchattanooga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * {@link LocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Location} objects.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    /**
     * Create a new {@link LocationAdapter} object.
     *
     * @param context   is the current context (i.e. Activity) that the adapter is being created in.
     * @param locations is the list of {@link Location}s to be displayed.
     */
    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Location} object located at this position in the list
        Location currentLocation = getItem(position);

        // Update the Location Name
        TextView locationNameTextView = (TextView) listItemView.findViewById(R.id.locationName);
        locationNameTextView.setText(currentLocation.getLocationNameId());

        // Update the Location Address
        TextView locationAddressTextView = (TextView) listItemView.findViewById(R.id.locationAddress);
        locationAddressTextView.setText(currentLocation.getLocationAddressId());

        // Update the Location Description
        TextView locationDescriptionTextView = (TextView) listItemView.findViewById(R.id.locationDescription);
        locationDescriptionTextView.setText(currentLocation.getLocationDescriptionId());

        // Update Location Image (if available)
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.locationImage);
        // Check if an image is provided for this location or not
        if (currentLocation.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentLocation.getLocationImageId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}