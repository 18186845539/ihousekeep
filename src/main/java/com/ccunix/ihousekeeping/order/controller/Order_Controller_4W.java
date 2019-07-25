package com.ccunix.ihousekeeping.order.controller;
 
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_u_order;
import com.ccunix.ihousekeeping.basedb.domain.T_u_order_detail;
import com.ccunix.ihousekeeping.basedb.domain.T_u_rider;
import com.ccunix.ihousekeeping.basedb.service.T_u_order_Service_Iface;
import com.ccunix.ihousekeeping.basedb.service.T_u_order_detail_Service_Iface;
import com.ccunix.ihousekeeping.order.domain.Order;
import com.ccunix.ihousekeeping.order.service.Order_Service_Iface;

@Controller
@RequestMapping("Order_Controller_4W")
public class Order_Controller_4W extends BaseMultiController {

	@Resource
	T_u_order_Service_Iface t_u_order_Service_Iface;
	
	@Resource
	T_u_order_detail_Service_Iface t_u_order_detail_Service_Iface;
	
	@Resource
	Order_Service_Iface order_Service_Iface;

	@Resource
	PageServiceIface pageServiceIface;

	/**
	 *  查询订单管理表数据
	 * @author 黄爽
	 * @return
	 */
	@RequestMapping("query_all_t_u_order")
	@ResponseBody
	public List query_all_t_u_order(Order order) {

		List ls = null;
		try {
			ls = order_Service_Iface.queryAll_order(order);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	/**
	 *  订单派单功能
	 * @author 黄爽
	 */
	@RequestMapping("is_order_status")
	@ResponseBody
	public void is_order_status(T_u_order t_u_order) {
		System.out.println(t_u_order.getId()+"id");
		System.out.println(t_u_order.getOrder_status()+"status");
		try {
			T_u_order_detail t_u_order_detail = new T_u_order_detail();
			t_u_order_detail.setId(t_u_order.getId());
		//	t_u_order_detail.setOrder_id(t_u_order.getOrder_no());
			T_u_order_detail order_detail =	(T_u_order_detail)((t_u_order_detail_Service_Iface.queryAll_t_u_order_detail(t_u_order_detail)).get(0));
			order_detail.setOrder_status(t_u_order.getOrder_status());
			order_detail.setCancel_role(t_u_order.getCancel_role());
			order_detail.setCancel_time(new Date());
			t_u_order.setCancel_time(new Date());
			t_u_order_detail_Service_Iface.update_t_u_order_detail(order_detail);
			t_u_order_Service_Iface.update_t_u_order(t_u_order);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
