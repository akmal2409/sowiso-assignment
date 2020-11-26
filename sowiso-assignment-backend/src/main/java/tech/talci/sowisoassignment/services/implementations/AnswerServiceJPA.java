package tech.talci.sowisoassignment.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.talci.sowisoassignment.repositories.AnswerRepository;
import tech.talci.sowisoassignment.services.AnswerService;

@Service
@AllArgsConstructor
public class AnswerServiceJPA implements AnswerService {

    private final AnswerRepository answerRepository;
}
