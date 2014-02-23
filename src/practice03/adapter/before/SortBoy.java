package practice03.adapter.before;

import java.util.*;

public class SortBoy {
	private List<String> targetList;
	
	public SortBoy(List<String> targetList) {
		 this.targetList = targetList;
	}
	
	public List<String> sortCloneList(){
		List<String> cloneList = new ArrayList<>(this.targetList);

		Collections.copy(cloneList, this.targetList); // 복사본 생성
		Collections.sort(cloneList); // 정렬
		return cloneList;
	}
	
	public void setList(List<String> list){
		this.targetList = list;
	}
}
