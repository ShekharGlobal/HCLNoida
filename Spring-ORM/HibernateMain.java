package com.coforge.springhb;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HibernateMain {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
        UserHibernateDao userDao = context.getBean(UserHibernateDao.class);

        try {
            UserHB user1 = new UserHB();
            user1.setUsername("vijay");
            user1.setEmail("ajay@gmail.com");
            userDao.saveUser(user1);

            UserHB user2 = new UserHB();
            user2.setUsername("Akash"); // Will trigger rollback
            user2.setEmail("akash@gmail.com");
            userDao.saveUser(user2);

        } catch (Exception e) {
            System.out.println("Transaction Rolled Back: " + e.getMessage());
        }
    }
}
