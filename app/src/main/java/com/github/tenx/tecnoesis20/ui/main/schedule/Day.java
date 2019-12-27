package com.github.tenx.tecnoesis20.ui.main.schedule;

public class Day {
    private String event_name;
    private String event_venue;
    private String event_day;
    private String event_timing;



    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public void setEvent_venue(String event_venue) {
        this.event_venue = event_venue;
    }

    public void setEvent_day(String event_day) {
        this.event_day = event_day;
    }




    public String getEvent_venue() {
        return event_venue;
    }

    public String getEvent_day() {
        return event_day;
    }

    public void setEvent_timing(String event_timing) {
        this.event_timing = event_timing;
    }

    public String getEvent_timing() {
        return event_timing;
    }

    public String getEvent_name() {
        return event_name;
    }

    public Day(String event_name, String event_venue, String event_day,String event_timing) {
        this.event_name = event_name;
        this.event_venue = event_venue;
        this.event_day = event_day;
        this.event_timing=event_timing;

    }
}
