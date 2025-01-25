package com.action;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Orders;
import com.service.OrdersService;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/ajax", produces = "text/plain;charset=utf-8")
public class AjaxAction extends BaseAction {
	@Autowired
	@Resource
	private OrdersService ordersService;

	@RequestMapping("pay.action")
	@ResponseBody
	public String pay(String id) {
		Orders orders = this.ordersService.getOrdersById(id);
		orders.setStatus("已付款");
		this.ordersService.updateOrders(orders);
		return null;
	}
}
