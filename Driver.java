import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class Driver {
    
    static Book book = new Book("book1");
    static String cmd = "";
    
    public static void main(String[] args) throws IOException, InterruptedException{
   	 //---Command Line IO---//
   	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

   	 System.out.println("Welcome to Address Book CLI");
   	 System.out.println("Commands: ");
   	 System.out.println("new	-to create a new contact");
   	 System.out.println("delete -to delete an existing contact");
   	 System.out.println("exit   -to exit the program");
   	 
   	 while(true){
   	 System.out.println("~:");
   	 cmd = reader.readLine();
   	 while(!((cmd.equals("new")) || (cmd.equals("delete")) || (cmd.equals("exit")) || cmd.equals("list"))){
   		 System.out.println("Command not recognized, try again");
   		 cmd = reader.readLine();
   	 }
   	 if(cmd.equals("new")){
   		 System.out.println("Input the information specified and hit enter");
   		 System.out.println("If you would like to leave a field empty, input $ then hit enter");
   		 
   		 System.out.print("First Name: ");
   		 String first = reader.readLine();
   		 
   		 System.out.print("Last Name: ");
   		 String last = reader.readLine();
   		 
   		 System.out.print("Street Address: ");
   		 String address = reader.readLine();
   		 
   		 System.out.print("City: ");
   		 String city = reader.readLine();
   		 
   		 System.out.print("State: ");
   		 String state = reader.readLine();
   		 
   		 System.out.print("Zip Code: ");
   		 String zip = reader.readLine();
   		 
   		 System.out.print("Phone Number: ");
   		 String number = reader.readLine();
   		 
   		 System.out.print("Email: ");
   		 String email = reader.readLine();
   		 
   		 book.addContact(first,last,address,city,state,zip,number,email);
   		 System.out.print("Contact Created: ");
   		 displayContact(book.book.get(0));
   	 }
   	 if(cmd.equals("delete")){
   		 System.out.println("Input the information specified then hit enter");
   		 
   		 System.out.print("First name of contact to be deleted: ");
   		 String first = reader.readLine();
   		 
   		 System.out.print("Last name of contact to be deleted: ");
   		 String last = reader.readLine();
   		 
   		 if(book.deleteContact(first, last)){
   			 System.out.println("Contact deleted");
   		 }
   		 else{
   			 System.out.println("Contact not found, delete failed");
   		 }
   	 }
   	 if(cmd.equals("list")){
   		 for(int i = 0; i < book.book.size(); i++){
   			 displayContact(book.book.get(i));
   		 }
   	 }
   	 if(cmd.equals("exit")){
   		 System.out.println("Good Bye");
   		 Thread.sleep(1000);
   		 System.exit(0);
   	 }
   	 }
    }
    public static void displayContact(Contact contact){
   	 System.out.println(contact.First_Name + " " + contact.Last_Name);
    }
}

