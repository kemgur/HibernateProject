package h03.onetoonejoins;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dairy {
	
	@Id
	private int id;
    private String dairy;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDairy() {
		return dairy;
	}

	public void setDairy(String diary) {
		this.dairy = diary;
	}

	@Override
	public String toString() {
		return "Dairy [id=" + id + ", dairy=" + dairy + "]";
	}

}