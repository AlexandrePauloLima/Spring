package com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-word")
public class HelloWordController {
	
	@GetMapping
	
	public String helloword() {
		return "Hello Word !!!";
	}
			
	@GetMapping ("/t47")
		
		public String turma47() {
			return "Hello turma 47 !!!" ;

	}
	
    @GetMapping ("/ods")
		
		public String ods17() {
			return    "01.Erradicaçao da pobreza"
					+ "02.Fome zero"
					+ "03.Saude e bem estar"
					+ "04.Educaçao de qualidade"
					+ "05.Igualdade de genero"
					+ "06.Agua pótavel e saneamento"
					+ "07.Energia limpa e acessível"
					+ "08.Trabalho descente e crescimento econômico"
					+ "09.Industria, inovaçao e infraestrutura"
					+ "10.Reduçao das desigualdades"
					+ "11.Cidades e comunidades sustenta´veis"
					+ "12.Consumo e produção  responsável"
					+ "13.Ação contra a mudança global do clima"
					+ "14.Vida na agua"
					+ "15.Vida terrestre"
					+ "16.Paz,justiça e intituiçoes eficazes"
					+ "17.Parcerias e meios de implementçao" ;
      }
    
      @GetMapping ("/aprender")
		
		public String aprender() {
			return "Essa semana foquei em desenvolver minha gestão de tempo e orientaçao aos detalhas ," ;
      }
}
