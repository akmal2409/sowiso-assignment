package tech.talci.sowisoassignment.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.talci.sowisoassignment.domain.Answer;
import tech.talci.sowisoassignment.exceptions.ResourceNotFoundException;
import tech.talci.sowisoassignment.repositories.AnswerRepository;
import tech.talci.sowisoassignment.services.AnswerService;

import java.util.List;

@Service
@AllArgsConstructor
public class AnswerServiceJPA implements AnswerService {

    private final AnswerRepository answerRepository;

    @Override
    public List<Answer> findAll() {
        return answerRepository.findAll();
    }

    @Override
    public Answer findById(Long id) {
        return answerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Answer was not found"));
    }

    @Override
    public Answer save(Answer answer) {
        return answerRepository.save(answer);
    }

    @Override
    public void delete(Answer answer) {
        answerRepository.delete(answer);
    }

    @Override
    public void deleteById(Long id) {
        answerRepository.deleteById(id);
    }
}
