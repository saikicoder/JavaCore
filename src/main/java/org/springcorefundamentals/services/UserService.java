package org.springcorefundamentals.services;

import org.springcorefundamentals.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
