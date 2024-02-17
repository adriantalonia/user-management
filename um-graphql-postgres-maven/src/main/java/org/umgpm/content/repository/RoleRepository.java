package org.umgpm.content.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.umgpm.content.model.entity.Role;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
}
