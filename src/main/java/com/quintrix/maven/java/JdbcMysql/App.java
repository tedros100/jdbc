package com.quintrix.maven.java.JdbcMysql;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

	private static Statement stmt;
	private static ResultSet results;

	public static void main(String[] args) {

		String sql_select = "Select * From student_info";

		try (Connection conn = DBconnection.createNewDBconnection()) {

			stmt = conn.createStatement();
			results = stmt.executeQuery(sql_select);

			List<Student> studentsList = new ArrayList<Student>();

			while (results.next()) {

				Student stdObject = new Student();

				stdObject.setCustomers(Integer.valueOf(results.getString("id")));
				stdObject.setName(results.getString("name"));
				stdObject.setAddress(results.getString("Address"));
				stdObject.setCourse_code(results.getString("course_code"));

				studentsList.add(stdObject);
			}

			ObjectMapper mapper = new ObjectMapper();
			String JSONOutput = mapper.writeValueAsString(studentsList);
			System.out.println(JSONOutput);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
	}

}
