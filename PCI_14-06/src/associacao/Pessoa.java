package associacao;

import java.awt.List;
import java.sql.Date;
import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private Date dtNasc;
	private ArrayList<Dependente> dependentes=
	new ArrayList <Dependente> (0);
	
	public void setDependentes
	(List dependentes) {
	}
	
	public List getdependentes;{
	}
	public void addDependente (Dependente dependente) {
		this.dependentes.add(dependente);
	}
	
}
