package io.github.joaomlneto.travis_ci_tutorial_java;

public class SimpleCalculator {
	private int res=0;
	
	public void add(int x, int y) {
		res=x+y;
	}
	public void sub(int x, int y) {
		res=x-y;
	}
	public void inc(int d) {
		res+=d;
	}
	public int div(int d) {
		res+=d;
	}
	public int getResult(){
		return res
	}
}
