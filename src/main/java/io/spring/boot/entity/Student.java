package io.spring.boot.entity;

/**
 * 学生表实体
 * 
 * @author volitation
 *
 */
public class Student {
	
	private String name; //姓名
	
	private Integer age; //年龄
	
	private String sex; //性别
	
	private Double height; //身高
	
	private Double weight; //体重

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + ", height=" + height + ", weight=" + weight
				+ "]";
	}
	
}
