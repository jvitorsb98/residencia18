package br.com.cepedi.Voll.api.model.entitys;

import br.com.cepedi.Voll.api.model.records.address.input.DataRegisterAddress;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Address {

    private String publicPlace;

    private String neighborhood;

    private String cep;

    private String city;

    private String uf;

    private String complement;

    private String number;

    public Address(DataRegisterAddress dataAddress) {
        this.publicPlace = dataAddress.publicPlace();
        this.neighborhood = dataAddress.neighborhood();
        this.cep = dataAddress.cep();
        this.city = dataAddress.city();
        this.uf = dataAddress.uf();
        this.complement = dataAddress.complement();
        this.number = dataAddress.number();
    }


    public void updateData(DataRegisterAddress data) {
        if (data.publicPlace() != null) {
            this.publicPlace = data.publicPlace();
        }
        if (data.neighborhood() != null) {
            this.neighborhood = data.neighborhood();
        }
        if (data.cep() != null) {
            this.cep = data.cep();
        }
        if (data.city() != null) {
            this.city = data.city();
        }
        if (data.uf() != null) {
            this.uf = data.uf();
        }
        if (data.complement() != null) {
            this.complement = data.complement();
        }
        if (data.number() != null) {
            this.number = data.number();
        }
    }

}
