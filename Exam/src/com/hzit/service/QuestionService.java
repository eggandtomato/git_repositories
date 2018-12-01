package com.hzit.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.hzit.constant.Constant;
import com.hzit.dao.QuestionDao;
import com.hzit.entity.Question;

public class QuestionService {

	public List<Question> getDetails(String type, int paperId) {
		// TODO Auto-generated method stub
		return new QuestionDao().getDetails(type, paperId);
	}

	public List<Integer> getIdByPaperIdAndType(Integer paperId, String type) {

		return new QuestionDao().getIdByPaperIdAndType(paperId, type);
	}

	public int getExamOfResult(String questionType, int gainScore, HashMap<String, String> answer) {
		Set<Entry<String, String>> set = answer.entrySet();
		int score = 0;
		QuestionDao dao = new QuestionDao();
		switch (questionType) {
		// µ¥Ñ¡
		case "id-r":
			for (Entry<String, String> entry : set) {
				if (dao.validateAnswer(Integer.parseInt(entry.getKey().substring(5)), entry.getValue()))
					score += gainScore;
			}

			break;
		// ¸´Ñ¡
		case "id-c":
			for (Entry<String, String> entry : set) {
				String ans = entry.getValue().substring(1, entry.getValue().length() - 1).replaceAll(" ", "");
				System.out.println("your answer======" + ans);
				if (dao.validateAnswer(Integer.parseInt(entry.getKey().substring(5)), ans)) {
					score += gainScore;
				}
			}
			break;
		}

		return score;
	}

}
