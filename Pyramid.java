package com.del;

public class Pyramid {

	public static void main(String[] args) {
		int last=15;
		int rows=6+(last-3)*2;
		int start=rows/2;
		int end=rows/2;
		for(int i=0;i<3;i++)
		{
			if(i==1)
			{
				end++;
			}
			else if(i==2)
			{
				start--;
			}
			
			//System.out.println(start+"-"+end);
			for(int j=0;j<=rows;j++)
			{				
				if(j>=start && j<=end)
				{
					if(i==1 && j==start)
						System.out.print("*");
					else System.out.print(" *");
				}
				
				else System.out.print("  ");
			}
			System.out.println();
		}
		//rows=rows+2;
//		System.out.println(start+"-"+end);
		for(int i=3;i<last;i++)
		{
//			if(i%2!=0)
//			{
//			start--;
//			end++;
//			}
//			else
//			{
//				end++;
//			}
			start--;
			end++;
			for(int j=0;j<=rows;j++)
			{
				if(j>=start && j<=end)
				System.out.print(" *");
				else System.out.print("  ");
			}
			System.out.println();
		}

	}

}
