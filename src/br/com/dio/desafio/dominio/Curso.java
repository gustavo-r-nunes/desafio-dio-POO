package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {	
	
	int cargaHoraria;


	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO * cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Mentoria [titulo=" + this.getTitulo() 
	        	+ ", descricao=" + this.getDescricao()
        		+ ", carga horaria=" + this.getCargaHoraria() + "]";
	}

	
	
	

}
