package br.com.cepedi.Library.api.service.loan.validations.update;

import br.com.cepedi.Library.api.model.records.loan.input.DataUpdateLoan;
import br.com.cepedi.Library.api.repository.LoanRepository;
import jakarta.validation.ValidationException;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidateLoanExistence implements ValidationUpdateLoan {

    @Autowired
    private LoanRepository repository;


    @Override
    public void validate(DataUpdateLoan data) {
        if(!repository.existsById(data.id())){
            throw  new ValidationException("The provided loan id does not exists");
        }
    }
}
