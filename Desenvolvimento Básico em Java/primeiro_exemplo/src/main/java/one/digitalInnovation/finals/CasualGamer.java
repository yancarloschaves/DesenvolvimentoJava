package one.digitalInnovation.finals;

public class CasualGamer extends Gamer{

    public String keyboard(){
        return "Simple keyboard!";
    }

    /*public String mouse(){
        return super.mouse();
    }*/

    public String play(final String game){

        //game = "WoW";

        return "Jogando game " + game;
    }

}
