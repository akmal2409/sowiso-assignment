package tech.talci.sowisoassignment.services;

import tech.talci.sowisoassignment.domain.Question;
import tech.talci.sowisoassignment.dto.QuestionDTO;

public interface QuestionService extends CrudService<Question, Long> {

    QuestionDTO generateQuestion();

    QuestionDTO saveAndReturnDTO(Question question);
}
