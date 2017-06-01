public class Cat{
	private Integer age;
	private String name;
	private Double weight;
	
	public Integer getAge(){
		return age;
	}
	
	public void setAge(Integer age){
		this.age=age;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public Double getWeight(){
		return weight;
	}
	
	public void setWeight(Double weight){
		this.weight=weight;
		System.out.println("cat...");
	}
}
