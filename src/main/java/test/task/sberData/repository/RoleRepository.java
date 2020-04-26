package test.task.sberData.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import test.task.sberData.entities.Role;

@Component
public interface RoleRepository extends JpaRepository<Role, Long> {
}
