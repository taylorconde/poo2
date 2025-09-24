package tech.pinho.banco.service;

import tech.pinho.banco.model.Owner;

import java.time.LocalDate;

public class CreateOwnerServiceImpl implements CreateOwnerService {

    @Override
    public Owner execute(String nome, String cpf, LocalDate nascimento) {
        Owner owner = new Owner();
        owner.setNome(nome);
        owner.setCpf(cpf);
        owner.setDataNascimento(nascimento);
        return owner;
    }
}
