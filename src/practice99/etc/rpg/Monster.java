package practice99.etc.rpg;

import java.util.Random;

public class Monster {

	private int power;
	private int HP = 0;
	
	public Monster() {
		Random random = new Random();
		this.power = random.nextInt(20);
		setHP(random.nextInt(100));
	}
	
	public void hitted(int damage){
		this.setHP(this.getHP() - damage);
		if ( this.getHP() < 0 ){
			this.setHP(0);
		} 
	}

	public int attack(){
		return this.power;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getHP() {
		return HP;
	}
	
	@Override
	public String toString() {
		return "=====몬스터======"
		+"\n체력 : " + getHP() 
		+"\n공격력 : " + this.power ;
	}
}
