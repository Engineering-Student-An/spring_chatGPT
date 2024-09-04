package study.chatgpt_api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChatGPTApiController {

    private final ChatGPTService chatGPTService;

    @GetMapping("/api/chatGPT")
    public ResponseEntity<String> chatGPT(@RequestBody String message) {
        return chatGPTService.chat(message);
    }
}