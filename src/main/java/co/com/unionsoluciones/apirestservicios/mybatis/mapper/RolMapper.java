package co.com.unionsoluciones.apirestservicios.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import co.com.unionsoluciones.apirestservicios.anotaciones.DataSourceByToken;
import co.com.unionsoluciones.apirestservicios.dtos.NominaEmpleadoDTO;
import co.com.unionsoluciones.apirestservicios.dtos.RolUsuarioDTO;
import co.com.unionsoluciones.apirestservicios.models.RolModel;
import co.com.unionsoluciones.apirestservicios.models.UsuarioModel;
import co.com.unionsoluciones.apirestservicios.multdatasources.DataSourcesEnums;

public interface RolMapper {

	List<RolModel> getRoles();
	
	@DataSourceByToken(value = DataSourcesEnums.SEGURIDAD)
	List<RolUsuarioDTO> obtenerRolModConEmp(RolUsuarioDTO rol);
	
}
