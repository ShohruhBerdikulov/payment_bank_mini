package ecma.ai.transferapp.repository;


import ecma.ai.transferapp.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IncomeRepository extends JpaRepository<Income,Integer> {

    List<Income> findByFromCard_Username(String fromCard_username);

}
