package com.recruit.ejb;

import com.recruit.common.UserDetails;
import com.recruit.entity.Role;
import com.recruit.entity.User;
import com.recruit.entity.UserComment;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class UserBean {

    private static final Logger LOG = Logger.getLogger(UserBean.class.getName());
    
    @PersistenceContext
    private EntityManager em;
    
    public List<UserDetails> getAllUsers() {
        LOG.info("getAllUsers");
        try {            
            Query query = em.createQuery("SELECT u FROM User u");          
            List<User> users = (List<User>) query.getResultList();
            return copyUsersToDetails(users);
            
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }
    
    public void createUser(String nume, String prenume, Integer telefon, Integer mobil, String email, String username, String functie, String descriere) {
        LOG.info("createUser");
        try {
            User user=new User(nume,prenume,telefon,mobil,email,username,functie,descriere);
            Role role=em.find(Role.class, 1);
            role.getUser().add(user);
            user.setUser_role(role);
            
            em.persist(user);
            
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }
    
    public void createComment(String comment, Integer userId) {
        LOG.info("createComment");
        try {
            UserComment usercomment=new UserComment(false, comment);
            User user=em.find(User.class,userId);
            user.getUser_comment().add(usercomment);
            usercomment.setUser_comm(user);
            
            em.persist(usercomment);
            
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }

    private List<UserDetails> copyUsersToDetails(List<User> users) {
         List<UserDetails> detailsList = new ArrayList<>();
        for (User user : users) {
            UserDetails userDetails = new UserDetails(user.getId(),user.getNume(),user.getPrenume(),user.getTelefon(),user.getMobil(),user.getEmail(),user.getUsername(),user.getFunctie(),user.getDescriere(),user.getUser_role().getRol());
            detailsList.add(userDetails);
        }
        return detailsList;
    }
    
}
