package com.github.tenx.tecnoesis20.data.models;

import java.util.ArrayList;
import java.util.List;

public class ModuleBody {
    String name;
    String description;
    String image;
    List<EventBody> eventList;


    public ModuleBody(String name, String description, String image, List<EventBody> eventList) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.eventList = eventList;
    }

    public ModuleBody(String name, String description, String image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    

    public List<EventBody> getEventList() {
        return eventList;
    }//

    public void setEventList(List<EventBody> eventList) {
        this.eventList = eventList;
    }


    public static class EventBody {
        String name;
        String description;
        String rules;
        String image;
        String date;
        String prize;
        String registerLink;

        public EventBody(String name, String description, String rules, String image, String date, String registerLink, String prize) {
            this.name = name;
            this.description = description;
            this.rules = rules;
            this.image = image;
            this.prize=prize;
            this.date = date;
            this.registerLink = registerLink;
        }


        public  String getPrize()
        {
            return prize;
        }
        public void setPrize(String prize)
        {
            this.prize=prize;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getRules() {
            return rules;
        }

        public void setRules(String rules) {
            this.rules = rules;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getRegisterLink() {
            return registerLink;
        }

        public void setRegisterLink(String registerLink) {
            this.registerLink = registerLink;
        }
    }
}
