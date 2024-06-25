package one.digitalinnovation.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import one.digitalinnovation.gof.model.Hero;
import one.digitalinnovation.gof.service.HeroService;

//@RestController
@RequestMapping("heros")
public class HeroRestController {
	@Autowired
	private HeroService heroService;
	
	@GetMapping
	public ResponseEntity<Iterable<Hero>> buscarTodos() {
		return ResponseEntity.ok(heroService.buscarTodos());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Hero> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.ok(heroService.buscarPorId(id));
	}

	@PostMapping
	public ResponseEntity<Hero> inserir(@RequestBody Hero hero) {
		heroService.inserir(hero);
		return ResponseEntity.ok(hero);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Hero> atualizar(@PathVariable Long id, @RequestBody Hero hero) {
		heroService.atualizar(id, hero);
		return ResponseEntity.ok(hero);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		heroService.deletar(id);
		return ResponseEntity.ok().build();
	}

}
