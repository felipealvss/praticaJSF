package bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import bd.BDSimulation;
import entidade.FoneDeOuvido;

@ManagedBean
public class FoneDeOuvidoBean {
	// Object instance
	private FoneDeOuvido fone = new FoneDeOuvido();
	private List<FoneDeOuvido> listaFone = new ArrayList<FoneDeOuvido>();
	
	// Implements
	public String salvar() {
		BDSimulation.insertDb(fone);
		fone = new FoneDeOuvido();
		return null;
	}
	
	public String listarDb() {
		listaFone = BDSimulation.getBd();
		return "listagem.xhtml";
	}
	
	// Getters and Setters
	public FoneDeOuvido getFone() {
		return fone;
	}

	public void setFone(FoneDeOuvido fone) {
		this.fone = fone;
	}

	public List<FoneDeOuvido> getListaFone() {
		return listaFone;
	}

	public void setListaFone(List<FoneDeOuvido> listaFone) {
		this.listaFone = listaFone;
	}
}