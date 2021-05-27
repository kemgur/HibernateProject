package h03.onetoonejoins;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity 
@Table(name="students_table") 
public class Students03 {
	
	@Id 
	private int student_id;
	@Column(name="student_name") //@Column() is used to be able to use different names for columns
	private String name;
	@Transient // @Transient is used not to make a variable column
	private int grade;
	
	public Students03() {
		
	}
	public Students03(int id, String name, int grade) {
		this.student_id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public int getId() {
		return student_id;
	}
	public void setId(int id) {
		this.student_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Students01: student_id=" + student_id + ", name=" + name + ", grade=" + grade + ".";
	}

}