package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.service.Conteggio;

@Controller
public class ControllerVocali {
	@RequestMapping(value = "/inserimento-vocali", method = RequestMethod.POST)
	public ModelAndView inserimentoVocali(Model model) {
		return new ModelAndView("inserimento", "scelta", "contaVocali");
	}
	@RequestMapping(value = "/conta-vocali", method = RequestMethod.POST)
	public ModelAndView contaVocali(@RequestParam("testo") String testo, Model model) {
		Conteggio conteggio = new Conteggio(testo);
		ModelAndView view = new ModelAndView("risultato");
		view.addObject("tipo", "vocali");
		view.addObject("testo", testo);
		view.addObject("conteggio", conteggio.contaVocali());
		return view;
	}
}
