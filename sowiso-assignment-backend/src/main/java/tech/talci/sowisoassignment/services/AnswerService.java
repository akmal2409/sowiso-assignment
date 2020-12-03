package tech.talci.sowisoassignment.services;

import tech.talci.sowisoassignment.domain.Answer;
import tech.talci.sowisoassignment.dto.AnswerDTO;
import tech.talci.sowisoassignment.dto.ValidationDTO;


public interface AnswerService extends CrudService<Answer, Long> {
    ValidationDTO validateAnswer(AnswerDTO answerDTO, Long questionId);
}
