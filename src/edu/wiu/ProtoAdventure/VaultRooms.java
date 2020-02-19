package edu.wiu.ProtoAdventure;

public class VaultRooms {
    
    //This is an example of what a room method would look like. It takes the ProtoGUITwo object as an argument and then sets the prompts from here. 
    public void example(ProtoGUITwo gui){
        gui.setPrompt("Hey is this working? This is just an example. Maybe it'll work.");
        gui.setAllOptions("It", "Appears", "To", "Be");
    }
    public void exampleCont(ProtoGUITwo gui){
        gui.setPrompt("Hey if you're seeing this, you chose an option.");
        gui.setAllOptions("Some", "new", "text", "here");
    }
}