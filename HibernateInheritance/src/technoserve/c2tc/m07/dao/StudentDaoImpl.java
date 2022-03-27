package technoserve.c2tc.m07.dao;

import javax.persistence.EntityManager;

import technoserve.c2tc.m07.entity.Student;

public class StudentDaoImpl implements StudentDao {
	EntityManager entityManager;
	public StudentDaoImpl() {
		entityManager =Configuration.getEntityManager();
	}

	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);
	}
	
	@Override
	public void startTransaction() {
		entityManager.getTransaction().begin();
		
	}
	@Override
	public void endTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void updateStudent(Student student) {
		entityManager.merge(student);
		
	}

	@Override
	public Student getStudent(int uid) {
		Student s= entityManager.find(Student.class, uid);
		return s;
	}

	@Override
	public void removeStudent(int uid) {
		Student s= entityManager.find(Student.class, uid);
		entityManager.remove(s);
		
	}

}
