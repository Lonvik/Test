package com.lianxi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo29 {
	public static void main(String[] args) {
		List<Integer> li = MyScanner();
		int[] in = ListSort(li);
		List<Integer> MyList = ListArray(in);
		System.out.println(MyList); // ��ӡ����.
	}

	public static List<Integer> ListArray(int[] in) { // ������Ԫ�ؽ�������,�����뼯��.���ؼ���.
		int num;
		List<Integer> lis = new ArrayList<Integer>();
		for (int x = 0; x < in.length; x++) // �������������.
		{
			for (int y = 0; y < in.length - x - 1; y++) {
				if (in[y] > in[y + 1]) {
					num = in[y];
					in[y] = in[y + 1];
					in[y + 1] = num;
				}
			}
		}
		for (int z = 0; z < in.length; z++) // ��������.����Ԫ��װ�뼯��.
		{
			lis.add(in[z]);
		}
		return lis;
	}

	public static int[] ListSort(List<Integer> li) { // ����һ������,�����ϱ������.
		int[] i = new int[li.size()];

		for (int x = 0; x < li.size(); x++) {
			i[x] = li.get(x);
		}
		return i;
	}

	public static List<Integer> MyScanner() { // ���������5������,���뵽������.
		List<Integer> li = new ArrayList<Integer>();
		Random rd = new Random();

		while (li.size() <= 4) {
			int i = rd.nextInt(10) + 1;
			li.add(i);
		}
		return li;
	}
}
