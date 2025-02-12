package com.PlacementManagementSystem.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admins")
public class AdminController<AdminDTO> {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping
    public AdminDTO createAdmin(@RequestBody AdminDTO adminDTO, @RequestParam String password) {
        return (AdminDTO) adminService.createAdmin((com.PlacementManagementSystem.Admin.AdminDTO) adminDTO, password);
    }

    @GetMapping
    public List<AdminDTO> getAllAdmins() {
        return (List<AdminDTO>) adminService.getAllAdmins();
    }

    @GetMapping("/{id}")
    public AdminDTO getAdminById(@PathVariable Long id) {
        return (AdminDTO) adminService.getAdminById(id);
    }

    @GetMapping("/email/{email}")
    public AdminDTO getAdminByEmail(@PathVariable String email) {
        return (AdminDTO) adminService.getAdminByEmail(email);
    }

    @DeleteMapping("/{id}")
    public String deleteAdmin(@PathVariable Long id) {
        return adminService.deleteAdmin(id);
    }
}
