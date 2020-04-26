package test.task.sberData.service;

import test.task.sberData.entities.User;

import java.util.List;

public interface UserListService {
    List<User> getAllUsers();
    User getOneUser(Long id);
    User createUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}
