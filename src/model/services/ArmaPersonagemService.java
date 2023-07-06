package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.ArmaPersonagemDao;
import model.entities.ArmaPersonagem;

public class ArmaPersonagemService {

    private ArmaPersonagemDao dao = DaoFactory.createArmaPersonagemDao();
    
    public List<ArmaPersonagem> findAll(){
        return dao.findAll();
    }
}