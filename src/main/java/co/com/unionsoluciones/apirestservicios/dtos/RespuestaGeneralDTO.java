package co.com.unionsoluciones.apirestservicios.dtos;

public class RespuestaGeneralDTO {

	private String general;
	private RespuestaAutenticacionDTO data;
	private String origen;

	public RespuestaAutenticacionDTO getData() {
		return data;
	}

	public void setData(RespuestaAutenticacionDTO data) {
		this.data = data;
	}

	public String getGeneral() {
		return general;
	}

	public void setGeneral(String general) {
		this.general = general;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

}
