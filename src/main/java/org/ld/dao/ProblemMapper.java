package org.ld.dao;

import java.util.List;
import java.util.Map;
import org.ld.model.Problem;

public interface ProblemMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Problem record);

    int insertSelective(Problem record);

    Problem selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Problem record);

    int updateByPrimaryKey(Problem record);


    //add by yck
    int selectTotal(Map<String, Object> map);
    List<Problem> selectByPage(Map<String, Object> map);
}