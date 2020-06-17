package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.service.Conteggio;

@Controller
public class ControllerParole {
	@RequestMapping(value = "/inserimento-parole", method = RequestMethod.POST)
	public ModelAndView inserimentoParole(Model model) {
		return new ModelAndView("inserimento", "scelta", "contaParole");
	}
	@RequestMapping(value = "/conta-parole", method = RequestMethod.POST)
	public ModelAndView contaParole(@RequestParam("testo") String testo, Model model) {
		Conteggio conteggio = new Conteggio(testo);
		ModelAndView view = new ModelAndView("risultato");
		view.addObject("tipo", "parole");
		view.addObject("testo", testo);
		view.addObject("conteggio", conteggio.contaParole());
		return view;
	}
	
}
