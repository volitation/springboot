package io.spring.boot.service;

public interface StudentService {
	
	/**
	 * 获取所有学生信息
	 * @return
	 */
	public String strStudent();
	
	/**
	 * 通过年龄限制获取学生信息
	 * @param baseAge
	 * @return
	 */
	public String strAgeLarge (Integer baseAge);
	
	/**
	 * 通过性别限制获取学生信息
	 * @param ifSex
	 * @return
	 */
	public String strStudentSex (String ifSex);
	
}
