package com.oussama.produits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.oussama.produits.entities.Categorie;
import com.oussama.produits.entities.Produit;
import com.oussama.produits.repos.ProduitRepository;

@Service
public class ProduitServiceImpl {
	@Autowired
	ProduitRepository produitRepository;
	
	

	public Produit saveProduit(Produit p) {
		return produitRepository.save(p);
	}
	
	public Produit updateProduit(Produit p) {
	return produitRepository.save(p);
	}
	public void deleteProduit(Produit p) {
	produitRepository.delete(p);
	}

	public void deleteProduitById(Long id) {
	produitRepository.deleteById(id);
	}

	public Produit getProduit(Long id) {
	return produitRepository.findById(id).get();
	}

	public List<Produit> getAllProduits() {
	return produitRepository.findAll();
	}	
	
	public List<Produit> findByNomProduit(String nom) {
	return produitRepository.findByNomProduit(nom);
	}
	public List<Produit> findByNomProduitContains(String nom) {
	return produitRepository.findByNomProduitContains(nom);
	}
	public List<Produit> findByNomPrix(String nom, Double prix) {
		return produitRepository.findByNomPrix(nom, prix);
	}
	public List<Produit> findByCategorie(Categorie categorie) {
	return produitRepository.findByCategorie(categorie);
	}
	public List<Produit> findByCategorieIdCat(Long id) {
	return produitRepository.findByCategorieIdCat(id);
	}
	public List<Produit> findByOrderByNomProduitAsc() {
	return produitRepository.findByOrderByNomProduitAsc();
	}
	public List<Produit> trierProduitsNomsPrix() {
	return produitRepository.trierProduitsNomsPrix();
	}
}

	
