
public class Prompter extends Start{
    
    //Attribute
    private String msg; 
  
    //Default constructur
    public Prompter(){
        this.msg = "";
    }

    //Getter
    public String getMsg(){
        return msg;
    }

    // //Method for prompting msg to the user
    // public void msgStrt(){
    //  Prompter msg1 = new Prompter("Welcome to Data Searcher batch 61");
    //  Prompter msg2 = new Prompter("Please input initials to begin searching");
    // }

    //List of Prompts
    public void msg1(){
        System.out.println("Welcome to the Data Searcher BATCH 61 (ALPHA)");
    } 

    public void msg2(){
        System.out.println("Please input initials to begin searching...");
    }

}