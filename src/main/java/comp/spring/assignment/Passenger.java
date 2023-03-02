package comp.spring.assignment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="passengers")
public class Passenger {
	
	@Id
	@Column(name="passengerid")
	public int passengerId;

	@Column(name="email")
	@NotBlank(message = "Email is mandatory")
	@Email(message = "Email should be valid")
	public String email;

	@Column(name="password")
	@NotBlank(message = "Password is mandatory")
	@Size(min = 8, max = 20, message = "Password should be between 8 and 20 characters")
	public String password;

	@Column(name="firstname")
	@NotBlank(message = "First name is mandatory")
	@Size(max = 50, message = "First name should be maximum 50 characters")
	public String firstname;

	@Column(name="lastname")
	@NotBlank(message = "Last name is mandatory")
	@Size(max = 50, message = "Last name should be maximum 50 characters")
	public String lastname;

	@Column(name="address")
	@NotBlank(message = "Address is mandatory")
	@Size(max = 100, message = "Address should be maximum 100 characters")
	public String address;

	@Column(name="city")
	@NotBlank(message = "City is mandatory")
	@Size(max = 50, message = "City should be maximum 50 characters")
	public String city;

	@Column(name="postalcode")
	@NotBlank(message = "Postal code is mandatory")
	@Size(max = 10, message = "Postal code should be maximum 10 characters")
	public String postalCode;

    
    
    
    public Passenger() {
    	
    }
    
    

	public Passenger(int passengerId,  String email, String password, String firstname, String lastname,
			String address, String city, String postalCode) {
		super();
		this.passengerId = passengerId;

		this.email = email;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;
	}

	/**
	 * @return the passengerId
	 */
	public int getPassengerId() {
		return passengerId;
	}

	/**
	 * @param passengerId the passengerId to set
	 */
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
    
    
	

}
