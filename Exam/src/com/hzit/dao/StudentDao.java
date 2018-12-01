package com.hzit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hzit.entity.Student;
import com.hzit.util.HBUtil;

public class StudentDao {


	public boolean save(Student currentUser) {
		Session session = HBUtil.getCurrentSession();
		Transaction ts = session.beginTransaction();
		try {
			session.saveOrUpdate(currentUser);
			ts.commit();
		} catch (Exception e) {
			System.out.println("ÃÜÂëÐÞ¸ÄÊ§°Ü£¬»Ø¹ö¡£¡£¡£");
			ts.rollback();
			return false;
		}
		return true;
	}

	public List<Student> getStudentList() {
		 List<Student> list = null;
		 Session session = HBUtil.getCurrentSession();
			Transaction ts = session.beginTransaction();
			try {
				list = session.createQuery("from Student").list();
				ts.commit();
			} catch (Exception e) {
				ts.rollback();
				return list;
			}
			return list;
	}

}
