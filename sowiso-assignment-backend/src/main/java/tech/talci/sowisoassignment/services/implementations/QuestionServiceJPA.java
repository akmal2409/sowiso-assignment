package tech.talci.sowisoassignment.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.talci.sowisoassignment.domain.Question;
import tech.talci.sowisoassignment.exceptions.ResourceNotFoundException;
import tech.talci.sowisoassignment.repositories.QuestionRepository;
import tech.talci.sowisoassignment.services.QuestionService;

import java.util.List;

@Service
@AllArgsConstructor
public class QuestionServiceJPA implements QuestionService {

    private final QuestionRepository questionRepository;

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question findById(Long id) {
        return questionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Question was not found"));
    }

    @Override
    public Question save(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public void delete(Question question) {
        questionRepository.delete(question);
    }

    @Override
    public void deleteById(Long id) {
        questionRepository.deleteById(id);
    }
}
