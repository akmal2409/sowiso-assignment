package tech.talci.sowisoassignment.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tech.talci.sowisoassignment.dto.AnswerDTO;
import tech.talci.sowisoassignment.dto.ValidationDTO;
import tech.talci.sowisoassignment.services.AnswerService;

import java.util.Map;

@RestController
@RequestMapping(AnswerController.BASE_URL)
@AllArgsConstructor
@CrossOrigin("*")
public class AnswerController {

    public static final String BASE_URL = "/api/answer";

    private final AnswerService answerService;

    @PostMapping("/{questionId}")
    public ValidationDTO submitAnswer(@RequestBody AnswerDTO answerDTO,
                                      @PathVariable Long questionId) {
        return answerService.validateAnswer(answerDTO, questionId);
    }
}

