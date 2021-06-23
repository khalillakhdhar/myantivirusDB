package com.example.demo.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rapport {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
long id;
String titre,texte;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getTexte() {
	return texte;
}
public void setTexte(String texte) {
	this.texte = texte;
}

}
