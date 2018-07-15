package com.justinemirgreen.visitchattanooga;

/**
 * {@link Location} represents a location in or nearby Chattanooga, TN.
 * It contains the location name, a short description, the location address,
 * and an optional image for the location.
 */

public class Location {
    // String resource ID for the name of the location
    private int mLocationNameId;
    // String resource ID for the short description of the location.
    private int mLocationDescriptionId;
    // String resource ID for the location address.
    private int mLocationAddressId;
    // Image resource ID for the location image.
    private int mLocationImageId = NO_IMAGE_PROVIDED;
    // Constant value for scenarios where no location image is available.
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a Location object
     *
     * @param locationNameId is the String resource ID for the location name.
     * @param locationDescriptionId is the String resource ID for the location short description.
     * @param locationAddressId is the String resource ID for the location address.
     */
    public Location(int locationNameId, int locationDescriptionId, int locationAddressId) {
        mLocationNameId = locationNameId;
        mLocationDescriptionId = locationDescriptionId;
        mLocationAddressId = locationAddressId;
    }

    /**
     * Create a Location object
     *
     * @param locationNameId is the String resource ID for the location name.
     * @param locationDescriptionId is the String resource ID for the location short description.
     * @param locationAddressId is the String resource ID for the location address.
     * @param locationImageId is the drawable resource ID for the location image.
     */
    public Location(int locationNameId, int locationDescriptionId, int locationAddressId, int locationImageId) {
        mLocationNameId = locationNameId;
        mLocationDescriptionId = locationDescriptionId;
        mLocationAddressId = locationAddressId;
        mLocationImageId = locationImageId;
    }

    // Get String resource ID for  location name
    public int getLocationNameId() {
        return mLocationNameId;
    }
    // Get String resource ID for location short description
    public int getLocationDescriptionId() {
        return mLocationDescriptionId;
    }
    // Get String resource ID for location address
    public int getLocationAddressId() {
        return mLocationAddressId;
    }
    // Get drawable resource ID for location image
    public int getLocationImageId() {
        return mLocationImageId;
    }

    // Returns whether a location has an image resource ID
    public boolean hasImage() {
        return mLocationImageId != NO_IMAGE_PROVIDED;
    }

}
