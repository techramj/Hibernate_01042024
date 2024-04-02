package com.seed.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.seed.entity.Address;
import com.seed.entity.Department;
import com.seed.entity.Employee;
import com.seed.util.ConnectionUtil;

public class EmpDaoImpl implements EmpDao {

	private Connection connection;

	public EmpDaoImpl() {
		connection = ConnectionUtil.getConnection();
	}

	@Override
	public void save(Employee emp) throws SQLException {
		// insert into dept1 table if not exist
		String sql1 = "insert into dept1(did,dept_name) values (?,?)";

		// insert into add1
		String sql2 = "insert into address1(add_id,line1,line2,city,pincode) values (?,?,?,?,?)";

		// insert into emp
		String sql3 = "insert into emp1(id,name,salary,add_id,did) values (?,?,?,?,?)";

		try (PreparedStatement ps1 = connection.prepareStatement(sql1);
				PreparedStatement ps2 = connection.prepareStatement(sql2);
				PreparedStatement ps3 = connection.prepareStatement(sql3);) {

			// dept
			ps1.setInt(1, emp.getDepartment().getDid());
			ps1.setString(2, emp.getDepartment().getDeptName());

			// address
			ps2.setInt(1, emp.getAddress().getAddressId());
			ps2.setString(2, emp.getAddress().getLine1());
			ps2.setString(3, emp.getAddress().getLine2());
			ps2.setString(4, emp.getAddress().getCity());
			ps2.setInt(5, emp.getAddress().getPincode());

			// emp
			ps3.setInt(1, emp.getId());
			ps3.setString(2, emp.getName());
			ps3.setDouble(3, emp.getSalary());
			ps3.setInt(4, emp.getAddress().getAddressId());
			ps3.setInt(5, emp.getDepartment().getDid());

			ps1.executeUpdate();
			ps2.executeUpdate();
			ps3.executeUpdate();

		}

	}

	@Override
	public Employee findById(int id) throws SQLException {
		String sql1 = "select * from emp1 where id =?";
		String sql2 = "select * from address1 where add_id = ?";
		String sql3 = "select * from dept1 where did = ?";
		Employee emp = new Employee();

		try (PreparedStatement ps1 = connection.prepareStatement(sql1)) {
			ps1.setInt(1, id);
			ResultSet rs = ps1.executeQuery();
			emp.setId(id);
			if (rs.next()) {
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getDouble("salary"));
				int addressId = rs.getInt("add_id");
				int did = rs.getInt("did");

				try (PreparedStatement ps2 = connection.prepareStatement(sql2)) {
					ps2.setInt(1, addressId);
					ResultSet rs2 = ps2.executeQuery();
					if (rs2.next()) {
						Address add = new Address();
						add.setAddressId(addressId);
						add.setLine1(rs2.getString("line1"));
						add.setLine2(rs2.getString("line2"));
						add.setCity(rs2.getString("city"));
						add.setPincode(rs2.getInt("pincode"));

						emp.setAddress(add);
					}
				}

				try (PreparedStatement ps3 = connection.prepareStatement(sql3)) {
					ps3.setInt(1, did);
					ResultSet rs3 = ps3.executeQuery();
					if (rs3.next()) {
						Department dept = new Department();
						dept.setDid(did);
						dept.setDeptName(rs3.getString("dept_name"));
						emp.setDepartment(dept);
					}

				}
			}
		}
		return emp;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}
