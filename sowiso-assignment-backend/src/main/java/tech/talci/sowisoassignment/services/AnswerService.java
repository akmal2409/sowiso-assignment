package tech.talci.sowisoassignment.services;

import tech.talci.sowisoassignment.domain.Answer;
import tech.talci.sowisoassignment.dto.AnswerDTO;

import java.util.Map;

public interface AnswerService extends CrudService<Answer, Long> {
    Map<String, Boolean> validateAnswer(AnswerDTO answerDTO, Long questionId);
}
