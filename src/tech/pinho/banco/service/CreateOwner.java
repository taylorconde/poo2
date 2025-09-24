package tech.pinho.banco.service;

import tech.pinho.banco.model.Owner;

import java.time.LocalDate;

public interface CreateOwner {

    Owner execute(String nome, String cpf, LocalDate nascimento);
}
