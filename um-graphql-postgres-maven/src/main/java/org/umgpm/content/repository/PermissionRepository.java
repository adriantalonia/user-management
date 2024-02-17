package org.umgpm.content.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.umgpm.content.model.entity.Permissions;

import java.util.UUID;

public interface PermissionRepository extends JpaRepository<Permissions, UUID> {
}
