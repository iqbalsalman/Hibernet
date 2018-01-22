package hibernate.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "pegawai", schema="public")
public class Employee extends BaseClass {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", updatable = false, nullable = false)
	private int id;
	
	@Column(name = "nama", length= 50)
	private String nama;
	
	@Column(name = "alamat", length = 150)
	private String alamat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	

}
