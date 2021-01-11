/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recruit.ejb;

import com.recruit.common.PositionDetails;
import com.recruit.entity.Position;
import com.recruit.entity.PositionComment;
import com.recruit.entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author PC
 */
@Stateless
public class PositionBean {

    private static final Logger LOG = Logger.getLogger(PositionBean.class.getName());
    
    @PersistenceContext
    private EntityManager em;
    
    public List<PositionDetails> getAllPositions() {
        LOG.info("getAllPositions");
        try {            
            Query query = em.createQuery("SELECT p FROM Position p");          
            List<Position> positions = (List<Position>) query.getResultList();
            return copyPositionsToDetails(positions);
            
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }
    
     public void createPosition(String nume, String nr_persoane, String department, String cerinte, String responsabilitati, String proiect, String opened, String closed) {
        LOG.info("createPosition");
        try {
            Position position=new Position(nume,nr_persoane,department,cerinte,responsabilitati,proiect,opened,closed); // test1
            User user=em.find(User.class, 4); // 
            user.getUser_position().add(position);
            position.setUser_pos(user);
            
            em.persist(position);
            
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }
     
     public void createPositionComment(String comment, Integer idposition) {
        LOG.info("createPositionComment");
        try {
            PositionComment positioncomment=new PositionComment(false, comment);
            Position position=em.find(Position.class,idposition);
            position.getPosition().add(positioncomment);
            positioncomment.setPosition_comm(position);
  
            
            em.persist(positioncomment);
            
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }
     
     public void editPosition(Integer idposition,String nume, String nr_persoane, String department, String cerinte, String responsabilitati, String proiect, String opened, String closed){
        LOG.info("editPosition");
        try{
            Position position=em.find(Position.class, idposition);
            position.setNume(nume);
            position.setNr_persoane(nr_persoane);
            position.setDepartment(department);
            position.setCerinte(cerinte);
            position.setResponsabilitati(responsabilitati);
            position.setProiect(proiect);
            position.setOpened(opened);
            position.setClosed(closed);
            
        }
        catch (Exception ex) {
            throw new EJBException(ex);
        }
    }
     
     public void deletePosition(Integer idposition){
        LOG.info("deletePosition");
        try{
            Position position=em.find(Position.class, idposition);
            em.remove(position);
        }
        catch (Exception ex) {
            throw new EJBException(ex);
        }
    }
    
    private List<PositionDetails> copyPositionsToDetails(List<Position> positions) {
         List<PositionDetails> detailsList = new ArrayList<>();
        for (Position position : positions) {
            PositionDetails positionDetails = new PositionDetails(position.getIdposition(),position.getNume(),position.getNr_persoane()
            ,position.getDepartment(),position.getCerinte(),position.getResponsabilitati(),position.getProiect(),position.getOpened()
            ,position.getClosed(),position.getUser_pos().getNume());
            detailsList.add(positionDetails);
        }
        return detailsList;
    }
    
    public PositionDetails findById(Integer idposition){
        Position position=em.find(Position.class, idposition);
        return new PositionDetails(position.getIdposition(),position.getNume(),position.getNr_persoane()
            ,position.getDepartment(),position.getCerinte(),position.getResponsabilitati(),position.getProiect(),position.getOpened()
            ,position.getClosed(),position.getUser_pos().getNume());
    
    }
    
    
}
