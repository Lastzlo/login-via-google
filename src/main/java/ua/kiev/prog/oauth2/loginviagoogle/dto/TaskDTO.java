package ua.kiev.prog.oauth2.loginviagoogle.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class TaskDTO {
    private Long id;

    /*@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm", timezone = "UTC")*/
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm", timezone = JsonFormat.DEFAULT_TIMEZONE)
    private Date date;

    private String text;
    private String text2;

    @JsonCreator
    public TaskDTO(@JsonProperty(required = true) Date date,
                   @JsonProperty(required = true) String text,
                   @JsonProperty(required = true) String text2) {
        this.date = date;
        this.text = text;
        this.text2 = text2;
    }

    private TaskDTO(Long id, Date date, String text, String text2) {
        this.id = id;
        this.date = date;
        this.text = text;
        this.text2 = text2;
    }

    public static TaskDTO of(Date date, String text, String text2) {
        return new TaskDTO(null, date, text, text2);
    }
    public static TaskDTO of(Long id, Date date, String text, String text2) {
        return new TaskDTO(id, date, text, text2);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText2 () {
        return text2;
    }

    public void setText2 (String text2) {
        this.text2 = text2;
    }
}
