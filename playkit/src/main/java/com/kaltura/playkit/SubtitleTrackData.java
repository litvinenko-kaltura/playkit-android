package com.kaltura.playkit;

/**
 * Created by anton.afanasiev on 17/11/2016.
 */
public class SubtitleTrackData {

    private String language;
    private String id;

    public SubtitleTrackData(String language, String id) {
        this.language = language;
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public String getId() {
        return id;
    }
}