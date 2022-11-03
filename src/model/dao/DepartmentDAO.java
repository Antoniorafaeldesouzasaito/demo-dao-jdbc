package model.dao;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public interface DepartmentDAO {

		void insert(Department obj);
		void update(Department obj);
		void deleteByld(Integer id);
		Department findByld(Integer id);
		List<Department> findAll ();
}
