package com.wayfarer.europe.model;

import java.util.List;

public class Destination {

    private final String slug;
    private final String city;
    private final String country;
    private final String region;       // Western, Southern, Northern, Eastern, Central
    private final String tagline;
    private final String description;
    private final String bestTime;
    private final String avgDailyCost;
    private final List<String> highlights;
    private final String latLong;
    private final String accent;       // hex color used for the destination's postcard accent

    public Destination(String slug, String city, String country, String region, String tagline,
                        String description, String bestTime, String avgDailyCost,
                        List<String> highlights, String latLong, String accent) {
        this.slug = slug;
        this.city = city;
        this.country = country;
        this.region = region;
        this.tagline = tagline;
        this.description = description;
        this.bestTime = bestTime;
        this.avgDailyCost = avgDailyCost;
        this.highlights = highlights;
        this.latLong = latLong;
        this.accent = accent;
    }

    public String getSlug() { return slug; }
    public String getCity() { return city; }
    public String getCountry() { return country; }
    public String getRegion() { return region; }
    public String getTagline() { return tagline; }
    public String getDescription() { return description; }
    public String getBestTime() { return bestTime; }
    public String getAvgDailyCost() { return avgDailyCost; }
    public List<String> getHighlights() { return highlights; }
    public String getLatLong() { return latLong; }
    public String getAccent() { return accent; }
}
