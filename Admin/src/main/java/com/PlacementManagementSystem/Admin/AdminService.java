
package com.placementmanagement.admin.service;

import com.placementmanagement.admin.dto.AdminDTO;
import java.util.List;

public interface AdminService {
    AdminDTO createAdmin(AdminDTO adminDTO, String password);
    List<AdminDTO> getAllAdmins();
    AdminDTO getAdminById(Long id);
    AdminDTO getAdminByEmail(String email);
    String deleteAdmin(Long id);
}