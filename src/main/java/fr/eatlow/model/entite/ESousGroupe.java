package fr.eatlow.model.entite;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "SOUS_GROUPE")
public class ESousGroupe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NOM")
	private String nom;

	@OneToMany(mappedBy = "sousGroupeIng") //LIEN AVEC INGREDIENT
	private Set<EIngredient> ingredients;

	@OneToMany(mappedBy = "sousGroupePlat") //LIEN AVEC PLAT
	private Set<EPlat> ssGrpPlat;

	@ManyToOne //LIEN AVEC GROUPE
	@JoinColumn(name = "ID_GRP")
	private EGroupe groupe;

	// CONSTRUCTEUR
	public ESousGroupe(int id, String nom, Set<EIngredient> ingredients, Set<EPlat> ssGrpPlat, EGroupe groupe) {
		super();
		this.id = id;
		this.nom = nom;
		this.ingredients = ingredients;
		this.ssGrpPlat = ssGrpPlat;
		this.groupe = groupe;
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

	public Set<EIngredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Set<EIngredient> ingredients) {
		this.ingredients = ingredients;
	}

	public Set<EPlat> getSsGrpPlat() {
		return ssGrpPlat;
	}

	public void setSsGrpPlat(Set<EPlat> ssGrpPlat) {
		this.ssGrpPlat = ssGrpPlat;
	}

	public EGroupe getGroupe() {
		return groupe;
	}

	public void setGroupe(EGroupe groupe) {
		this.groupe = groupe;
	}

	// TO STRING
	@Override
	public String toString() {
		return "ESousGroupe [id=" + id + ", nom=" + nom + ", ingredients=" + ingredients + ", ssGrpPlat=" + ssGrpPlat
				+ ", groupe=" + groupe + "]";
	}
	
	// CONSTRUCTEUR VIDE
	public ESousGroupe() {
		// TODO Auto-generated constructor stub
		ingredients = new HashSet<EIngredient>();
	}



}
