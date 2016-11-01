package simpleuse.functionaldemo;

public class People {
	private String name;

	private int id;
	
	private int age;
	
	public People (){
		
	}
	
	public People (int id){
		this.id = id;
	}

	
	People returnPeople(int id){
		People p = new People();
		p.setAge(id);
		p.setId(id);
		return p;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
