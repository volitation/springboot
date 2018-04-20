package io.spring.boot.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.spring.boot.service.StudentService;
import io.spring.boot.utils.AbnormalUtils;

/**
 * 学生信息——控制器
 * 
 * @author volitation
 *
 */
@RestController
public class StudentController {

	private static Logger logger = LogManager.getLogger(StudentController.class);

	@Autowired
	private StudentService studentService;

	/**
	 * 获取所有学生信息数据
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/strStudent")
	@ResponseBody
	public Object strStudent(HttpServletRequest request, HttpServletResponse response) {
		Object obiect = null;

		try {
			obiect = studentService.strStudent();

		} catch (Exception e) {
			obiect = AbnormalUtils.getAbnormal(e);
			logger.error(obiect);
		}
		return obiect;
	}

	/**
	 * 通过年龄限制获取学生信息数据
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/strAgeLarge")
	@ResponseBody
	public Object strAgeLarge(HttpServletRequest request, HttpServletResponse response) {
		Object obiect = null;
		try {

			String baseAge = request.getParameter("baseAge");
			baseAge = "16";
			Integer baseAgeInt = Integer.parseInt(baseAge);
			logger.info(baseAgeInt);

			obiect = studentService.strAgeLarge(baseAgeInt);

		} catch (Exception e) {
			obiect = AbnormalUtils.getAbnormal(e);
			logger.error(obiect);
		}
		return obiect;
	}

	/**
	 * 通过性别限制获取学生信息数据
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/strStudentSex")
	@ResponseBody
	public Object strStudentSex(HttpServletRequest request, HttpServletResponse response) {
		Object obiect = null;
		try {

			String ifSex = request.getParameter("ifSex");
			ifSex = "男";
			logger.info(ifSex);

			obiect = studentService.strStudentSex(ifSex);

		} catch (Exception e) {
			obiect = AbnormalUtils.getAbnormal(e);
			logger.error(obiect);
		}
		return obiect;
	}

}
