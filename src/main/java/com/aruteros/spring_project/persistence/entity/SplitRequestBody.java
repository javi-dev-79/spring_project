package com.aruteros.spring_project.persistence.entity;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class SplitRequestBody {
    @JsonProperty("hello") // Es obligatorio si es diferente al nombre de la variable, si no, es opcional ponerlo.
    private String word;

    public SplitRequestBody(String word) {
        this.word = word;
    }

    public SplitRequestBody() { // Necesita un constructor vacío o ninguno para poder hacer el post de SplitResponseBody.

    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
