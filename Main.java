public class Main{

    private static boolean MStat = true;

    public static void main (String[]args){

        Prompter prompt = new Prompter();

        prompt.msg1();

        while (MStat == true){

            //Intiator function
            Initiator ini = new Initiator(); 
            //Main will run the method inside the intiator class
            ini.start();
            ini.DataSearch();

            MStat = ini.getStatus();

        }
            
    }

} 



 