package com.example.Kirjakauppa.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Kirjakauppa.domain.Kirja;
import com.example.Kirjakauppa.domain.KirjaRepository;


@Controller
public class KirjaController {
	@Autowired
	private KirjaRepository repository;
	ArrayList<Kirja> kirjat = new ArrayList<Kirja>();
	
	@RequestMapping(value="/kirjalista", method=RequestMethod.GET) //html sivun view näkymä joka tulostaa selaimeen
			public String kirjaLista(Model model) {
				
				Kirja kirja = new Kirja();
				kirjat.add(kirja);
				model.addAttribute("kirja", kirja);
				model.addAttribute("kirjat", kirjat);
				
				
				return "kirjalista";
	}
	@RequestMapping(value="/kirjalista", method=RequestMethod.POST)
			public String kirjaSubmit(@ModelAttribute Kirja kirja, Model model) {
				
				kirjat.add(kirja);
			
				model.addAttribute("kirjat", kirjat);
				return "kirjalista";
	
			}
}
