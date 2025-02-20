package entities;

import java.sql.Date;

public class Seller {
	
	private Integer id;
	private String email;
	private String name;
	private Date birthDate;
	private Double baseSalary;
	
	public Seller() {
		
	}
	
	public Seller(Integer id, String email, String name, Date birthDate, Double baseSalary) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
	
	@Override
	public String toString() {
		return "Seller [id=" + id + ", email=" + email + ", name=" + name + ", birthDate=" + birthDate + ", baseSalary="
				+ baseSalary + "]";
	}
	
	
	
	
}
