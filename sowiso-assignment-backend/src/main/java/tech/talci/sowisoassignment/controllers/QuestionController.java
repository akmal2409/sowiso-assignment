package tech.talci.sowisoassignment.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(QuestionController.BASE_URL)
public class QuestionController {

    public static final String BASE_URL = "/api/question";
}
