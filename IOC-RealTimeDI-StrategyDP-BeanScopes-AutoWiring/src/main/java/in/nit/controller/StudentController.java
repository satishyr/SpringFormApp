package in.nit.controller;

import in.nit.dto.StudentDTO;
import in.nit.service.StudentService;
import in.nit.vo.StudentVO;

public class StudentController {

	private StudentDTO dto;
	private StudentService service;
	
	public StudentController(StudentService service,StudentDTO dto) {
		System.out.println("MainController::1-param constructor");
		this.service = service;
		this.dto=dto;
	}
	
public String  handleStudent(StudentVO vo)throws Exception{
		
		String result=null;
		//convert VO to DTO
		
	
		dto.setSname(vo.getSname());
		dto.setSaddr(vo.getSaddr());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		//use service
		result=service.register(dto);
		return result;
		
		
	}
}
