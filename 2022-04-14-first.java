package day26;

public class Shape2 {

	public static void main(String[] args) {
		
		Pokemon pokemon = new Pikachu();
		System.out.println("This pokemon : " + pokemon.getName());
		pokemon.attack();
		pokemon.sound();
		
		pokemon=new Squirtle();
		System.out.println("This pokemon : " + pokemon.getName());
		pokemon.attack();
		pokemon.sound();
		
	
	
	   }
	}

abstract class Pokemon {
	String name;
	abstract void attack();
	abstract void sound();
	public String getName() {
		return this.name;
	}
}

class Pikachu extends Pokemon{
	Pikachu(){
		this.name="피카츄";
	}

	@Override
	void attack() {
		System.out.println("전기공격");
	}

	@Override
	void sound() {
		System.out.println("피까피까");
	}
	
}

class Squirtle extends Pokemon{
	Squirtle(){
		this.name="꼬부기";
		}

	@Override
	void attack() {
		// TODO Auto-generated method stub
		System.out.println("water attack");
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("GO BOOK Go book");
		
	}
}
