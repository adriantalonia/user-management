package org.umgpm.content.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.umgpm.content.model.entity.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
