package com.sp.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sp.beans.Employee;

public class implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.setEmpid(rs.getInt("empid"));
		emp.setName(rs.getString("name"));
		emp.setAge(rs.getInt("age"));
		emp.setSalary(rs.getFloat("salary"));
		emp.setDept(rs.getString("dept"));
		
		return emp;
	}
	
	
}
