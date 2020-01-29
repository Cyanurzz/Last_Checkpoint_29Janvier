package com.wildCheckpoint.cyanurzz.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Spectacle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String dateShow;
	private int legalAge;
	private double tarif;

	@OneToMany(mappedBy = "spectacle", cascade = CascadeType.ALL)
	private List<Groupe> groupes;
	
	@OneToMany(mappedBy = "spectacle", cascade = CascadeType.ALL)
	private List<Article> articles;

	public Spectacle() {
		
	}	

	public Spectacle(Integer id, String title, String dateShow, int legalAge, double tarif) {
		super();
		this.id = id;
		this.title = title;
		this.dateShow = dateShow;
		this.legalAge = legalAge;
		this.tarif = tarif;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLegalAge() {
		return legalAge;
	}

	public void setLegalAge(int legalAge) {
		this.legalAge = legalAge;
	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public String getDateShow() {
		return dateShow;
	}

	public void setDateShow(String dateShow) {
		this.dateShow = dateShow;
	}

	public List<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}
	
	
}
