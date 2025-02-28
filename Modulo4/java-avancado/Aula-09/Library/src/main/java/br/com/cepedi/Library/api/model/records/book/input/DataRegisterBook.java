package br.com.cepedi.Library.api.model.records.book.input;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotBlank;

public record DataRegisterBook(

        @JsonAlias("name")
        @NotBlank(message = "{name.required}")
        String name,

        @JsonAlias("anoPublicacao")
        @NotBlank(message = "{anoPublicacao.required}")
        Integer anoPublicacao,

        @JsonAlias("author_id")
        @NotBlank(message = "{author_id.required}")
        Long author_id,


        @JsonAlias("publisher_id")
        @NotBlank(message = "{publisher_id.required}")
        Long publisher_id

) {
}
