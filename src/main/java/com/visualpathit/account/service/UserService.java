package com.visualpathit.account.service;

import java.util.List;

import com.visualpathit.account.model.User;

/**
 * Service interface for User management operations.
 */
public interface UserService {
    /**
     * Saves a user to the database.
     * @param user the user entity to save
     */
    void save(User user);

    /**
     * Finds a user by their unique username.
     * @param username the username to search for
     * @return the found User object
     */
    User findByUsername(String username);

    /**
     * Finds a user by their unique ID.
     * @param id the user ID
     * @return the found User object
     */
    User findById(long id);

    /**
     * Retrieves a list of all users in the system.
     * @return a list of User entities
     */
    public List <User> getList();
}
