package list.addrbook;

// VO
public class Address {
	private String name;
	private String tel;
	private String address;
	
	public Address() {}

	public Address(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", tel=" + tel + ", address=" + address + "]";
	}
}
