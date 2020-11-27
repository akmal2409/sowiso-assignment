package tech.talci.sowisoassignment.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.talci.sowisoassignment.domain.Answer;
import tech.talci.sowisoassignment.domain.Question;
import tech.talci.sowisoassignment.dto.AnswerDTO;
import tech.talci.sowisoassignment.exceptions.ResourceNotFoundException;
import tech.talci.sowisoassignment.repositories.AnswerRepository;
import tech.talci.sowisoassignment.repositories.QuestionRepository;
import tech.talci.sowisoassignment.services.AnswerService;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

@Service
@AllArgsConstructor
public class AnswerServiceJPA implements AnswerService {

    private final AnswerRepository answerRepository;
    private final QuestionRepository questionRepository;


    @Override
    public Answer save(Answer answer) {
        return answerRepository.save(answer);
    }

    @Override
    public Map<String, Boolean> validateAnswer(AnswerDTO answerDTO, Long questionId) {
        Question question = questionRepository.findById(questionId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Question was not found with id: " + questionId));

        Answer answer = Answer.builder()
                .answer(answerDTO.getAnswer())
                .answeredOn(LocalDate.now())
                .question(question)
                .build();

        answer.setCorrect(question.getCorrectAnswer().equals(answerDTO.getAnswer()));

        answerRepository.save(answer);

        return answer.isCorrect() ? Collections.singletonMap("correct", true) :
                                    Collections.singletonMap("correct", false);
    }
}
