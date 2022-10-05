package org.springcorefundamentals.repositories;

import org.springcorefundamentals.models.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
}
