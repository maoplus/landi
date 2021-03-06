package org.ld.dao;

import java.util.List;
import org.ld.model.Staff;

public interface StaffMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);

    List<Staff> selectByDuty(String DUTY);
}
