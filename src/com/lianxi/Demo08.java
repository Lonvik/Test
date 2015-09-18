package com.lianxi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Demo08 {
	public static void main(String[] args) throws IOException {
		File fiReade = new File("c:\\a.txt");
		File fiWrite = new File("c:\\b.txt");
		IORW(fiReade, fiWrite);
	}

	public static void IORW(File fiReade, File fiWrite) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fiReade));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fiWrite));
		StringBuilder sb = new StringBuilder();

		String s = null;
		while ((s = br.readLine()) != null) {
			sb.append(s); // ��װ���ַ���.�Ƚ�����һ���Ը�������.
			bw.write(s);
		}
		ergodic(sb.toString()); // ����һ��ע��.Ӧ�������������֮��ſ��Խ��е�������������.
		br.close();
		bw.close();

	}

	public static void ergodic(String s) {
		Map<Character, Integer> ma = new HashMap<Character, Integer>();
		char[] ch = s.toCharArray();

		for (int x = 0; x < ch.length; x++) {
			int num = 1;
			if (!ma.containsKey(ch[x])) {
				ma.put(ch[x], 1);
			} else {
				num = ma.get(ch[x]); // ����һ��Ӧ��ע���,��ʱҪ��ס֮ǰ��valueֵ,�ٴ˻�����+1
				ma.put(ch[x], ++num);
			}
		}
		ergodicMap(ma);
	}

	// 3.��map���Ͻ��е���,
	public static void ergodicMap(Map<Character, Integer> ma) {
		Set se = new TreeSet();
		se = ma.entrySet();
		Iterator it = se.iterator();
		while (it.hasNext()) {
			Entry en = (Entry) it.next();
			System.out.println(en.getKey() + "  : " + en.getValue() + " ��");
		}
	}

}