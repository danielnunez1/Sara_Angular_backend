package co.com.unionsoluciones.apirestservicios.models;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author rblanco on 29/04/22
 **/
public class UsuarioModel {

//    private Integer id;
//    private String nombre;
//    private String apellido;
//    private String empresa;
//    private String usuario;
//    private String clave;
//    private String roles;
//    private String estado;
//    private String conexion;
//
//    public UsuarioModel() {
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String getApellido() {
//        return apellido;
//    }
//
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }
//
//    public String getEmpresa() {
//        return empresa;
//    }
//
//    public void setEmpresa(String empresa) {
//        this.empresa = empresa;
//    }
//
//    public String getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(String usuario) {
//        this.usuario = usuario;
//    }
//
//    public String getClave() {
//        return clave;
//    }
//
//    public void setClave(String clave) {
//        this.clave = clave;
//    }
//
//    public String getRoles() {
//        return roles;
//    }
//
//    public void setRoles(String roles) {
//        this.roles = roles;
//    }
//
//    public String getEstado() {
//        return estado;
//    }
//
//    public void setEstado(String estado) {
//        this.estado = estado;
//    }
//
//    public String getConexion() {
//        return conexion;
//    }
//
//    public void setConexion(String conexion) {
//        this.conexion = conexion;
//    }
//
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("UsuarioModel{");
//        sb.append("id=").append(id);
//        sb.append(", nombre='").append(nombre).append('\'');
//        sb.append(", apellido='").append(apellido).append('\'');
//        sb.append(", empresa='").append(empresa).append('\'');
//        sb.append(", usuario='").append(usuario).append('\'');
//        sb.append(", clave='").append(clave).append('\'');
//        sb.append(", roles='").append(roles).append('\'');
//        sb.append(", estado='").append(estado).append('\'');
//        sb.append(", conexion='").append(conexion).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }
	
	
	private String login;
	private String nombre;
	private String clave;
	private String email;
	private Date expiracion;
	private String estado;
	private String llaveGrupoAcceso;
	private String claves;
	private Date fechaClave;
	private Integer intentos;
	private BigDecimal cedula;
	private String documento;
	private String parametroBusqueda;
	private String pin;
	private Integer intentosPregunta;
	private String tokenRecuperacion;
	private String terminosYCondiciones;
	private Date  fechaTerminosYCondiciones;
	private Date fechaHabilitar;
	private String llaveEmpresa;
	private String checkAyuda;
	//parametro usado para el cambio de clave
	private String loginEmail;
	
	/**
	 * Empleado para habilitar la edicion de los campos de la tabla usuario
	 * En la configuracion de sara prime, este campo no es persistente.
	 */
	private boolean modificarCelda;
	
	/**
	 * Se utiliza para conocer si el usuario debe cambiar la clave
	 * en el proximo login 
	 */
	private String cambiarClave;
	
	/**
	 * Usado para cargar el rol del usario en sara prime.
	 */
	private String rolGrupal;
	
	/*
	 *  Atributos no persistentes
	 */
	
	private String filtroGeneral;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getExpiracion() {
		return expiracion;
	}

	public void setExpiracion(Date expiracion) {
		this.expiracion = expiracion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getLlaveGrupoAcceso() {
		return llaveGrupoAcceso;
	}

	public void setLlaveGrupoAcceso(String llaveGrupoAcceso) {
		this.llaveGrupoAcceso = llaveGrupoAcceso;
	}

	public String getClaves() {
		return claves;
	}

	public void setClaves(String claves) {
		this.claves = claves;
	}

	public Date getFechaClave() {
		return fechaClave;
	}

	public void setFechaClave(Date fechaClave) {
		this.fechaClave = fechaClave;
	}

	public Integer getIntentos() {
		return intentos;
	}

	public void setIntentos(Integer intentos) {
		this.intentos = intentos;
	}

	public BigDecimal getCedula() {
		return cedula;
	}

	public void setCedula(BigDecimal cedula) {
		this.cedula = cedula;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getParametroBusqueda() {
		return parametroBusqueda;
	}

	public void setParametroBusqueda(String parametroBusqueda) {
		this.parametroBusqueda = parametroBusqueda;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public Integer getIntentosPregunta() {
		return intentosPregunta;
	}

	public void setIntentosPregunta(Integer intentosPregunta) {
		this.intentosPregunta = intentosPregunta;
	}

	public String getTokenRecuperacion() {
		return tokenRecuperacion;
	}

	public void setTokenRecuperacion(String tokenRecuperacion) {
		this.tokenRecuperacion = tokenRecuperacion;
	}

	public String getTerminosYCondiciones() {
		return terminosYCondiciones;
	}

	public void setTerminosYCondiciones(String terminosYCondiciones) {
		this.terminosYCondiciones = terminosYCondiciones;
	}

	public Date getFechaTerminosYCondiciones() {
		return fechaTerminosYCondiciones;
	}

	public void setFechaTerminosYCondiciones(Date fechaTerminosYCondiciones) {
		this.fechaTerminosYCondiciones = fechaTerminosYCondiciones;
	}

	public Date getFechaHabilitar() {
		return fechaHabilitar;
	}

	public void setFechaHabilitar(Date fechaHabilitar) {
		this.fechaHabilitar = fechaHabilitar;
	}

	public String getLlaveEmpresa() {
		return llaveEmpresa;
	}

	public void setLlaveEmpresa(String llaveEmpresa) {
		this.llaveEmpresa = llaveEmpresa;
	}

	public String getCheckAyuda() {
		return checkAyuda;
	}

	public void setCheckAyuda(String checkAyuda) {
		this.checkAyuda = checkAyuda;
	}

	public String getLoginEmail() {
		return loginEmail;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}

	public boolean isModificarCelda() {
		return modificarCelda;
	}

	public void setModificarCelda(boolean modificarCelda) {
		this.modificarCelda = modificarCelda;
	}

	public String getCambiarClave() {
		return cambiarClave;
	}

	public void setCambiarClave(String cambiarClave) {
		this.cambiarClave = cambiarClave;
	}

	public String getRolGrupal() {
		return rolGrupal;
	}

	public void setRolGrupal(String rolGrupal) {
		this.rolGrupal = rolGrupal;
	}

	public String getFiltroGeneral() {
		return filtroGeneral;
	}

	public void setFiltroGeneral(String filtroGeneral) {
		this.filtroGeneral = filtroGeneral;
	}
	
	
	
}
