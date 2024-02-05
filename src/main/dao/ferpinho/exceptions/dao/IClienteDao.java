package main.dao.ferpinho.exceptions.dao;

import main.dao.ferpinho.exceptions.dao.Generic.IGenericDAO;
import main.dao.ferpinho.exceptions.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {


    Class<Cliente> getTipoClasse();

    void atualiarDados(Cliente entity, Cliente entityCadastrado);
}
