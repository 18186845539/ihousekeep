package com.ccunix.ihousekeeping.basedb.dao;
import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.basedb.domain.T_s_unit;
@DataSourceType(DataSourceType.main)public interface T_s_unit_Dao_Iface {
public void insert_t_s_unit(T_s_unit t_s_unit) throws Exception;
public void update_t_s_unit(T_s_unit t_s_unit) throws Exception;
public void delete_t_s_unit(T_s_unit t_s_unit) throws Exception;
public List queryAll_t_s_unit(T_s_unit t_s_unit) throws Exception;
public List queryBy_t_s_unit(T_s_unit t_s_unit) throws Exception;
}
