package com.ccunix.ihousekeeping.basedb.dao;
import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon_manager;
@DataSourceType(DataSourceType.main)
public interface T_u_coupon_manager_Dao_Iface {
public void insert_t_u_coupon_manager(T_u_coupon_manager t_u_coupon_manager) throws Exception;
public void update_t_u_coupon_manager(T_u_coupon_manager t_u_coupon_manager) throws Exception;
public void delete_t_u_coupon_manager(T_u_coupon_manager t_u_coupon_manager) throws Exception;
public List queryAll_t_u_coupon_manager(T_u_coupon_manager t_u_coupon_manager) throws Exception;
public List queryBy_t_u_coupon_manager(T_u_coupon_manager t_u_coupon_manager) throws Exception;
}
