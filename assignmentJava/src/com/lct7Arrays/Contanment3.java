package com.lct7Arrays;
import java.util.Scanner;
class Institude{
	int id;
	String name;
	Branch br;
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String s) {
		name=s;
	}
	public void setBranch(Branch b) {
		br=b;
	}
	Institude(int id,String s, Branch br){
		this.id = id;
		name=s;
		this.br=br;
		
	}
	public String toString() {
		return "\nInstitude code is "+id+"\nInstitude name "+name+br;
	}
}
class Branch{
	int id;
	String name;
	Subject sb,sb1,sb2;
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String s) {
		name=s;
	}
	public void setSubject(Subject s,Subject s1,Subject s2) {
		sb=s;
		sb1=s1;
		sb2=s2;
	}
	Branch(int id,String s,Subject sub , Subject sub1,Subject sub2){
		this.id = id;
		name=s;
		this.sb=sub;
		this.sb1=sub1;
		this.sb2=sub2;
	}
	public String toString() {
		return "\nbranch code is "+id+"\nbranch name "+name+sb+sb1+sb2;
	}

}
class Subject{
	int id;
	String name;
    Topic tp,tp1,tp2;
    public void setId(int id) {
		this.id=id;
	}
	public void setName(String s) {
		name=s;
	}
	public void setTopic(Topic t,Topic t1,Topic t2) {
		tp=t;
		tp1=t1;
		tp2=t2;
	}
	Subject(int id,String s,Topic q , Topic t2, Topic t3){
		this.id = id;
		name=s;
		this.tp=q;
		this.tp1=t2;
		this.tp2=t3;
	}
	public String toString() {
		return "\nsubject number is "+id+"\nsubject name "+name+tp+tp1+tp2;
	}
}
class Topic{
	int id;
	String name;
    SubTopic stp;
    public void setId(int id) {
		this.id=id;
	}
	public void setName(String s) {
		name=s;
	}
    public void setSybTopic(SubTopic sb) {
    	stp=sb;
    	
    }
    Topic(int id,String s,SubTopic q ){
		this.id = id;
		name=s;
		this.stp=q;
		
	}
    public String toString() {
		 return "\ntopice number "+id+" \ntopice name "+name+stp;
	 }
	
}
class SubTopic{
	int id;
	String name;
    Question q,q1;
    public void setId(int id) {
		this.id=id;
	}
	public void setName(String s) {
		name=s;
	}
	public void setQuestion(Question q,Question q1) {
		this.q=q;
		this.q1=q1;
	}
	SubTopic(int id,String s,Question q , Question q2){
		this.id = id;
		name=s;
		this.q=q;
		this.q1=q1;
	}
	 public String toString() {
		 return "\nsubtopic "+id+"\nsubtopic name "+name+q+q1;
	 }

}
class 	Question{
	int id;
	String name;
	 public void setId(int id) {
			this.id=id;
		}
	 public void setName(String s) {
			name=s;
		}
	 Question(int id,String s){
		 this.id = id;
		 name = s;
	 }
	 public String toString() {
		 return "\nquestion number "+id+"\nquestion name "+name;
	 }
		

}

public class Contanment3 {
	public static void main(String[] args) {
		Question q = new Question(15,"atomicTheory");
		Question q1 = new Question(16,"core java");
		
		SubTopic st = new SubTopic(5,"language",q,q1);
		Topic to = new Topic(2,"xyz",st);
		Topic to1 = new Topic(3,"abc",st);
		Topic to2 = new Topic(4,"lmn",st);
		
		Subject sub= new Subject(4,"computer Science",to,to1,to2);
		Subject sub1= new Subject(14,"microprocessor",to,to1,to2);
		Subject sub2= new Subject(24,"data structure",to,to1,to2);
		
		Branch br= new Branch(1010,"CS",sub,sub1,sub2);
		Institude i = new Institude(2010,"RGPV BHOPAL",br);
		System.out.println(i);
	}

}
