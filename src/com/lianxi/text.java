package com.lianxi;

public class text {
	public static void main(String[] args) 
	{
		for(int i=1;i<=9;i++)//����i��j��ֵ������forѭ�����棬����ÿ������ѭ������ִ�о��޷�ȡֵ
		{
			for(int j=1;j<=9;j++)
			{
				if(j<=i)
				System.out.print(j+"*"+i+"="+i*j+" ");//Сע��:print()����������봫�ݲ���,println()������!
			}
				System.out.println();
		}
	}
}


