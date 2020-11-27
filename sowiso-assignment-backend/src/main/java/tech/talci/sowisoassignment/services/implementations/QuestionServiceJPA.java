package tech.talci.sowisoassignment.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.talci.sowisoassignment.domain.Question;
import tech.talci.sowisoassignment.repositories.QuestionRepository;
import tech.talci.sowisoassignment.services.QuestionService;


@Service
@AllArgsConstructor
public class QuestionServiceJPA implements QuestionService {

    private final QuestionRepository questionRepository;

    @Override
    public Question save(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Question generateQuestion() {
        return null;
    }
}
