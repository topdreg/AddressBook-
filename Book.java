import java.util.*;
import java.io.*;

public class Book{

	public List<Contact> book = new ArrayList<Contact>();
	public String name;

	// Either we build a book from a file or we build a new one from scratch.
	public Book(Scanner input){
		while(input.hasNextLine()){
			String First_Name = input.nextLine();
			String Last_Name = input.nextLine();
			String Address = input.nextLine();
			String City = input.nextLine();
			String State = input.nextLine();
			String Zip = input.nextLine();
			String Number = input.nextLine();
			String Email = input.nextLine();
			book.add(new Contact( First_Name,Last_Name,Address,
			City,State,Zip,Number,Email));
			}
	}
	//When constructing a new book, give it a name
	public Book(String name){
		this.name = name;
	}

	public void addContact(String First_Name, String Last_Name, String Address, String
City, String State, String Zip, String Number, String Email){

book.add(new Contact( First_Name,Last_Name,Address,
City,State,Zip,Number,Email));
}
public boolean deleteContact(String First_Name, String Last_Name){
	//not yet implemented
	for(int i = 0; i != book.size(); i++){
	    if(First_Name.equalsIgnoreCase(book.get(i).First_Name)){
	        if(Last_Name.equalsIgnoreCase(book.get(i).Last_Name)){
			  book.remove(i);
   			  ((ArrayList)book).trimToSize();
   			  return true;
		        }
	    }else{
	        continue;
	    }
	}
	return false;
}

	class NameComparator implements Comparator<Contact>{
  	 	public int compare(Contact a, Contact b){
  		 	return a.Last_Name.compareTo(b.Last_Name);
  	 	}
   	}
   	
	// TODO ties broken by last name
   	class ZipComparator implements Comparator<Contact>{
  	 	public int compare(Contact a, Contact b){
  			return Integer.parseInt(a.Zip) - Integer.parseInt(b.Zip);
  		 }
  	 }

	// CompareTo method in Contact should be being used here?
	public void SortByName(){
		Collections.sort(book, new NameComparator());
	}

	public void SortByZip(){
		Collections.sort(book, new ZipComparator());
	}
}
