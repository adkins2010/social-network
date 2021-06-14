/**
 * 
 */
package com.michael.adkins.socialnetwork.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author micha
 *
 */
public class Experience implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1718734693028436785L;
	private Integer id;
	private String description;
	private User from;
	private String name;
	private List<User> with;

	/**
	 * 
	 */
	public Experience() {
		super();
	}

	/**
	 * @param id
	 */
	public Experience(Integer id) {
		super();
		this.id = id;
	}

	/**
	 * @param id
	 * @param description
	 * @param from
	 * @param name
	 * @param with
	 */
	public Experience(Integer id, String description, User from, String name, List<User> with) {
		super();
		this.id = id;
		this.description = description;
		this.setFrom(from);
		this.name = name;
		this.setWith(with);
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the from
	 */
	public User getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(User from) {
		this.from = from;
	}

	/**
	 * @return the with
	 */
	public List<User> getWith() {
		return with;
	}

	/**
	 * @param with the with to set
	 */
	public void setWith(List<User> with) {
		this.with = with;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(String.format("Experience@%s {", Integer.toHexString(hashCode())));
		if (id != null) {
			builder.append("id=");
			builder.append(id);
			builder.append(", ");
		}
		if (description != null) {
			builder.append("description=");
			builder.append(description);
			builder.append(", ");
		}
		if (from != null) {
			builder.append("from={");
			builder.append(from.toString());
			builder.append("}, ");
		}
		if (name != null) {
			builder.append("name=");
			builder.append(name);
			builder.append(", ");
		}
		if (with != null && with.size() > 0) {
			builder.append("with=");
			builder.append(with.stream().map(user -> String.format("{%s}", user.toString()))
					.collect(Collectors.joining(",", "[", "]")));
		}
		builder.append("}");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, getFrom(), id, name, getWith());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Experience))
			return false;
		Experience other = (Experience) obj;
		return Objects.equals(description, other.description) && Objects.equals(getFrom(), other.getFrom())
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(getWith(), other.getWith());
	}

}
