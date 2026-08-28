
import java.util.*;

public class Initiator {

//Attribute
    //Program start and stop handler
    protected boolean status;
    protected String confirmation;
    protected int i;

    //Default constructor
    public void Initiator(){
        status = false;
        confirmation = "";
    }

    //Obj
    Scanner scan = new Scanner(System.in);

    //Getter
    public boolean getStatus(){
        return status;
    }

    //Getting user confirmation to initiate the program 
    public void start(){

        System.out.println("Start the program? (Y/N)");
        confirmation = scan.nextLine();
        
        switch (confirmation){

            case "y":
                this.status = true;
                System.out.println("Starting...");
            break;
            
            case "Y":
                this.status = true;
                System.out.println("Starting...");
            break;

            case "n":
                this.status = false;
                System.out.println("Exiting...");
            break;

            case "N":
                this.status = false;
                System.out.println("Exiting...");
            break;

            default:
                this.status = false;
                System.out.println("Wrong input mate...");

        }
    }

    //Method to commence data searches 
    public void DataSearch(){

        DataBase data = new DataBase();

        if (this.status == true){

            System.out.println(data.searchEngine());
     
        }

    }

       
    



}