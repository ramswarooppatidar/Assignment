package com.inhertance;
class IPLTeam{
	public void play() {
		System.out.println("total 8 team paricipates in this tournaments");
	}
}
class CSK extends IPLTeam{
	public void play() {
		super.play();
		System.out.println("mMAHI is available for today match");
	}
}
class RCB extends IPLTeam{
	public void play() {
		super.play();
		System.out.println("KOHLI is available for today match");
	}
}

public class IPLTournament {
	public static void main(String[]args) {
		IPLTeam ip = new RCB();
		ip.play();
		System.out.println("______________________________");
		ip=new CSK();
		ip.play();
		
	}

}
