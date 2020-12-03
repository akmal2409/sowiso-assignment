package tech.talci.sowisoassignment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidationDTO {

    private boolean correct;
    private String answer;
}
