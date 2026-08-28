
import java.io.*;
import java.util.Scanner;

public class DataBase extends Initiator{

    //Attribute
    protected String file = "Batch61.txt";
    protected String output;
    protected String name;
    protected int i;
    protected String iniValue;
    //Attribute Result
    protected String rName;
    protected String age;
    protected String home;


    //Obj
  Scanner scan = new Scanner(System.in);

    //Search Engine!!! 🏫
    public String searchEngine(){

        //Aqquiring user input
        System.out.print("What is the person name?: " );
        name = scan.nextLine(); // I accept ❤️❤️❤️
        
        // If any failure occur during the searches, this "try" big boy will handle it 
            try (BufferedReader buffReader = new BufferedReader(new FileReader (file))){
        
        //Keep on reading buff!!!
                while((iniValue = buffReader.readLine()) != null){


                    String[] val = iniValue.split(";"); 

                    if(val[0].equalsIgnoreCase(name)){

                        rName = val[1];
                        age = val[2];
                        home = val[3];

                    }

                 }



            }catch (IOException e){

                System.out.println("Hey what happen? (sfx)" + e);

            }   

            if (rName == null && age == null && home == null){
                return "Sorry could not retrieve user information";
            }

        return """
                
                ===========================================

                Name : %s
                age  : %s
                Home : %s
                    

                
                """.formatted(rName,age,home);
    
    }  

}