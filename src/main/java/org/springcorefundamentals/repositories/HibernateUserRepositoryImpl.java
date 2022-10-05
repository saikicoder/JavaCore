package org.springcorefundamentals.repositories;

import org.springcorefundamentals.models.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserRepositoryImpl implements UserRepository{

    @Override
    public List<User> findAll(){
        List<User> list = new ArrayList<User>();

        User user1 = new User("Saikiran","M.");
        User user2 = new User("Bhavya","Ch.");

        return list;
    }
}
