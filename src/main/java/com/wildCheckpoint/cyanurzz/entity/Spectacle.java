package com.wildCheckpoint.cyanurzz.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
	private Date dateShow;
	private int legalAge;
	private double tarif;
	private String picture;
	private int priority;
	@Column(columnDefinition = "TEXT")
	private String description;
	@OneToMany(mappedBy = "spectacle", cascade = CascadeType.ALL)
	private List<Groupe> groupes;
	
	@OneToMany(mappedBy = "spectacle", cascade = CascadeType.ALL)
	private List<Article> articles;

	public Spectacle() {
		
	}	

	public Spectacle(Integer id, String title, Date dateShow, int legalAge, double tarif, String picture,int priority, String description) {
		super();
		this.id = id;
		this.title = title;
		this.dateShow = dateShow;
		this.legalAge = legalAge;
		this.tarif = tarif;
		this.picture = picture;
		this.priority = priority;
		this.description =description; 
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

	public Date getDateShow() {
		return dateShow;
	}

	public void setDateShow(Date dateShow) {
		this.dateShow = dateShow;
	}

	public List<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
