package hotel_teacher;

public class User2 {
	private String name;
	private int age;
	private String gen;
	
	public User2() {}

	public User2(String name, int age, String gen) {
		this.name = name;
		this.age = age;
		this.gen = gen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gen=" + gen + "]";
	}
}
