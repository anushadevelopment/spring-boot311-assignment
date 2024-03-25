package sg.edu.ntu.notification;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

/*
    TODO:
    Annotate this message as @Component
*/




@Component
public class Message {
    
    String to;
    String message;

    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}

    
