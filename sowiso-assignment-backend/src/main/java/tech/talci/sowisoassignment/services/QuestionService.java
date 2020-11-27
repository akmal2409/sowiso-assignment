package tech.talci.sowisoassignment.services;

import tech.talci.sowisoassignment.domain.Question;

public interface QuestionService extends CrudService<Question, Long> {

    Question generateQuestion();
}
