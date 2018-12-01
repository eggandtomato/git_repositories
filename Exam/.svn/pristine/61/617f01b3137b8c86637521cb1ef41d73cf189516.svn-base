package com.hzit.dao;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hzit.entity.Paper;
import com.hzit.entity.Question;
import com.hzit.util.HBUtil;

public class PaperDao {

	@SuppressWarnings("unchecked")
	public List<Paper> getPapers() {
		Session session = HBUtil.getCurrentSession();
		Transaction ts = session.beginTransaction();
		List<Paper> list = null;
		try {
			list = session.createQuery("from Paper").list();
			ts.commit();
		} catch (Exception e) {
			ts.rollback();
			return list;
		}
		return list;
	}

	public Paper getPaperById(int paperId) {

		Session session = HBUtil.getCurrentSession();
		Transaction ts = session.beginTransaction();
		Paper paper = null;
		try {
			paper = (Paper) session.createQuery("from Paper p where p.id = :id").setInteger("id", paperId)
					.uniqueResult();
			ts.commit();
		} catch (Exception e) {
			ts.rollback();
			return paper;
		}
		return paper;
	}

}
