package br.com.rpires.services;

import main.dao.ferpinho.exceptions.dao.IProdutoDAO;
import main.dao.ferpinho.exceptions.domain.Produto;
import main.dao.ferpinho.exceptions.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}