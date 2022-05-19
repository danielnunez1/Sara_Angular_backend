package co.com.unionsoluciones.apirestservicios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.unionsoluciones.apirestservicios.dtos.RolUsuarioDTO;
import co.com.unionsoluciones.apirestservicios.models.RolModel;
import co.com.unionsoluciones.apirestservicios.mybatis.mapper.RolMapper;

@Service
public class ServiceRol {

	@Autowired(required = false)
	private RolMapper rolMapper;

	public List<RolModel> getRoles(){
		return rolMapper.getRoles();
	}
	
    public List<RolUsuarioDTO> consultarRoles(RolUsuarioDTO rolUsuario){
        return rolMapper.obtenerRolModConEmp(rolUsuario);
    }
}
