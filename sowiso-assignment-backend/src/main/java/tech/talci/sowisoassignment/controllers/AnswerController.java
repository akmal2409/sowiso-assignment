package tech.talci.sowisoassignment.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tech.talci.sowisoassignment.dto.AnswerDTO;
import tech.talci.sowisoassignment.repositories.AnswerRepository;
import tech.talci.sowisoassignment.services.AnswerService;

@RestController
@RequestMapping(AnswerController.BASE_URL)
@AllArgsConstructor
public class AnswerController {

    public static final String BASE_URL = "/api/answer";

    private final AnswerService answerService;

    @PostMapping("/{questionId}")
    public String submitAnswer(@RequestBody AnswerDTO answerDTO,
                               @PathVariable String questionId) {
        return answerService.validateAnswer(answerDTO, questionId);
    }
}
