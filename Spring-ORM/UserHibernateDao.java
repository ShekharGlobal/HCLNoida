package com.coforge.springhb;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserHibernateDao {
    private final SessionFactory sessionFactory;

    public UserHibernateDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void saveUser(UserHB user) {
        sessionFactory.getCurrentSession().save(user);
        
        // Simulate an error for rollback demonstration
        if (user.getUsername().equals("error")) {
            throw new RuntimeException("Simulated Error: Rollback transaction");
        }
    }
}
