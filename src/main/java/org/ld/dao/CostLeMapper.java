package org.ld.dao;

import java.util.List;
import java.util.Map;
import org.ld.model.CostLe;

public interface CostLeMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(CostLe record);

    int insertSelective(CostLe record);

    CostLe selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(CostLe record);

    int updateByPrimaryKey(CostLe record);

    //add by lyd
    int totalExpense(Map<String,Object> map);

    List<CostLe> getExpenseBySearch(Map<String,Object> map);

    List<CostLe> getAllExpenseBySearch(Map<String,Object> map);

}