package com.constructor;
public class Test3 {    
	int id,passoutYear;  
	String name,collegeName;
	long contactNo;  
	  
	Test3(long contactNo, String collegeName, int passoutYear){  
	this.contactNo = contactNo;  
	this.collegeName = collegeName;  
	this.passoutYear = passoutYear;
	}  
	  
	Test3(int id, String name){  
	this(9517058289L, "Leelawati College", 2023);  
	this.id = id;  
	this.name = name;  
	}  
	  
	public static void main(String[] args) {  
		
    Test3 s = new Test3(1, "Aadil");  
	System.out.println("....Printing Student Information....");  
	System.out.println("Name: "+s.name+"\nId: "+s.id);
	System.out.println("Contact No.: "+s.contactNo+"\nCollege Name: "+s.collegeName+"\nPassing Year: "+s.passoutYear);
	}  
	}  

