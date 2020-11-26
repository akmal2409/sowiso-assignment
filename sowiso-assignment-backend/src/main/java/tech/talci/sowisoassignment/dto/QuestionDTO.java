package tech.talci.sowisoassignment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDTO {

    private Long id;
    private LocalDate createdOn;
    private String question;
}
