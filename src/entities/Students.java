package entities;

public class Students {

	private Integer code;
	private char course;
	
	/* Construtores */
	
	public Students(Integer code, char course) {
		this.code = code;
		this.course = course;
	}

	/* Getters e Setters */
	
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public char getCourse() {
		return course;
	}

	public void setCourse(char course) {
		this.course = course;
	}

	/* HashCode e Equals */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}
