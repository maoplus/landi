package org.ld.service;

import java.util.Date;
import java.util.List;
import org.ld.model.Problem;

public interface ProblemService {

	Integer addProblem(Problem prob);

	int getTotalProblems(String roomNum, Date reflectDate);
	List<Problem> getProblemsByPage(String roomNum, Date reflectDate, int startPage, int eachPage);

	Problem selectById(Integer id);

	int updateProblem(Problem prob);
}
