package test.task.sberData.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.task.sberData.repository.RoleRepository;
import test.task.sberData.entities.Role;
import test.task.sberData.service.RoleService;

import javax.transaction.Transactional;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleDao) {
        this.roleRepository = roleDao;
    }

    @Override
    public void addRole(Role role) {
        roleRepository.save(role);
    }
}
