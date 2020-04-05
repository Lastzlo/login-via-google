package ua.kiev.prog.oauth2.loginviagoogle.dto;

import java.util.Date;

public class TaskToNotifyDTO {
    private final String email;
    private final Date date;
    private final String text;
    private final String text2;

    public TaskToNotifyDTO(String email, Date date, String text, String text2) {
        this.email = email;
        this.date = date;
        this.text = text;
        this.text2 = text2;
    }

    public String getEmail() {
        return email;
    }

    public Date getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public String getText2 () {
        return text2;
    }
}
