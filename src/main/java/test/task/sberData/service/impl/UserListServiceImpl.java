package test.task.sberData.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.task.sberData.entities.User;
import test.task.sberData.service.UserListService;

import java.util.List;

@Service
@Transactional
public class UserListServiceImpl implements UserListService {
    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getOneUser(Long id) {
        return null;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(Long id, User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
