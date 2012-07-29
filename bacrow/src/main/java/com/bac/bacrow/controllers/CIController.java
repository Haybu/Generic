package com.bac.bacrow.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.Valid;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.bac.bacrow.domain.CI;
import com.bac.bacrow.services.intf.CIServicesInterface;
import com.bac.bacrow.validator.CIValidator;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/ci")
public class CIController {
	
	private static final Logger logger = LoggerFactory.getLogger(CIController.class);
	
	@Autowired
	CIServicesInterface ciservice;
	
	@InitBinder
    protected void initBinder(WebDataBinder binder) {
    	// Configure Custom "AccountValidator" to the "WebDataBinder"
        binder.setValidator(new CIValidator());
    }
	
	// Handle initial form display
		@RequestMapping(method = RequestMethod.GET)
		public String getSearchForm(ModelMap model){
			
			CI ci = new CI();
			
			// Save the command object as "student" so that
			// the "StudentForm" view access it.
			model.addAttribute("ciCommand", ci);
			
			// Return form view
			return "ci/ciSearchForm";
		}
		
		// Handle form submission. 
		@RequestMapping(method = RequestMethod.POST)
		public String processSubmit(
				@ModelAttribute("ciCommand") @Valid CI ci,
				BindingResult result, SessionStatus status) {
			
			if (result.hasErrors()) {
				// If validation failed, display the form page again
				return "ci/ciSearchForm";
			} else {
				CI obj = ciservice.searchCI(ci.getCinum());
				ci.setLabel(obj.getLabel());
				ci.setLocation(obj.getLocation());
				ci.setType(obj.getType());
				status.setComplete();
				// If validation succeeded, return "StudentSuccess" 
				return "ci/ciSearchResult";
			}
		}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! the client locale is "+ locale.toString());
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
