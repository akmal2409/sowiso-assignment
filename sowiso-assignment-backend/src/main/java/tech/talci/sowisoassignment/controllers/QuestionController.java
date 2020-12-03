package tech.talci.sowisoassignment.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.talci.sowisoassignment.dto.QuestionDTO;
import tech.talci.sowisoassignment.services.QuestionService;

@RestController
@RequestMapping(QuestionController.BASE_URL)
@AllArgsConstructor
@CrossOrigin("*")
public class QuestionController {

    public static final String BASE_URL = "/api/question";
    private final QuestionService questionService;

    @GetMapping
    public QuestionDTO getQuestion() {
        return questionService.generateQuestion();
    }
}
