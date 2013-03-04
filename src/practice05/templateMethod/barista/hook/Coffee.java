package practice05.templateMethod.barista.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeinBeverage {
	
	@Override
	protected void brew() {
		System.out.println("필터로 커피를 우려내고 있음");
	}

	@Override
	protected void addCondiments() {
		System.out.println("설탕과 우유 추가하고 있음");
	}
	
	@Override
	protected boolean customerWantsCondiments() {
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;
		System.out.println("커피에 우유와 설탕을 넣어 드릴까요? (y/n)");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			System.err.println("IO 오류");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}
	
	
}
