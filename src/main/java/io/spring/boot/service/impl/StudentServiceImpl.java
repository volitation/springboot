package io.spring.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.boot.dao.StudentDao;
import io.spring.boot.entity.Student;
import io.spring.boot.service.StudentService;
import io.spring.boot.utils.JsonUtils;

/**
 * 学生信息——业务层
 * 
 * @author volitation
 *
 */
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public String strStudent() {
		List<Student> listStudent = studentDao.listStudent();
		return JsonUtils.toJSON(listStudent,true);
	}

	@Override
	public String strAgeLarge(Integer baseAge) {
		List<Student> listAgeLarge = studentDao.listAgeLarge(baseAge);
		return JsonUtils.toJSON(listAgeLarge,true);
	}

	@Override
	public String strStudentSex(String ifSex) {
		List<Student> listStudentSex = studentDao.listStudentSex(ifSex);
		return JsonUtils.toJSON(listStudentSex,true);
	}


}
