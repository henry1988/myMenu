package com.hmartinez.menu.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * Created by hmartinez on 10/8/15.
 */
public class EntryAttribute {

    @SerializedName("label")
    @Expose
    private String label;

    @SerializedName("attributes")
    @Expose
    private Map<String,String> attributes;

    /**
     *
     * @return
     *     The label
     */
    public String getLabel() {
        return label;
    }

    /**
     *
     * @param label
     *     The label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }
}
