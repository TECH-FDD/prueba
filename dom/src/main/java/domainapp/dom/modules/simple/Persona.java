package domainapp.dom.modules.simple;

import java.sql.Timestamp;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import org.apache.isis.applib.annotation.Editing;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Property;

@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.SUBCLASS_TABLE)
public abstract class Persona {
	private String nombre;
	private String apellido;
	private int nroDocumento;
	private Timestamp fechaNacimiento;
	private String domicilio;
	private int codigoPostal;
	private Timestamp fechaAlta;
	private String telefono;
	private String email;

	public Persona(String nombre, String apellido,
			int nroDocumento, Timestamp fechaNacimiento, String domicilio, int codigoPostal,
			Timestamp fechaAlta, String telefono, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroDocumento = nroDocumento;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilio = domicilio;
		this.codigoPostal = codigoPostal;
		this.fechaAlta = fechaAlta;
		this.telefono = telefono;
		this.email = email;
	}

	public Persona() {
		super();
	}

	@Persistent
	@MemberOrder(sequence = "1")
	@javax.jdo.annotations.Column(allowsNull="false")
	@Property(editing=Editing.DISABLED)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Persistent
	@MemberOrder(sequence = "2")
	@javax.jdo.annotations.Column(allowsNull="false")
	@Property(editing=Editing.DISABLED)
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@MemberOrder(sequence = "5")
	@javax.jdo.annotations.Column(allowsNull="false")
	@Property(editing=Editing.DISABLED)
	public Timestamp getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Timestamp fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@MemberOrder(sequence = "10")
	@javax.jdo.annotations.Column(allowsNull="false")
	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	@MemberOrder(sequence = "9")
	@javax.jdo.annotations.Column(allowsNull="false")
	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	@MemberOrder(sequence = "13")
	@javax.jdo.annotations.Column(allowsNull="false")
	@Property(editing=Editing.DISABLED)
	public Timestamp getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Timestamp fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	@MemberOrder(sequence = "4")
	@javax.jdo.annotations.Column(allowsNull="false")
	@Property(editing=Editing.DISABLED)
	public int getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}


	
	@MemberOrder(sequence = "11")
	@javax.jdo.annotations.Column(allowsNull="false")
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@MemberOrder(sequence = "12")
	@javax.jdo.annotations.Column(allowsNull="false")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
