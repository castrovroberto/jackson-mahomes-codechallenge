package patrick.entity;

import java.util.List;

public class InputJson {

    private String text;
    private String token;

    public InputJson() {
    }

    public InputJson(String text, String token) {
        this.text = text;
        this.token = token;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getLines() {
        String[] lines = this.text.split("\n");
        return lines;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "InputJson{" +
                "text='" + text + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
