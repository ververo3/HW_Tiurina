package com.tiurina.dao.impl;

import com.tiurina.dao.EmployeeDAO;
import com.tiurina.model.Employee;

import javax.sql.DataSource;
import java.sql.*;

/**
 * Created by Vero on 06.04.2017.
 */
public class JdbcEmployeesDAO implements EmployeeDAO{
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Employee findByEmpId(int empId){

        String sql = "SELECT EMPLOYEE_ID, FIRST_NAME," +
                "LAST_NAME, salary FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";

        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, empId);
            Employee employee = null;
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                employee = new Employee();
                employee.setEmpId(rs.getInt("EMPLOYEE_ID"));
                employee.setFirstName(rs.getString("FIRST_NAME"));
                employee.setLastName(rs.getString("LAST_NAME"));
                employee.setSalary(rs.getDouble(4));
            }
            rs.close();
            ps.close();
            return employee;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}
