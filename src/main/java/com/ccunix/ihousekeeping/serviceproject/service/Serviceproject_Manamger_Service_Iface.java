package com.ccunix.ihousekeeping.serviceproject.service;

import java.util.List;

import com.ccunix.ihousekeeping.basedb.domain.T_u_service_project;
import com.ccunix.ihousekeeping.serviceproject.domain.ServiceItem_bean;

public interface Serviceproject_Manamger_Service_Iface {

	public void delete_batch_service_project(T_u_service_project t_u_service_project)throws Exception;
 
	public List queryAll_service_project(ServiceItem_bean serviceItem_bean)throws Exception;
 
}
