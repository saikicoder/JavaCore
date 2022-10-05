package org.springcorefundamentals;

import org.springcorefundamentals.models.User;
import org.springcorefundamentals.repositories.HibernateUserRepositoryImpl;
import org.springcorefundamentals.services.UserServiceImpl;

public class Application {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();
        service.setRepository(new HibernateUserRepositoryImpl());
        User user = service.findAll().get(0);
        System.out.println(user.getFirstname());
    }
}
