package com.PlacementManagementSystem.Admin;
public class AdminMapper {

    public static Admin toEntity(AdminDTO adminDTO, String password) {
        return new Admin(
            adminDTO.getName(),
            adminDTO.getEmail(),
            password, // Encrypt before saving
            adminDTO.getRole()
        );
    }

    public static AdminDTO toDTO(Admin admin) {
        return new AdminDTO(
            admin.getName(),
            admin.getEmail(),
            admin.getRole()
        );
    }

	public static com.PlacementManagementSystem.Admin.Admin toEntity1(
			com.PlacementManagementSystem.Admin.AdminDTO adminDTO, String encryptedPassword) {
		// TODO Auto-generated method stub
		return null;
	}

}
