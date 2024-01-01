package Exo1_project;

public class Client {
	private String nom ;
	private String prenom;
	private int age;
	public Client(String nom,String prenom,int age) {
	this.nom=nom;
	this.prenom=prenom;
		this.age=age;

	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
public String toString() {
	return "le nom est"+this.nom+"le prenom est:"+this.prenom+"l'age est:"+this.age;
}
public boolean equals(Client bnadem) {
	if (bnadem.nom==this.nom && bnadem.prenom==this.prenom && bnadem.age==this.age)
		return true;
	else return false ;
}


}
