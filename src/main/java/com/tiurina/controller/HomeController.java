package com.tiurina.controller;

/**
 * Created by Vero on 05.04.2017.
 */
import com.tiurina.dao.EmployeeDAO;
import com.tiurina.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index")
public class HomeController {
    ApplicationContext context =
            new ClassPathXmlApplicationContext("configModul.xml");

    @RequestMapping(method = RequestMethod.GET)public String viewHome(ModelMap model) {
        model.addAttribute("message", "Hello World!!!!!!!!!!!!!!!");
        EmployeeDAO employeesDAO = (EmployeeDAO) context.getBean("employeesDAO");
        Employee employee = employeesDAO.findByEmpId(186);
        model.addAttribute("EmpId", employee.getEmpId());
        model.addAttribute("FirstName", employee.getFirstName());
        model.addAttribute("LastName", employee.getLastName());
        model.addAttribute("Salary", employee.getSalary());
        return "index";
    }
}






