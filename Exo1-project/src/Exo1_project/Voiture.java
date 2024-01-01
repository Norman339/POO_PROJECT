package Exo1_project;

public class Voiture {
 private String marque ;
 private int matricule;
 private int annFabr ;
	public Voiture( String marque,int matricule,int annFabr) {
	 this.marque=marque;
	this.matricule=matricule;
	 this.annFabr=annFabr;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public int getAnnFabr() {
		return annFabr;
	}
	public void setAnnFabr(int annFabr) {
		this.annFabr = annFabr;
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

 
}
