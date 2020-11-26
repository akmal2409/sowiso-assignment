package tech.talci.sowisoassignment.services;

import tech.talci.sowisoassignment.domain.Answer;
import tech.talci.sowisoassignment.dto.AnswerDTO;

public interface AnswerService extends CrudService<Answer, Long> {
    String validateAnswer(AnswerDTO answerDTO, String questionId);
}
