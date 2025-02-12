package com.PlacementManagementSystem.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public abstract class AdminRepository implements JpaRepository<Admin, Long> {

}
