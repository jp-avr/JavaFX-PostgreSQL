package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.PersonagemDao;
import model.entities.Personagem;

public class PersonagemService {

    private PersonagemDao dao = DaoFactory.createPersonagemDao();
    
    public List<Personagem> findAll(){
        return dao.findAll();
    }
}