package com.inhertance;
class Team{
	String tName;
	String board;
	int costOfTeam;
	Players p,p1,p2;
	public Team() {};
	public  Team(String s,String s2,int a,Players p,Players p1,Players p2) {
		tName = s;
		board = s2;
		costOfTeam = a;
		this.p = p;
		this.p1 = p1;
		this.p2 = p2;
	}
	
	//getter/setter
	public void setTName(String s) {
		tName = s;
	}
	public void setBoard(String s) {
		board = s;
	}
	public void setCostOfTeam(int a) {
		costOfTeam = a;
	}
	public void setPlayers(Players p,Players  p1,Players  p2) {
		this.p = p;
		this.p1 = p1;
		this.p2 = p2;
	}
	
	
	public String toString() {
		return "Name of team is "+tName+"\nteam belongs to which board "+board+"\ntotal cost of team is "
				+costOfTeam+"crore"+"\n\n"+p+p1+p2;
	}
	
}
class Players{
	int jerseyNo;
	int  noOfMatchPlay;
	String plyName;
	float age;
	public Players() {};
	public  Players(int a,String s,float f,int m) {
		jerseyNo = a;
		plyName = s;
		age = f;
		noOfMatchPlay = m;
	}
	public void setJoursyNo(int a) {
		jerseyNo = a;
	}
	public void setPlyName(String s) {
		plyName = s;
	}
	public void setAge(float f) {
		age = f;
	}
	public void setNoOfMatchPlay(int a) {
		noOfMatchPlay = a;
	}
	
	public String toString() {
		
		return "\nplayer name is "+plyName+"\njersey number of player is "+jerseyNo+
				"\nage of player is "+age+"\nnumber of match played "+noOfMatchPlay+"\n\n";
	}
	
	
}
public class CricketTeam {
	public static void main(String[]args) {
		//1 USING CONSTRUCTOR
		Players p = new Players(10,"SACHIN TENDULKAR",47.5f,400);
		Players p1 = new Players(19,"VIRAT KOHLI",33.5f,200);
		Players p2 = new Players(7,"MAHENDRA SING DHONI",41.0f,400);
		System.out.println("USING CONSTRUCTOR METHOD_____________________");
		Team t1 = new Team("MUMBAI-INDIAN","ICB",220,p,p1,p2);
		System.out.println(t1);
//_____________________________________________________________________________________________	
		//2 SET VALUE USING  SETTER METHOD
		Team t = new Team();
		t.setBoard("ICB");
		t.setCostOfTeam(220);
		t.setTName("PUNE WARRI0R");
		
		Players pl = new Players();
		pl.setJoursyNo(45) ;
		pl.setAge(34.5f); 
		pl.setPlyName("VEERENDRA SHEWAG");
		pl.setNoOfMatchPlay(400);
		
		Players pl1 = new Players();
		pl1.setJoursyNo(55) ;
		pl1.setAge(44.5f); 
		pl1.setPlyName("GAUTAM GAMBHIR");
		pl1.setNoOfMatchPlay(200);
		
		Players pl2 = new Players();
		pl2.setJoursyNo(100) ;
		pl2.setAge(50.5f); 
		pl2.setPlyName("RAHUL DRAVID");
		pl2.setNoOfMatchPlay(400);
		
		
		
		t.setPlayers(pl,pl1,pl2);
		System.out.println("USING GATTER/SETTER METHOD___________________");
        System.out.println(t);

		//System.out.println(p);
		
	}

}
