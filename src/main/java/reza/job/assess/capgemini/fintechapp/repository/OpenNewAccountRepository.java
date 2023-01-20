package reza.job.assess.capgemini.fintechapp.repository;

import org.springframework.data.repository.CrudRepository;
import reza.job.assess.capgemini.fintechapp.model.NewAccountRequest;

public interface OpenNewAccountRepository extends CrudRepository<NewAccountRequest, Long> {

    NewAccountRequest save(NewAccountRequest newAccountRequest);
}
