package tech.talci.sowisoassignment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.talci.sowisoassignment.domain.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
