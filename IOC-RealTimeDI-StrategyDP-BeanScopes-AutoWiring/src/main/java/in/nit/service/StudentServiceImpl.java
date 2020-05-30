package in.nit.service;

import in.nit.bo.StudentBO;
import in.nit.dao.StudentDAO;
import in.nit.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {

	private StudentDAO dao;
	private StudentBO bo;

	public StudentServiceImpl(StudentDAO dao, StudentBO bo) {
		System.out.println("StudentServiceImpl.StudentServiceImpl()");
		this.dao = dao;
		this.bo = bo;
	}

	public String register(StudentDTO dto) throws Exception {

		int total = 0;
		float avg = 0.0f;
		String result = null;

		int count = 0;

		total = dto.getM1() + dto.getM2() + dto.getM3();
		avg = total / 3.0f;

		if (dto.getM1() < 35 || dto.getM2() < 35 || dto.getM3() < 35)
			result = "fail";
		else
			result = "pass";
		// prepare BO class obj having Persistable Data

		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSaddr());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);

		// use DAO
		count = dao.insert(bo);
		// process the result
		if (count == 0)
			return "Student Registration failed--> ";
		else
			return "Student Registration succeded and total=" + total + " avg=" + avg + " result=" + result;

	}

}
