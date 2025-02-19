package revisionExamen;

import java.util.Objects;

public class Entero {
	
	int dato ;

	@Override
	public int hashCode() {
		return Objects.hash(dato);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entero other = (Entero) obj;
		return dato == other.dato;
	}

}
