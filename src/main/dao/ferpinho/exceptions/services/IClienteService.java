package main.dao.ferpinho.exceptions.services;


import main.dao.ferpinho.exceptions.domain.Cliente;
import main.dao.ferpinho.exceptions.TipoChaveNaoEncontradaException;


public interface IClienteService {

    Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}