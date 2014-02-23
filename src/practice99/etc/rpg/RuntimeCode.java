package practice99.etc.rpg;

import java.util.Scanner;

public class RuntimeCode {

	public static void main(String[] args) throws InterruptedException {
		Sword excalibur = new Sword(12);
		Shield broonhild = new Shield(5);
		Knight knight = new Knight("질풍노드", excalibur, broonhild);
		Monster monster = new Monster();
		
		int wins = 0;

		introMessage();
		
		// 이하는 게임 시스템
		while (knight.getHP() > 0){
			Thread.sleep(1000);
			showStatus(knight);
			showMonsterStatus(monster);
			showMenuMessage();
			
			String input = getUserInput();

			if ( isAttackCommand(input) ){
				attackMonster(knight, monster);
				
				if ( monster.getHP() == 0 ){
					wins++;
					winMessage(wins);
					refillHp( knight );
					
					monster = createNewMonster();
					Thread.sleep(1000);
					continue;
				}
				
				knight.hitted( monster.attack() );
				System.out.println( "몬스터 공격!! 데미지를 받았습니다.");
				
			} else if ( isFleeCommand(input) ) {
				System.out.println( "전장을 탈출합니다.");
				break;
			}
		}
		gameEndMessage(wins);
	}

	private static void winMessage(int wins) {
		System.out.println("## YOU WIN! 적을 해치웠습니다. Wins : " + wins);
	}

	private static void introMessage() {
		System.out.println("=========================================");
		System.out.println( " 던전RPG : 반지의 자격"  );
		System.out.println("=========================================");
	}

	private static void gameEndMessage(int wins) {
		System.out.println("=======게임 종료 ========");
		System.out.println(" wins : " + wins);
		System.out.println("=======================");
	}

	private static boolean isFleeCommand(String input) {
		return input.toLowerCase().equals("b");
	}

	private static boolean isAttackCommand(String input) {
		return input.toLowerCase().equals("a");
	}

	private static String getUserInput() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		return input;
	}

	private static void showMenuMessage() {
		System.out.println( "\n\n>> 적을 공격(a), 도망(b) : ");
	}

	private static void showMonsterStatus(Monster monster) {
		System.out.println( monster );
	}

	private static void attackMonster(Knight knight, Monster monster) {
		monster.hitted( knight.attack() );
		System.out.println(knight.attack() + "의 데미지를 주었습니다.");
	}

	private static void refillHp(Knight knight ) {
		knight.setHP( knight.getHP() + (int)(knight.getHP() * 0.1) );
		System.out.println("\n\n 체력이 " + (int)(knight.getHP() * 0.1) +"만큼 보충됩니다.\n\n");
	}

	private static Monster createNewMonster() {
		Monster monster;
		System.out.println( "\n\n다음 적이 등장합니다!");
		monster = new Monster();
		System.out.println("## 새로운 적 등장!!! ");
		return monster;
	}

	private static void showStatus(Knight knight) {
		System.out.println(knight);
	}
}
