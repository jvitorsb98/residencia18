package br.com.cepedi.Library.api.model.entitys;


import br.com.cepedi.Library.api.model.records.author.input.DataRegisterAuthor;
import br.com.cepedi.Library.api.model.records.client.input.DataUpdateClient;
import br.com.cepedi.Library.api.model.records.publisher.input.DataRegisterPublisher;
import br.com.cepedi.Library.api.model.records.publisher.input.DataUpdatePublisher;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "publishers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
public class Publisher {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    private Boolean activated;

    @OneToMany(mappedBy = "publisher")
    private List<Book> books;

    public Publisher(DataRegisterPublisher data) {
        this.name = data.name();
        this.activated = true;
    }

    public void updateData(DataUpdatePublisher data) {
        if (data.name() != null) {
            this.name = data.name();
        }
    }

    public void logicalDelete() {
        this.activated = false;
    }


}
