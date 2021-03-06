package com.petmet.web.shop.controller.admin.order;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petmet.web.shop.entity.Order;
import com.petmet.web.shop.service.OrderService;

@WebServlet("/admin/shop/order/index")
public class IndexController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request
							, HttpServletResponse response) throws ServletException, IOException {
		OrderService service = new OrderService();
		List<Order> list = service.getList();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
