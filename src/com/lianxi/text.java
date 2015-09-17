package com.lianxi;

public class text {
	public static void main(String[] args) 
	{
		for(int i=1;i<=9;i++)//定义i与j的值必须在for循环里面，否则每次跳出循环重新执行就无法取值
		{
			for(int j=1;j<=9;j++)
			{
				if(j<=i)
				System.out.print(j+"*"+i+"="+i*j+" ");//小注意:print()括号里面必须传递参数,println()无限制!
			}
				System.out.println();
		}
	}
}


