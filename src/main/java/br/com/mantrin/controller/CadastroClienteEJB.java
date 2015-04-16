package br.com.mantrin.controller;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.mantrin.modell.Cliente;

@Stateless
public class CadastroClienteEJB {

	@PersistenceContext(unitName="projetoJbossPU")
	private EntityManager em;
	
	
	public void salvar(Cliente cliente) {
		em.persist(cliente);
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> buscarTodos() {
		return em.createQuery("from Cliente c").getResultList();
	}
	
}
