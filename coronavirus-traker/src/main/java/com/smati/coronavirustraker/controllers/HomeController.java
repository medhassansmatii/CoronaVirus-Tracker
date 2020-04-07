package com.smati.coronavirustraker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.smati.coronavirustraker.models.LocationStats;
import com.smati.coronavirustraker.services.CoronaVirusDataService;

@Controller
public class HomeController {
	
	@Autowired
	CoronaVirusDataService coronaVirusDataServ;

	@GetMapping("/")
	public String home(Model model) {
		List<LocationStats> allStats = coronaVirusDataServ.getAllStats();
		int totalCasesReported= allStats.stream().mapToInt(stat -> stat.getLatesTotalCases()).sum();
		int totalNewCases= allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();

		model.addAttribute("locationStats", allStats);
		model.addAttribute("totalCasesReported", totalCasesReported);
		model.addAttribute("totalNewCases", totalNewCases);


		
		return "home";
	}
}
