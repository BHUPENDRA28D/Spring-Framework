package com.sp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sp.beans.Employee;
import com.sp.mappers.EmployeeRowMapper;
import com.sp.resources.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	
    	
    	

			
		
         ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
         
         JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
         
// -------------------INSERTION OPERTATION---------------------//     
/*        int empid=1359;
    	String name = "Hardik Pandaya";
    	int  age = 28;
    	float salary = 195242.87f;
    	String dept = "SOFTWARE";
    	
     String insert_sql_query = "INSERT INTO employee VALUES (?,?,?,?,?)";
        
      int count =   jdbcTemplate.update(insert_sql_query,empid,name,age,salary,dept);
   
      if(count > 0) {
   	  System.out.println("Insertion Succesfully");
  	  
    }else {
  	  System.out.println("Insertion not Succesfull");
    } */
         
         
         
//---------------------UPDATE OPERATION--------------------------//    
         
/*         float salary = 95214.63f;
         int empid = 1347;
         
         String update_sql_query  ="UPDATE employee SET salary=? where empid=?";
         
         int count = jdbcTemplate.update(update_sql_query,salary,empid);
         if(count>0) {
        	 System.out.println("Updation  Succesfully");
         	  
         }else {
       	  System.out.println("Updation not Succesfull");
        	 
         }
  */
         
 //---------------------DELETE OPERATION--------------------------//       
        int empid = 1359;
        
        String delete_sql_query = "DELETE FROM employee where empid  = ?";
        int count = jdbcTemplate.update(delete_sql_query,empid);
        if(count>0) {
       	 System.out.println("Deletion  Succesfully");
        	  
        }else {
      	  System.out.println("Deletion not Succesfull");
       	 
        }
        
        
//---------------------Select OPERATION--------------------------//
        
        String select_sql_query= "Select * from employee";
       List<Employee> emp_list = jdbcTemplate.query(select_sql_query, new EmployeeRowMapper());
         
       for(Employee emp : emp_list) {
    	   System.out.println("___________________________________");
    	   System.out.println("EmpID  : "+emp.getEmpid());
    	   System.out.println("Name  : "+emp.getName());
    	   System.out.println("Age : "+emp.getAge());
    	   System.out.println("Salary : "+emp.getSalary());
    	   System.out.println("Department : "+emp.getDept());
    	   System.out.println("------------------------------------");
       }
}
    
}
