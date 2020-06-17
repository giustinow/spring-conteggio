package it.dstech.controller;

import org.springframework.http.server.reactive.ContextPathCompositeHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.service.Conteggio;

@Controller
public class ControllerConsonanti {
	@RequestMapping(value = "/inserimento-consonanti", method = RequestMethod.POST)
	public ModelAndView inserimentoConsonanti(Model model) {
		return new ModelAndView("inserimento", "scelta", "contaConsonanti");
	}
	@RequestMapping(value = "/conta-consonanti", method = RequestMethod.POST)
	public ModelAndView contaConsonanti(@RequestParam("testo") String testo, Model model) {
		Conteggio conteggio = new Conteggio(testo);
		ModelAndView view = new ModelAndView("risultato");
		view.addObject("tipo", "consonanti");
		view.addObject("testo", testo);
		view.addObject("conteggio", conteggio.contaConsonanti());
		return view;
	}
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public ModelAndView tornaAllaHome(Model model) {
		return new ModelAndView("redirect:/index.jsp");
	}
}
