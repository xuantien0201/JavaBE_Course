package tien.service;

import java.util.List;

import tien.model.Role;
import tien.repository.RoleRepository;

public class RoleService {
	private RoleRepository roleRepository = new RoleRepository();
	
	public List<Role> getRoleBy() {
		return roleRepository.getRoleBy();
	}
}
