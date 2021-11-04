package garcia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import garcia.beans.Passenger;
import garcia.repository.PassengerRepository;

/**
 * @author Fernando Garcia - fggarcia
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
@Controller
public class WebController {
	@Autowired
	PassengerRepository repo;
	
	@GetMapping("inputPassenger")
	public String addNewPassenger(Model model) {
		Passenger p = new Passenger();
		model.addAttribute("newPassenger", p);
		return "input";
	}
	
	@PostMapping("/inputPassenger") 
	public String addNewPassenger(@ModelAttribute Passenger p, Model model) {
		repo.save(p);
		return viewAllPassengers(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdatePassenger(@PathVariable("id") long id, Model model) {
		Passenger p = repo.findById(id).orElse(null);
		model.addAttribute("newPassenger", p);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String revisePassenger(Passenger p, Model model) {
		repo.save(p);
		return viewAllPassengers(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deletePassenger(@PathVariable("id") long id, Model model) {
		Passenger p = repo.findById(id).orElse(null);
		repo.delete(p);
		return viewAllPassengers(model);
	}
	
	@GetMapping({ "/", "viewAll" })
	public String viewAllPassengers(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewPassenger(model);
		}
		model.addAttribute("passenger", repo.findAll());
		return "results";
	}
	
	
}
