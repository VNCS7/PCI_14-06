package associacao;

import java.sql.Date;

public class Dependente{
	
	private String nome;
	private Date dtnasc;
	private String grauParentesco;
	private Pessoa responsavel;
	
	public void setResponsavel(Pessoa resp){
	}
	
	public Pessoa getResponsavel(){
		return responsavel;
	}	
}
