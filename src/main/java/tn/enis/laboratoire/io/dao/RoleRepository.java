package tn.enis.laboratoire.io.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enis.laboratoire.io.entities.Role;

public interface RoleRepository extends JpaRepository<Role, String> {
	Role findByRoleName(String roleName);
}
