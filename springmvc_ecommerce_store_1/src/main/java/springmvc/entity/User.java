package springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="userId")
	private int userId;
	
	
	@Column(name="username")
	private String userName;
	
	@Column(name="password")
	private String passWord;
	
	//@NotBlank(message = "Không được để trống")
	@Column(name="email")
	private String email;
	
	//@NotBlank(message = "Không được để trống")
	@Column(name="lastname")
	private String lastName;
	
	//@NotBlank(message = "Không được để trống")
	@Column(name="firstname")
	private String firstName;
	
	//@NotBlank(message = "Không được để trống")
	@Column(name="birthDay")
	private String birthDay;
	
	//@NotBlank(message = "Không được để trống")
	@Column(name="birthMonth")
	private String birthMonth;
	
	//@NotBlank(message = "Không được để trống")
	@Column(name="birthYear")
	private String birthYear;
	
	//@NotBlank(message = "Không được để trống")
	@Column(name="address")
	private String address;
	
	//@NotBlank(message = "Không được để trống")
	@Length(min = 10, max = 10,message = "SĐT tối đa 10 chữ số")
	@Column(name="phone")
	private String phone;
	
	//@NotBlank(message = "Không được để trống")
	@Column(name="country")
	private String country;
	
	//@NotBlank(message = "Không được để trống")
	@Column(name="state")
	private String state;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User() {
		super();
	}
}