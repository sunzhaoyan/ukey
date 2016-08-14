package com.itrus.ukey2.controller.workOrderInfo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/workOrderInfo")
public class WorkOrderInfoController {
	
	
	@RequestMapping(produces="text/html")
	public String list(Model model) {
		System.out.println("...WorkOrderInfoController.list");
		model.addAttribute("test", "测试");
		return "workOrderInfo/list";
	}
}
