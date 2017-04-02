package com.nisarg;

public class HelloSpring {

	private String s1;
	private SpellChecker sc1;

//	public HelloSpring(String s1) {
//		super();
//		this.s1 = s1;
//	}
	
	



//	public HelloSpring(String s1, SpellChecker sc1) {
//		super();
//		this.s1 = s1;
//		this.sc1 = sc1;
//	}


	public SpellChecker getSc1() {
		return sc1;
	}
	
	public void setSc1(SpellChecker sc1) {
		System.out.println("ppppp1pppppp");
		this.sc1 = sc1;
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}



	public String getSpellCheck() {
		// TODO Auto-generated method stub
		String str = sc1.mySpellCheck();
		
		return str;
	}
	
	
}
