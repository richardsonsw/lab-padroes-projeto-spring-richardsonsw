package one.digitalinnovation.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Armor;
import one.digitalinnovation.gof.model.ArmorRepository;
import one.digitalinnovation.gof.model.HairColor;
import one.digitalinnovation.gof.model.HairColorRepository;
import one.digitalinnovation.gof.model.HairType;
import one.digitalinnovation.gof.model.HairTypeRepository;
import one.digitalinnovation.gof.model.Hero;
import one.digitalinnovation.gof.model.HeroRepository;
import one.digitalinnovation.gof.model.Profession;
import one.digitalinnovation.gof.model.ProfessionRepository;
import one.digitalinnovation.gof.model.Weapon;
import one.digitalinnovation.gof.model.WeaponRepository;
import one.digitalinnovation.gof.service.HeroService;

@Service
public class HeroServiceImpl implements HeroService {
	@Autowired
	private HeroRepository heroRepository;
	@Autowired
	private ArmorRepository armorRepository;
	@Autowired
	private HairColorRepository hairColorRepository;
	@Autowired
	private HairTypeRepository hairTypeRepository;
	@Autowired
	private ProfessionRepository professionRepository;
	@Autowired
	private WeaponRepository weaponRepository;
	

	@Override
	public Iterable<Hero> buscarTodos() {
		// TODO Auto-generated method stub
		return heroRepository.findAll();
	}

	@Override
	public Hero buscarPorId(Long id) {
		// TODO Auto-generated method stub
		Optional<Hero> hero = heroRepository.findById(id);
		return hero.get();
	}

	@Override
	public void inserir(Hero hero){
		// TODO Auto-generated method stub
		salvarHero(hero);
		
	}

	@Override
	public void atualizar(Long id, Hero hero) {
		// TODO Auto-generated method stub
		Optional<Hero> heroDb = heroRepository.findById(id);
		if (heroDb.isPresent()) {
			salvarHero(hero);
		}
		
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		heroRepository.deleteById(id);
		
	}
	
	private void salvarHero(Hero hero) {
		heroRepository.save(hero);
	}
		/*if(hero.getArmor() != null) {
			Optional<Armor> armor = armorRepository.findById(hero.getArmor().getId());
			if(armor.isPresent()) {
				armorRepository.save(armor.get());
				hero.setArmor(armor.get());
			}else {
				setArmorDb(hero);
			}
		}else {
			setArmorDb(hero);
		}
		if(hero.getHairColor() != null) {
			Optional<HairColor> hairColor = hairColorRepository.findById(hero.getHairColor().getId());
			if(hairColor.isPresent()) {
				hairColorRepository.save(hairColor.get());
			}else {
				setHairColorDb(hero);
			}
		}else {
			setHairColorDb(hero);
		}
		if(hero.getHairType() != null) {
			Optional<HairType> hairType = hairTypeRepository.findById(hero.getHairType().getId());
			if(hairType.isPresent()) {
				hairTypeRepository.save(hairType.get());
			}else {
				setHairTypeDb(hero);
			}
		}else{
			setHairTypeDb(hero);
		}
		if(hero.getProfession() != null) {
			Optional<Profession> profession = professionRepository.findById(hero.getProfession().getId());
			if(profession.isPresent()) {
				professionRepository.save(profession.get());
			}else {
				setProfessionDb(hero);
			}
		}else{
			setProfessionDb(hero);
		}
		if(hero.getWeapon() != null) {
			Optional<Weapon> weapon = weaponRepository.findById(hero.getWeapon().getId());
			if(weapon.isPresent()) {
				weaponRepository.save(weapon.get());
			}else {
				setWeaponDb(hero);
			}
		}else{
			setWeaponDb(hero);
		}
		
		heroRepository.save(hero);
	}
	
	public void setArmorDb(Hero hero) {
		Armor armorDb = new Armor("BASIC");
		armorRepository.save(armorDb);
		hero.setArmor(armorDb);
	}
	
	public void setHairColorDb(Hero hero) {
		HairColor hairColorDb = new HairColor("RED");
		hairColorRepository.save(hairColorDb);
		hero.setHairColor(hairColorDb);
	}

	public void setHairTypeDb(Hero hero) {
		HairType hairTypeDb = new HairType("LONG");
		hairTypeRepository.save(hairTypeDb);
		hero.setHairType(hairTypeDb);
	}

	public void setProfessionDb(Hero hero) {
		Profession ProfessionDb = new Profession("DOCTOR");
		professionRepository.save(ProfessionDb);
		hero.setProfession(ProfessionDb);
	}

	public void setWeaponDb(Hero hero) {
		Weapon WeaponDb = new Weapon("SWORD");
		weaponRepository.save(WeaponDb);
		hero.setWeapon(WeaponDb);
	}*/

}
