package com.cg.wrapperclass;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=34,num2=45;
		Integer inum=new Integer(num);// auto boxing
		Integer inum2=num2;//auto boxing
		Integer inum3=Integer.valueOf(num);
		System.out.println(num+" "+num2+" "+inum+" "+inum2+" "+inum3);
		Integer inumber =new Integer(56);
		int nums=inumber;//unboxing
		int number=inumber.intValue();
		System.out.println(inumber+" "+nums+" "+nums+" "+number);
		String s="100";
		Integer ivalue1=23;
		System.out.println(s+ivalue1);
		int nums2=Integer.parseInt(s);
		System.out.println(nums2);

	}

}
