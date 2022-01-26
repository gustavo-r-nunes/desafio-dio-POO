package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descricao curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Javascript");
		curso2.setDescricao("descricao curso js");
		curso2.setCargaHoraria(8);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("mentoria de java");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao bootcamp java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Developer devGustavo = new Developer();
		devGustavo.setNome("Gustavo Nunes");
		devGustavo.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Gustavo: " + devGustavo.getConteudosInscritos());
		devGustavo.progredir();
		System.out.println("-");
		System.out.println("Conteudos inscritos Gustavo: " + devGustavo.getConteudosInscritos());
		System.out.println("Conteudos concluidos Gustavo: " + devGustavo.getConteudosConcluidos());
		System.out.println("XP: " + devGustavo.calcularXp());
		
		Developer devJoao = new Developer();
		devJoao.setNome("Joao Silva");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
		System.out.println("Conteudos concluidos Joao: " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularXp());
		
	}

}
