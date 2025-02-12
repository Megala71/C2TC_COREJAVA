
package com.PlacementManagementSystem.Admin;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl<BCryptPasswordEncoder> implements AdminService {

    private final AdminRepository adminRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public AdminDTO createAdmin(AdminDTO adminDTO, String password) {
        String encryptedPassword = passwordEncoder.encode(password);
        Admin admin = AdminMapper.toEntity(adminDTO, encryptedPassword);
        admin = adminRepository.save(admin);
        return AdminMapper.toDTO(admin);
    }

    @Override
    public List<AdminDTO> getAllAdmins() {
        return adminRepository.findAll().stream()
                .map(AdminMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public AdminDTO getAdminById(Long id) {
        return adminRepository.findById(id)
                .map(AdminMapper::toDTO)
                .orElseThrow(() -> new AdminNotFoundException("Admin not found"));
    }

    @Override
    public AdminDTO getAdminByEmail(String email) {
        return adminRepository.findByEmail(email)
                .map(AdminMapper::toDTO)
                .orElseThrow(() -> new AdminNotFoundException("Admin not found"));
    }

    @Override
    public String deleteAdmin(Long id) {
        if (adminRepository.existsById(id)) {
            adminRepository.deleteById(id);
            return "Admin deleted successfully";
        }
        throw new AdminNotFoundException("Admin not found");
    }
}
