package org.sid.securityservice.sec.Repository;

import org.sid.securityservice.sec.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AppUserRepository extends JpaRepository<AppUser,Long> {
    AppUser findByUsername(String username);
}
