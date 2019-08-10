package com.codingdojo.displaydate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@RequestMapping("/")
	// import the Spring "Model" object that allows you to save information to be available in the view (lives per request)
	public String index(Model model) {
		// declare variable to hold the current Date/Time data (pass through Model object)
		Date currentTime = new Date();
		// save information to the model object (variableName, variableData)
		model.addAttribute("currentTime", currentTime);
		return "index.jsp";
	}
	
	
	@RequestMapping("/date")
	// import the Spring "Model" object that allows you to save information to be available in the view (lives per request)
	public String date(Model model) {
		// declare variable to hold the current Date/Time data (pass through Model object)
		Date dateValue = new Date();
		// date/time parsing date->text or text->date
		DateFormat formatValue = new SimpleDateFormat("EEEEE, 'the' dd 'of' MMMMM, yyyy");
		// save information to the model object (variableName, variableData)
		model.addAttribute("dateValue", formatValue.format(dateValue));
		return "date.jsp";
	}
	
	
	@RequestMapping("/time")
	// import the Spring "Model" object that allows you to save information to be available in the view (lives per request)
	public String time(Model model) {
		// declare variable to hold the current Date/Time data (pass through Model object)
		Date timeValue = new Date();
		// date/time parsing date->text or text->date
		DateFormat formatValue = new SimpleDateFormat("hh:mm a");
		// save information to the model object (variableName, variableData)
		model.addAttribute("timeValue", formatValue.format(timeValue));
		return "time.jsp";
	}
	
}
