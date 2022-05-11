package peaksoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cat {

    private String message;

    public String getMessage() {
        return message;
    }

    @Autowired
    public void setMessage(String message) {
        this.message = message;
    }
}
