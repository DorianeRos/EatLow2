package fr.eatlow.model.entite;


import javax.persistence.*;

@Entity
@Table(name = "INGREDIENT")

public class EIngredient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NOM")
	private String nom;

	@Column(name = "DQR")
	private float dqr;

	@ManyToOne //LIEN AVEC SOUS GROUPE
	@JoinColumn(name = "ID_SOUS_GRP_ING")
	private ESousGroupe sousGroupeIng;

	// CONSTRUCTEUR
	public EIngredient(int id, String nom, float dqr, ESousGroupe sousGroupeIng) {
		super();
		this.id = id;
		this.nom = nom;
		this.dqr = dqr;
		this.sousGroupeIng = sousGroupeIng;
	}

	// GETTERS / SETTERS
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

	public float getDqr() {
		return dqr;
	}

	public void setDqr(float dqr) {
		this.dqr = dqr;
	}

	public ESousGroupe getSousGroupeIng() {
		return sousGroupeIng;
	}

	public void setSousGroupeIng(ESousGroupe sousGroupeIng) {
		this.sousGroupeIng = sousGroupeIng;
	}

	// TO STRING
	@Override
	public String toString() {
		return "EIngredient [id=" + id + ", nom=" + nom + ", dqr=" + dqr + ", sousGroupeIng=" + sousGroupeIng + "]";
	}

	// CONSTRUCTEUR VIDE
	public EIngredient() {
		// TODO Auto-generated constructor stub
	}
}
