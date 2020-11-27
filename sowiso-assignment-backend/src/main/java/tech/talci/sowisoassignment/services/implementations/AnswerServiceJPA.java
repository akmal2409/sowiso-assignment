package tech.talci.sowisoassignment.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.talci.sowisoassignment.domain.Answer;
import tech.talci.sowisoassignment.dto.AnswerDTO;
import tech.talci.sowisoassignment.exceptions.ResourceNotFoundException;
import tech.talci.sowisoassignment.repositories.AnswerRepository;
import tech.talci.sowisoassignment.services.AnswerService;

import java.util.List;

@Service
@AllArgsConstructor
public class AnswerServiceJPA implements AnswerService {

    private final AnswerRepository answerRepository;


    @Override
    public Answer save(Answer answer) {
        return answerRepository.save(answer);
    }

    @Override
    public String validateAnswer(AnswerDTO answerDTO, String questionId) {
        return null;
    }
}
