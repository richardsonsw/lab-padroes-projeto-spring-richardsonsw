package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Hero;

public interface HeroService {
	Iterable<Hero> buscarTodos();
	
	Hero buscarPorId(Long id);
	
	void inserir(Hero hero);
	
	void atualizar(Long id, Hero hero);
	
	void deletar(Long id);
}
