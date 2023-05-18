package Tasca1_S3_exercici1;

import java.util.Objects;

public class Month {

	String name; 
	
	public Month(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Aquest és el mes: " + this.name ;
	}
	
	
}
