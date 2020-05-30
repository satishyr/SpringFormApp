package in.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import in.nit.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {

	private static final String INSERT_STUDENT_QUERY = "INSERT INTO SPRING_LAYERED_STUDENT(SNAME,SADD,TOTAL,AVG,RESULT) VALUES(?,?,?,?,?)";

	private DataSource ds;

	public StudentDAOImpl(DataSource ds) {
		System.out.println("StudentDAOImpl:: 1-param constructor");
		this.ds = ds;
	}

	public int insert(StudentBO bo) throws Exception {

		Connection con = null;
		PreparedStatement ps = null;

		int count = 0;
		con = ds.getConnection();
		ps = con.prepareStatement(INSERT_STUDENT_QUERY);
		ps.setString(1, bo.getSname());
		ps.setString(2, bo.getSadd());
		ps.setInt(3, bo.getTotal());
		ps.setFloat(4, bo.getAvg());
		ps.setString(5, bo.getResult());

		count = ps.executeUpdate();
		ps.close();
		con.close();

		return count;
	}

}