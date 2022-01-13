package fr.eatlow.model.entite;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "GROUPE")
public class EGroupe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NOM")
	private String nom;

	@OneToMany(mappedBy = "groupe") //LIEN VERS SOUS GROUPE
	private Set<ESousGroupe> sousGroupe;

	// CONSTRUCTEUR
	public EGroupe(int id, String nom, Set<ESousGroupe> sousGroupe) {
		super();
		this.id = id;
		this.nom = nom;
		this.sousGroupe = sousGroupe;
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

	public Set<ESousGroupe> getSousGroupe() {
		return sousGroupe;
	}

	public void setSousGroupe(Set<ESousGroupe> sousGroupe) {
		this.sousGroupe = sousGroupe;
	}

	// TO STRING
	@Override
	public String toString() {
		return "EGroupe [id=" + id + ", nom=" + nom + ", sousGroupe=" + sousGroupe + "]";
	}

	// CONSTRUCTEUR VIDE
	public EGroupe() {
		// TODO Auto-generated constructor stub
		sousGroupe = new HashSet<ESousGroupe>();
	}

}
