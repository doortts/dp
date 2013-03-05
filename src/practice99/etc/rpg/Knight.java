package practice99.etc.rpg;

public class Knight {

	private Shield shield;
	private Sword sword;
	private int HP;
	private String nickName;
	
	public Knight(String nickName, Sword sword, Shield shield) {
		setNickName(nickName);
		setSword(sword);
		setShield(shield);
		setHP(100);
	}
	
	public void hitted(int damage){
		int actualDamage = damage - this.shield.getShieldGrade();
		if ( actualDamage < 0 ){
			actualDamage = 0;
		} 
		
		this.HP = this.HP - actualDamage;
	}

	public int attack(){
		return this.sword.getDamage();
	}
	
	public Shield getShield() {
		return shield;
	}
	
	public void setShield(Shield shield) {
		this.shield = shield;
	}
	public Sword getSword() {
		return sword;
	}
	
	public void setSword(Sword sword) {
		this.sword = sword;
	}
	
	public int getHP() {
		return HP;
	}
	
	public void setHP(int hP) {
		HP = hP;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNickName() {
		return nickName;
	}
	
	@Override
	public String toString() {
		return "========내 상태 =========" 
		+ "\n공격력 : " + getSword().getDamage() 
		+ "\n방어력 : " + getShield().getShieldGrade()
		+ "\n나의 체력 : " + this.getHP();
	}
}
