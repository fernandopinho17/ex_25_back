package main.dao.ferpinho.exceptions.dao;

import main.dao.ferpinho.exceptions.dao.Generic.IGenericDAO;
import main.dao.ferpinho.exceptions.domain.Venda;
import main.dao.ferpinho.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
