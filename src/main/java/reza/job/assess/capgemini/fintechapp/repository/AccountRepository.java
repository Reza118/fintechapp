package reza.job.assess.capgemini.fintechapp.repository;

import org.springframework.data.repository.CrudRepository;
import reza.job.assess.capgemini.fintechapp.model.Accounts;
import reza.job.assess.capgemini.fintechapp.model.NewAccountRequest;

public interface AccountRepository extends CrudRepository<NewAccountRequest, Long> {

    Accounts save(Accounts accounts);
}
