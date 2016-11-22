package com.mapzen.tangram;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * {@code TouchLabel} represents labels that can be selected on the screen
 */
public class TouchLabel {

    /**
     * Options for the type of TouchLabel
     */
    public enum LabelType {
        ICON,
        TEXT,
    }

    private LngLat coordinate;
    private LabelType type;
    private Map<String, String> properties;

    private TouchLabel(double longitude, double latitude, int type, Map<String, String> properties) {
        this.properties = properties;
        this.coordinate = new LngLat(longitude, latitude);
        this.type = LabelType.values()[type];
    }

    public LabelType getType() {
        return this.type;
    }

    /**
     * @return The coordinate of the feature for which this label has been created
     */
    public LngLat getCoordinates() {
        return this.coordinate;
    }

    /**
     * @return A mapping of string keys to string or number values
     */
    public Map<String, String> getProperties() {
        return this.properties;
    }
}
