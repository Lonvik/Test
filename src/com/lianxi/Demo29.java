package com.lianxi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo29 {
	public static void main(String[] args) {
		List<Integer> li = MyScanner();
		int[] in = ListSort(li);
		List<Integer> MyList = ListArray(in);
		System.out.println(MyList); // 打印集合.
	}

	public static List<Integer> ListArray(int[] in) { // 对数组元素进行排序,并放入集合.返回集合.
		int num;
		List<Integer> lis = new ArrayList<Integer>();
		for (int x = 0; x < in.length; x++) // 对数组进行排序.
		{
			for (int y = 0; y < in.length - x - 1; y++) {
				if (in[y] > in[y + 1]) {
					num = in[y];
					in[y] = in[y + 1];
					in[y + 1] = num;
				}
			}
		}
		for (int z = 0; z < in.length; z++) // 遍历数组.并将元素装入集合.
		{
			lis.add(in[z]);
		}
		return lis;
	}

	public static int[] ListSort(List<Integer> li) { // 接受一个集合,将集合变成数组.
		int[] i = new int[li.size()];

		for (int x = 0; x < li.size(); x++) {
			i[x] = li.get(x);
		}
		return i;
	}

	public static List<Integer> MyScanner() { // 接受随机的5个整数,放入到集合中.
		List<Integer> li = new ArrayList<Integer>();
		Random rd = new Random();

		while (li.size() <= 4) {
			int i = rd.nextInt(10) + 1;
			li.add(i);
		}
		return li;
	}
}
