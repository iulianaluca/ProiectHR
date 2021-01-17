package com.recruit.ejb;

import com.recruit.common.UserDetails;
import com.recruit.entity.Role;
import com.recruit.entity.User;
import com.recruit.entity.UserComment;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
    
    public void createUser(String nume, String prenume, Integer telefon, Integer mobil, String email,String password, String functie, String descriere) {
        LOG.info("createUser");
        try {
            String username=nume.substring(0, 5)+prenume.substring(0, 1);
            username=username.toLowerCase();
            Query query = em.createQuery("SELECT u FROM User u");
            List<User> users=query.getResultList();
            for(User us:users){
                if(us.getUsername().equals(username)){
                    username+=prenume.substring(1,2);
                }
            }
            
            String hashPass=Hash(password);
 
            User user=new User(nume,prenume,telefon,mobil,email,username,hashPass,functie,descriere);
            //Role role=em.find(Role.class, id_rol);
            //role.getUser().add(user);
            //user.setUser_role(role);
            
            em.persist(user);
            
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }
    
    public String Hash(String password) throws NoSuchAlgorithmException {

        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));

        return String.format("%064x", new java.math.BigInteger(1, hash));
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
            UserDetails userDetails = new UserDetails(user.getId(),user.getNume(),user.getPrenume(),user.getTelefon(),user.getMobil(),user.getEmail(),user.getFunctie(),user.getDescriere());
            detailsList.add(userDetails);
        }
        return detailsList;
    }
    
    public void editUser(Integer id, String nume, String prenume, Integer telefon, Integer mobil, String email, String functie, String descriere){
        LOG.info("editUser");
        try{
            User user=em.find(User.class, id);
            user.setNume(nume);
            user.setPrenume(prenume);
            user.setTelefon(telefon);
            user.setMobil(mobil);
            user.setEmail(email);
            user.setFunctie(functie);
            user.setDescriere(descriere);
            
        }
        catch (Exception ex) {
            throw new EJBException(ex);
        }
    }
    
    public void deleteUser(Integer id){
        LOG.info("edeleteUser");
        try{
            User user=em.find(User.class, id);
            em.remove(user);
        }
        catch (Exception ex) {
            throw new EJBException(ex);
        }
    }
    
    public UserDetails findById(Integer id){
        User user=em.find(User.class, id);
        return new UserDetails(user.getId(), user.getNume(), user.getPrenume(), user.getTelefon(), user.getMobil(), user.getEmail(), user.getFunctie(), user.getDescriere());
    
    }

    public Integer findByUsername(String username) {
        Query query = em.createQuery("SELECT u FROM User u WHERE u.username=:user");
        query.setParameter("user", username);
        User us=(User)query.getSingleResult();

        return us.getId();
    }
    
}
