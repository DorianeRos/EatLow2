package fr.eatlow.model.entite;

import javax.persistence.*;

@Entity
@Table(name = "COUP_ENERGETIQUE")
public class ECoupEnergetique {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "AGRICULTURE")
	private float agriculture;

	@Column(name = "TRANSFORMATION")
	private float transformation;

	@Column(name = "EMBALLAGE")
	private float emballage;

	@Column(name = "TRANSPORT")
	private float transport;

	@Column(name = "SUPERMARCHE")
	private float supermarche;

	@Column(name = "CONSOMMATION")
	private float consomation;

	// CONSTRUCTEUR
	public ECoupEnergetique(int id, float agriculture, float transformation, float emballage, float transport,
			float supermarche, float consomation) {
		super();
		this.id = id;
		this.agriculture = agriculture;
		this.transformation = transformation;
		this.emballage = emballage;
		this.transport = transport;
		this.supermarche = supermarche;
		this.consomation = consomation;
	}

	
	// GETTERS / SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getAgriculture() {
		return agriculture;
	}

	public void setAgriculture(float agriculture) {
		this.agriculture = agriculture;
	}

	public float getTransformation() {
		return transformation;
	}

	public void setTransformation(float transformation) {
		this.transformation = transformation;
	}

	public float getEmballage() {
		return emballage;
	}

	public void setEmballage(float emballage) {
		this.emballage = emballage;
	}

	public float getTransport() {
		return transport;
	}

	public void setTransport(float transport) {
		this.transport = transport;
	}

	public float getSupermarche() {
		return supermarche;
	}

	public void setSupermarche(float supermarche) {
		this.supermarche = supermarche;
	}

	public float getConsomation() {
		return consomation;
	}

	public void setConsomation(float consomation) {
		this.consomation = consomation;
	}

	// TO STRING
	@Override
	public String toString() {
		return "ECoupEnergie [id=" + id + ", agriculture=" + agriculture + ", transformation=" + transformation
				+ ", emballage=" + emballage + ", transport=" + transport + ", supermarche=" + supermarche
				+ ", consomation=" + consomation + "]";
	}

	// CONSTRUCTEUR VIDE
	public ECoupEnergetique() {
		// TODO Auto-generated constructor stub
	}

}
