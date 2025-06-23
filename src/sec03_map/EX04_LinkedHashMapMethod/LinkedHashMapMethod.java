package sec03_map.EX04_LinkedHashMapMethod;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethod {
	public static void main(String[] args) {
		Map<Integer, String> lhMap = new LinkedHashMap<Integer, String>();

		lhMap.put(2, "나다라");
		lhMap.put(1, "가나다");
		lhMap.put(3, "다라마");
		System.out.println(lhMap.toString());

		Map<Integer, String> hTable2 = new LinkedHashMap<Integer, String>();
		hTable2.putAll(lhMap);
		System.out.println(hTable2.toString());

		hTable2.replace(1, "가가가");
		hTable2.replace(4, "라라라");
		System.out.println(hTable2.toString());

		hTable2.replace(1, "가가가", "나나나");
		hTable2.replace(2, "다다다", "라라라");
		System.out.println(hTable2.toString());

		System.out.println(hTable2.get(1));
		System.out.println(hTable2.get(2));
		System.out.println(hTable2.get(3));

		System.out.println(hTable2.containsKey(1));
		System.out.println(hTable2.containsKey(5));

		System.out.println(hTable2.containsValue("나나나"));
		System.out.println(hTable2.containsValue("다다다"));

		Set<Integer> keySet = hTable2.keySet();
		System.out.println(keySet.toString());

		Set<Map.Entry<Integer, String>> entrySet = hTable2.entrySet();
		System.out.println(entrySet.toString());

		System.out.println(hTable2.size());

		hTable2.remove(1);
		hTable2.remove(4);
		System.out.println(hTable2.toString());

		hTable2.remove(2, "나다라");
		hTable2.remove(3, "다다다");
		System.out.println(hTable2.toString());

		hTable2.clear();
		System.out.println(hTable2.toString());
	}

}
