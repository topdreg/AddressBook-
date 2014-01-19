import java.util.*;

public class Contact{

// These should probably be private. If we don’t use a public get method then we have to
// leave them public.
	public String First_Name, Last_Name, Address, City, State, Email, Zip, Number;

// When the Book class adds an entry it will have to provide this information.
// If it doesn’t have all the information we can use a special character to signify that.
	public Contact(String First_Name, String Last_Name, String Address, String City, String State, String Zip, String Number, String Email){
    
   		 this.First_Name = First_Name;
   		 this.Last_Name = Last_Name;
   		 this.Address = Address;
   		 this.City = City;
   		 this.State = State;
   		 this.Email = Email;
   		 this.Zip = Zip;
   		 this.Number = Number;

	}

// So, I’m imagining that when someone clicks “Save edit” or what have you, all of the
// strings and ints displayed in the UI are going to be sent to “edit contact” and then here?
// Essentially this is just overwriting each field then.

	public void makeChanges(String First_Name, String Last_Name, String Address, String City, String State, String Zip, String Number, String Email){

   	 if(First_Name != "$"){this.First_Name = First_Name;}
   	 if(Last_Name != "$"){this.Last_Name = Last_Name;}
   	 if(Address != "$"){this.Address = Address;}
   	 if(City != "$"){this.City = City;}
    	if(State != "$"){this.State = State;}
    	if(Email != "$"){this.Email = Email;}
    	if(Zip != "$"){this.Zip = Zip;}
    	if(Number != "$"){this.Number = Number;}

	}
}

