package fr.eatlow.model.entite;

import javax.persistence.*;

@Entity
@Table(name = "PLAT")
public class EPlat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NOM")
	private String nom;

	@ManyToOne //LIEN AVEC SOUS GROUPE
	@JoinColumn(name = "SS_GRP_PLAT")
	private ESousGroupe sousGroupePlat;

	// CONSTRUCTEUR
	public EPlat(int id, String nom, ESousGroupe sousGroupePlat) {
		super();
		this.id = id;
		this.nom = nom;
		this.sousGroupePlat = sousGroupePlat;
	}

	// SETTERS / GETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ESousGroupe getSousGroupePlat() {
		return sousGroupePlat;
	}

	public void setSousGroupePlat(ESousGroupe sousGroupePlat) {
		this.sousGroupePlat = sousGroupePlat;
	}

	// TO STRING
	@Override
	public String toString() {
		return "EPlat [id=" + id + ", nom=" + nom + ", sousGroupePlat=" + sousGroupePlat + "]";
	}
	
	// CONSTRUCTEUR VIDE
	public EPlat() {
		// TODO Auto-generated constructor stub
	}



}
