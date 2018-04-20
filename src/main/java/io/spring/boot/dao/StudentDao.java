package io.spring.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import io.spring.boot.entity.Student;


/**
 * 学生信息——Dao层
 * 
 * @author volitation
 *
 */
@Mapper
public interface StudentDao {
	
	/**
	 * 获取所有学生信息
	 * @return
	 */
	public List<Student> listStudent();
	
	/**
	 * 通过年龄限制获取学生信息
	 * @param baseAge
	 * @return
	 */
	public List<Student> listAgeLarge (Integer baseAge);
	
	/**
	 * 通过性别限制获取学生信息
	 * @param ifSex
	 * @return
	 */
	public List<Student> listStudentSex (String ifSex);

}
