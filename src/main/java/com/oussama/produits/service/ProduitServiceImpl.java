package com.oussama.produits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
}
	
