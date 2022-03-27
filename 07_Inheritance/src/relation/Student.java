package relation;

public class Student extends Person {
	private String[] subjects;
	
//	public Student() {
////		super(); 생략이 되어 있음
//		System.out.println("This is Student Instance");
//	}

	public void printSubjects() {
		System.out.println(name + " 학생의 수강과목");
		
		for(String subject: subjects) {
			System.out.println("수강과목 : " + subject);
		}
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	
}
