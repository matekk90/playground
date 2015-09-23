package pl.krupop.m.dto;

import java.util.List;

import pl.krupop.m.entity.Event;

public class NewsDto {

    private String title;

    private String body;

    private List<Event> events;

    public NewsDto(String title, String body, List<Event> events) {
        this.title = title;
        this.body = body;
        this.events = events;
    }

    protected NewsDto() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

}
