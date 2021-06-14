/**
 * 
 */
package com.michael.adkins.socialnetwork.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author micha
 *
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2854952221288338470L;
	private Integer id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String shortName;
	private String nameFormat;
	private String profilePicture;
	private Date birthday;

	/**
	 * 
	 */
	public User() {
		super();
	}

	/**
	 * @param id
	 */
	public User(Integer id) {
		super();
		this.id = id;
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param birthday
	 */
	public User(String firstName, String lastName, Date birthday) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}

	/**
	 * @param id
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param birthday
	 */
	public User(Integer id, String firstName, String middleName, String lastName, Date birthday) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.birthday = birthday;
	}

	/**
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param birthday
	 */
	public User(String firstName, String middleName, String lastName, Date birthday) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.birthday = birthday;
	}

	/**
	 * @param id
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param shortName
	 * @param nameFormat
	 * @param profilePicture
	 * @param birthday
	 */
	public User(Integer id, String firstName, String middleName, String lastName, String shortName, String nameFormat,
			String profilePicture, Date birthday) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.shortName = shortName;
		this.nameFormat = nameFormat;
		this.profilePicture = profilePicture;
		this.birthday = birthday;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * @return the nameFormat
	 */
	public String getNameFormat() {
		return nameFormat;
	}

	/**
	 * @param nameFormat the nameFormat to set
	 */
	public void setNameFormat(String nameFormat) {
		this.nameFormat = nameFormat;
	}

	/**
	 * @return the profilePicture
	 */
	public String getProfilePicture() {
		return profilePicture;
	}

	/**
	 * @param profilePicture the profilePicture to set
	 */
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		// TODO do something here with formatted name
		return null;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return new StringBuilder(String.format("User@%s {", Integer.toHexString(hashCode())))
				.append((id != null ? "id=" + id + ", " : ""))
				.append((firstName != null ? "firstName=" + firstName + ", " : ""))
				.append((middleName != null ? "middleName=" + middleName + ", " : ""))
				.append((lastName != null ? "lastName=" + lastName + ", " : ""))
				.append((shortName != null ? "shortName=" + shortName + ", " : ""))
				.append((getName() != null ? "name=" + getName() + ", " : ""))
				.append((nameFormat != null ? "nameFormat=" + nameFormat + ", " : ""))
				.append((profilePicture != null ? "profilePicture=" + profilePicture + ", " : ""))
				.append((birthday != null ? "birthday=" + birthday : "") + "}").toString();
	}

	@Override
	public int hashCode() {
		final int prime = 13;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.getId() != null)
				return false;
			else {
				return this.firstName.equalsIgnoreCase(other.getFirstName())
						&& this.middleName.equalsIgnoreCase(other.getMiddleName())
						&& this.lastName.equalsIgnoreCase(other.getLastName())
						&& this.birthday.equals(other.getBirthday());
			}
		}
		return (id.equals(other.getId()));
	}
}
