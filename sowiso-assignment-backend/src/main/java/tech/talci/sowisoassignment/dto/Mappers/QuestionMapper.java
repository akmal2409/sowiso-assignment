package tech.talci.sowisoassignment.dto.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tech.talci.sowisoassignment.domain.Question;
import tech.talci.sowisoassignment.dto.QuestionDTO;

@Mapper
public interface QuestionMapper {

    QuestionMapper INSTANCE = Mappers.getMapper(QuestionMapper.class);

    QuestionDTO questionToQuestionDTO(Question question);

    Question questionDTOToQuestion(QuestionDTO questionDTO);
}
