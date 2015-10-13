package shop;

public class Customer {
	private String name;
	private boolean member;
	private String memberType;
	public Customer(){
		this.member = false;
	}
	public Customer(String name){
		this.name= name;
		this.member =false;
	}
	public String getName(){
		return name;
	}
	public boolean isMember(){
		if(member ==true){
			return true;
		}else{
			return false;
		}
	}
	public void setMember(boolean member){
		this.member = member;
	}
	public void setMemberType(String type){
		this.memberType = type;
	}
	public String getMemberType(){
		return memberType;
	}
	public String toString(){
		return "Customer: "+name+"Type Customer"+this.memberType;
	}
	
}
