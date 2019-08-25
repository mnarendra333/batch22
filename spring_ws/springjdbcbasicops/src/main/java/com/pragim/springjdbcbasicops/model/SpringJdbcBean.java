package com.pragim.springjdbcbasicops.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class SpringJdbcBean {

	@Autowired
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void getStudentList() {
		List<Map<String, Object>> queryForList = template.queryForList("select * from student");
		queryForList.forEach(System.out::println);
	}

	// execute methods

	public void saveStudent() {
		template.execute("insert into student values(200,'raja',300)");
	}

	// update methods
	public void updateStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id and marks");
		int id = sc.nextInt();
		int marks = sc.nextInt();

		int count = template.update("update student set marks=? where stuid=?", new Object[] { marks, id });
		System.out.println(count + "rows updated!!!");
	}

	public void fetchStudentDataUsingResultsetExtractor() {

		List<Student> stuList = template.query("select * from student", new ResultSetExtractor<List<Student>>() {

			@Override
			public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub

				List<Student> list = new ArrayList<Student>();
				while (rs.next()) {
					Student stu = new Student();
					stu.setStuId(rs.getInt(1));
					stu.setStuName(rs.getString(2));
					stu.setMarks(rs.getInt(3));
					list.add(stu);

				}
				return list;
			}
		});

		stuList.forEach(System.out::println);

	}

	public void fetchStudentDataUsingRowMapper() {

		List<Student> list = template.query("select * from student", new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student stu = new Student();
				stu.setStuId(rs.getInt(1));
				stu.setStuName(rs.getString(2));
				stu.setMarks(rs.getInt(3));
				return stu;
			}
		});

		list.forEach(System.out::println);
	}

}
