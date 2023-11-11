import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class VideoConferenceController {

    @MessageMapping("/startConference")
    @SendTo("/topic/conference")
    public String startConference(String username) {
        return "Conference started by " + username;
    }

    @MessageMapping("/sendMessage")
    @SendTo("/topic/chat")
    public String sendMessage(String message) {
        return message;
    }
}
