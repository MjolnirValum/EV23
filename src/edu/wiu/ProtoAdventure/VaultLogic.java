
package edu.wiu.ProtoAdventure;


public class VaultLogic {
    
    //The var and constructor commented out below are from an earlier iteration before this current one was implemented. It doesn't NOT work.
    //But it is not ideal. Leave it for now. 
    //ProtoGUITwo caller;
    /*
    public VaultLogic(ProtoGUITwo gui, UserPlayer play){
        ProtoGUITwo caller = gui;
        UserPlayer ourPlayer = play;
        gameLogic(caller, ourPlayer);
        //caller.setPrompt("Hey is this working");
    }
    */
    //Somehow the switch in this statement will need to be made so that it keeps checking over and over again. Still need to implement
    //the event listener stuff, and maybe that will be the answer to getting this to keep happening repeatedly. Maybe this should be done
    //recursively, so that the call to this method comes from inside the switch statement after the player position is updated. Still need
    //to figure out how to wait for and then get the user selected option though. 
    public void gameLogic(ProtoGUITwo passedCaller, UserPlayer passedPlayer){
        VaultRooms vRooms = new VaultRooms();

            switch (passedPlayer.getPlayerPosition()) {
                case "start":
                    vRooms.example(passedCaller);
                    //It crashes when it gets to here because it doesn't wait for the user to choose an option, just automatically gets the never
                    //initialized string value and causes a null pointer exception. 
                    //TO DO: MAKE THIS WAIT FOR THE OPTION TO BE CHOSEN
                    switch (passedCaller.returnOption()) {
                        case "Option1":
                            passedPlayer.updatePosition("startCont");
                            gameLogic(passedCaller, passedPlayer);
                            break;
                    }
                case "startCont":
                    vRooms.exampleCont(passedCaller);
            }//end of switch statement

    }//end of gamelogic method
}//end of class
