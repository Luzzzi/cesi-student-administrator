package fr.cesi.dataAccess;

public class Student {
	private Integer id; 
	private String year_group;
	private String name; 
	private String firstname;
	private String adress; 
	private String email;
	private String phone_number; 
	private Integer absence;
	private boolean representative;
	
	//getter/setter 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getYear_group() {
		return year_group;
	}
	public void setYear_group(String year_group) {
		this.year_group = year_group;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public Integer getAbsence() {
		return absence;
	}
	public void setAbsence(Integer absence) {
		this.absence = absence;
	}
	public boolean isRepresentative() {
		return representative;
	}
	public void setRepresentative(boolean representative) {
		this.representative = representative;
	}
	
	
	public Student(Integer id, String year_group, String name, String firstname, String adress, String email,
			String phone_number, Integer absence, boolean representative) {
		super();
		this.id = id;
		this.year_group = year_group;
		this.name = name;
		this.firstname = firstname;
		this.adress = adress;
		this.email = email;
		this.phone_number = phone_number;
		this.absence = absence;
		this.representative = representative;
	}
	

}
