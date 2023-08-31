package com.cg.wrapperclass;

public class CommandLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]+" hii");// by default argument line input saperated by white spaces
		System.out.println(args[1]);
		int sum=0;
		for(int r=0;r<args.length;r++) {
			sum+=Integer.parseInt(args[r]);
		}
        System.out.println(sum);
	}

}
