package sec01.test09;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			int score = map.get(key);
			totalScore += score;
			if(maxScore < score) {
				maxScore = score;
				name = key;
			} else {}			
		}
		
		System.out.println("�������: " + (totalScore/map.size()));
		System.out.println("�ְ�����: " + maxScore);
		System.out.println("�ְ������� ���� ���̵�: " + name);
		
		
	
	}

}
