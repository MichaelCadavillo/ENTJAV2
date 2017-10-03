package model;

import javax.persistence.*;

@Entity (name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String position;
	private String department;
	
	//has-a relationship
	@Embedded
	@Column(name="address")
	private Address address;
	
	@AttributeOverrides({
        @AttributeOverride(name="shippingAddress",
                           column=@Column(name="SHIPPING")),
        @AttributeOverride(name="billingAddress",
                           column=@Column(name="BILLING")),
        @AttributeOverride(name="officeAddress",
        				column=@Column(name="OFFICE"))
    })
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
