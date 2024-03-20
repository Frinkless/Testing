package org.example.class8;

public class E1BreakCopy {
    public static void main(String[] args) {
        String [] names={"James", "Iram", "Matt Naughty", "Ubaidur", "Aladin", "Ana", "Silvia"};
        // search for the name Iram if it is present print on th console name is present
        //String name="Ubaidur";
        for(String n:names){
            if(n.equals("Ubaidur")){
                System.out.println(n+" is present");
                break;
            }
        }

    }
}
