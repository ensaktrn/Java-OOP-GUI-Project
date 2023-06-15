package marmara;

import java.io.FileWriter;
import java.io.IOException;

public class BookList {
	private String name,surname,no,department;
	private int amount;
	

	BookList(String name,String surname,String no,String department,int amount) {
		this.name=name;								//Taking the data which user entered
		this.surname=surname;
		this.no=no;
		this.department=department;
		this.amount=amount;
		try {
			Write();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void Write() throws IOException {				//Write the data to BookList.txt
		FileWriter list = new FileWriter("BookList.txt");
		String data= "Name: "+name+"\nSurname: "+surname+"\nStudent No: "+no+"\nDepartment: "+department+"\nAmount of Ticket: "+Integer.toString(amount);
		list.write(data);
		list.close();
	}
	
	
	
}
