package edu.utvm.gencuesta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import edu.utvm.gencuesta.domain.Encuesta;
import edu.utvm.gencuesta.domain.Usuario;
import edu.utvm.gencuesta.service.EncuestaService;

@Controller
@RequestMapping("/encuesta")
@SessionAttributes({ "new-encuesta" })
public class EncuestaController {

	protected final Log log = LogFactory.getLog(getClass());

	@Autowired
	private EncuestaService serviceEncuesta;

	@RequestMapping(value = "/save-encuesta", method = RequestMethod.POST)
	public ModelAndView handleIndexRequest(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute("new-encuesta") @Valid Encuesta encuesta,
			BindingResult result) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("crear-encuesta");
		if (!result.hasErrors()) {
			model.setViewName("redirect:design");
		} else {
			model.addObject("result", result);
		}
		return model;
	}

	@RequestMapping(value = "/create-form")
	public ModelAndView handleIndexRequestLoginCrearEncuesta(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModelAndView model = new ModelAndView("crear-encuesta");
		model.addObject("new-encuesta", new Encuesta("", "", new Usuario(
				"Mario Rivera", "xasdq123", "mracapri")));
		return model;
	}

	@RequestMapping(value = "/design")
	public ModelAndView handleIndexRequestLoginEncuestaDiseniar(
			HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("new-encuesta") Encuesta encuesta)
			throws ServletException, IOException {
		ModelAndView model = new ModelAndView("encuesta-diseniar");
		model.addObject("encuesta", encuesta);
		return model;
	}
}