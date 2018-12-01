package com.hzit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hzit.entity.Paper;
import com.hzit.entity.Question;
import com.hzit.util.HBUtil;

public class QuestionDao {

	@SuppressWarnings("unchecked")
	public List<Question> getDetails(String type, int paperId) {
		Session session = HBUtil.getCurrentSession();
		Transaction ts = session.beginTransaction();
		List<Question> list = null;
		try {
			list = session.createQuery("from Question q where q.type = :type and q.paper = :paperId")
					.setInteger("paperId", paperId).setString("type", type).list();
			ts.commit();
		} catch (Exception e) {
			ts.rollback();
			e.printStackTrace();
			return list;
		}
		return list;
	}

	public List<Integer> getIdByPaperIdAndType(Integer paperId, String type) {

		Session session = HBUtil.getCurrentSession();
		Transaction ts = session.beginTransaction();
		List<Integer> list = null;
		try {
			list = session.createQuery("select q.id from Question q where q.type = :type and q.paper = :paperId")
					.setInteger("paperId", paperId).setString("type", type).list();
			ts.commit();
		} catch (Exception e) {
			ts.rollback();
			e.printStackTrace();
			return list;
		}
		return list;
	}

	public boolean validateAnswer(Integer questionId, String value) {
		Session session = HBUtil.getCurrentSession();
		Transaction ts = session.beginTransaction();
		String answer = null;
		try {
			answer = (String) session.createQuery("select q.answer from Question q where q.id = :questionId")
					.setInteger("questionId", questionId).uniqueResult();
			System.out.println("system-answer==" + answer+"==="+answer.equals(value));
			if (answer.equals(value)) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return false;
	}

}
