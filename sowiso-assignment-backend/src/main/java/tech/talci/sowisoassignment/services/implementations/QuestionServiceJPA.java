package tech.talci.sowisoassignment.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.talci.sowisoassignment.domain.Question;
import tech.talci.sowisoassignment.dto.Mappers.QuestionMapper;
import tech.talci.sowisoassignment.dto.QuestionDTO;
import tech.talci.sowisoassignment.repositories.QuestionRepository;
import tech.talci.sowisoassignment.services.QuestionService;

import java.time.LocalDate;
import java.util.Random;


@Service
@AllArgsConstructor
public class QuestionServiceJPA implements QuestionService {

    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper = QuestionMapper.INSTANCE;

    @Override
    public Question save(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public QuestionDTO generateQuestion() {
        Random random = new Random();
        int upperBound = random.nextInt(5);

        int firstNumber = random.nextInt(upperBound);
        int secondNumber = random.nextInt(upperBound);

        int answer = firstNumber + secondNumber;

        Question question = Question.builder()
                .question("Question: " + firstNumber + " + " + secondNumber)
                .createdOn(LocalDate.now())
                .correctAnswer(String.valueOf(answer))
                .build();

        return saveAndReturnDTO(question);
    }

    @Override
    public QuestionDTO saveAndReturnDTO(Question question) {
        Question savedQuestion = questionRepository.save(question);

        QuestionDTO returnDTO = questionMapper.questionToQuestionDTO(savedQuestion);
        returnDTO.setId(savedQuestion.getId());

        return returnDTO;
    }

}
