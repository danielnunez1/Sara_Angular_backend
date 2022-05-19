package co.com.unionsoluciones.apirestservicios.dtos;

import java.util.List;

/**
 * @author rblanco on 30/04/22
 **/
public class RespuestaAutenticacionDTO {

	private String token;
	private String etiquetas;
	private List<RolUsuarioDTO> listaRoles;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getEtiquetas() {
		return etiquetas;
	}

	public void setEtiquetas(String etiquetas) {
		this.etiquetas = etiquetas;
	}

	public List<RolUsuarioDTO> getListaRoles() {
		return listaRoles;
	}

	public void setListaRoles(List<RolUsuarioDTO> listaRoles) {
		this.listaRoles = listaRoles;
	}

	
}
