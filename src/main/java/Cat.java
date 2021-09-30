public class Cat extends Mammal{


    // Attributes what it is first.
    private String name;
    private int dateOfBirth;
    private int victims;

    //---- Constructor----
    //Need to tell the object how it should be created
    // need to tell it what data types to take in ()
    //after this.(should be followed by the attribute name) = the parameter name
    public Cat(String name, int dob, int victims){
        this.name = name;
        this.dateOfBirth = dob;
        this.victims = victims;
    }

    //METHOD ---Getters
    // when you call this method, you get back the String(which we named 'name')
    public String getName() {
        return name;
    }

    public int getDateOfBirth(){
        //asking for what it is
        return dateOfBirth;
    }

    public int getVictims(){
        //asking for what it is
        return victims;
    }

    // setters
    //the part where changing the cats identity name
    public void setName(String jerry){
        this.name = jerry;
    }

    public void setDateOfBirth(int dob){
        this.dateOfBirth = dob;
    }

    public void setVictims(int victims1){
        this.victims = victims1;
    }

//    @Override
//    public String breathe(){
//        return "I can breathe";
//    }
//
//    @Override
//    public String reproduce(){
//        return "I can reproduce";
//    }
}
