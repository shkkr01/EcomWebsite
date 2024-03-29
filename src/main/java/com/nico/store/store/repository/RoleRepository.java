package com.nico.store.store.repository;

import com.nico.store.store.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
	
	Role findByName(String name);

}
