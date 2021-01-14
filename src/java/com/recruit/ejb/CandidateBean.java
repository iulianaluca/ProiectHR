package com.recruit.ejb;

import com.recruit.common.CandidateDetails;
import com.recruit.entity.Candidate;
import com.recruit.entity.CandidateComment;
import com.recruit.entity.Position;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class CandidateBean {

    @PersistenceContext
   private EntityManager em;

   public List<CandidateDetails> getAllCandidates() {
        LOG.info("getAllCandidates");
        try {            
            Query query = em.createQuery("SELECT c FROM Candidate c");          
            List<Candidate> candidates = (List<Candidate>) query.getResultList();
            return copyCandidatesToDetails(candidates);
            
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }
    private static final Logger LOG = Logger.getLogger(CandidateBean.class.getName());
    
     public void createCandidate(boolean acceptat, String adresa, String email, String nume, String prenume,String cv, boolean relocare, String telefon) {
        LOG.info("createCandidate");
        try {
            Candidate candidate=new Candidate(nume,prenume,telefon,email,adresa,cv,relocare,acceptat);
            em.persist(candidate);                             
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }
     
     public void assignCandidateToPosition(Integer idCandidate, Integer idPosition){
         Position position=em.find(Position.class, idPosition);
         Candidate candidate=em.find(Candidate.class,idCandidate);
         candidate.getPositionCollection().add(position);
         position.getCandidateCollection().add(candidate); 
     }
     
     public void createCandidateComment(String comment, Integer idcandidate) {
        LOG.info("createCandidateComment");
        try {
            CandidateComment candidatecomment=new CandidateComment(false, comment);
            Candidate candidate=em.find(Candidate.class,idcandidate);
            candidate.getCandidate_comment().add(candidatecomment);
            candidatecomment.setCandidate_comm(candidate);
  
            
            em.persist(candidatecomment);
            
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }
     
     public void editCandidate(Integer idcandidate,boolean acceptat, String adresa, String email, String nume, String prenume, boolean relocare, String telefon, String cv){
        LOG.info("editPosition");
        try{
            Candidate candidate=em.find(Candidate.class, idcandidate);
            candidate.setNume(nume);
            candidate.setPrenume(prenume);
            candidate.setAcceptat(acceptat);
            candidate.setAdresa(adresa);
            candidate.setRelocare(relocare);
            candidate.setTelefon(telefon);
            candidate.setCv(cv);
            
            
        }
        catch (Exception ex) {
            throw new EJBException(ex);
        }
    }
     
     public void deleteCandidate(Integer idcandidate){
        LOG.info("deleteCandidate");
        try{
            Candidate candidate=em.find(Candidate.class, idcandidate);
            Collection<Position> positions=candidate.getPositionCollection();
            Iterator<Position> i = positions.iterator();
            while (i.hasNext()) {
                Position position = i.next();
                position.getCandidateCollection().remove(candidate);
            }
            
            em.remove(candidate);
            
        }
        catch (Exception ex) {
            throw new EJBException(ex);
        }
    }
    
    private List<CandidateDetails> copyCandidatesToDetails(List<Candidate> candidates) {
         List<CandidateDetails> detailsList = new ArrayList<>();
        for (Candidate candidate : candidates) {
            CandidateDetails candidateDetails = new CandidateDetails(candidate.getIdcandidate(),candidate.getAcceptat(),candidate.getAdresa(),candidate.getEmail(), candidate.getNume(), candidate.getPrenume(), candidate.getCv(), candidate.getRelocare(), candidate.getTelefon());
            detailsList.add(candidateDetails);
        }
        return detailsList;
    }
    
    public CandidateDetails findById(Integer idcandidate){
        Candidate candidate=em.find(Candidate.class, idcandidate);
        return new CandidateDetails(candidate.getIdcandidate(),candidate.getAcceptat(), candidate.getAdresa(), candidate.getEmail(), candidate.getNume(), candidate.getPrenume(), candidate.getCv(), candidate.getRelocare(), candidate.getTelefon());
        
    }

}
