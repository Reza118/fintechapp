package reza.job.assess.capgemini.fintechapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class OpenAccountFailedException extends RuntimeException{

    public OpenAccountFailedException(){}
}
