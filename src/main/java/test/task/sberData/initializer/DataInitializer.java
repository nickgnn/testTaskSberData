package test.task.sberData.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test.task.sberData.entities.Role;
import test.task.sberData.service.RoleService;

@Component
public class DataInitializer {
    @Autowired
    private RoleService roleService;

    public void init() {
        roleService.addRole(new Role("ROLE_ADMIN"));
        roleService.addRole(new Role("ROLE_USER"));
    }
}
