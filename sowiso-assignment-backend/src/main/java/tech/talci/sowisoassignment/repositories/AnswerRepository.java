package tech.talci.sowisoassignment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.talci.sowisoassignment.domain.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
