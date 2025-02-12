package com.PlacementManagementSystem.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class AdminController {

	  private final AdminService adminService;
	  
	  @Autowired
	  public AdminController(AdminService adminService) {
	    this.adminService = adminService;
	  }
	  
	  @GetMapping
	  public List<Admin> getAllAdmins() {
	    return adminService.getAllAdmins();
	  }
	  
	  @GetMapping("/{id}")
	  public Admin getAdminById(@PathVariable Long id) {
	    return adminService.getAdminById(id);
	  }
	  
	  @PostMapping
	  public Admin createAdmin(@RequestBody Admin admin) {
	    return adminService.createAdmin(admin);
	  }
	  
	  @PutMapping("/{id}")
	  public Admin updateAdmin(@PathVariable Long id, @RequestBody Admin admin) {
	    Admin existingAdmin = adminService.getAdminById(id);
	    if (existingAdmin != null) {
	      existingAdmin.setName(admin.getName());
	      existingAdmin.setEmail(admin.getEmail());
	      existingAdmin.setPassword(admin.getPassword());
	      return adminService.updateAdmin(existingAdmin);
	    } else {
	      return null;
	    }
	  }
	  
	  @DeleteMapping("/{id}")
	  public void deleteAdmin(@PathVariable Long id) {
	    adminService.deleteAdmin(id);
	  }

}
