package practice03.adapter.before;

import java.util.*;

public class SortBoy {
	private List targetList;
	
	public SortBoy(List targetList) {
		 this.targetList = targetList;
	}
	
	public List sortCloneList(){
		List cloneList = this.targetList;

		Collections.copy(cloneList, this.targetList); // 복사본 생성
		Collections.sort(cloneList); // 정렬
		return cloneList;
	}
	
	public void setList(List list){
		this.targetList = list;
	}
}
