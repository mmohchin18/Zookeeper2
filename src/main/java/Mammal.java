public abstract class Mammal extends Animal {

    /////////////////////////Attributes////////////////

    String colour;

    ////////////////////////Constructors///////////////////////


    //////////////////////////Methods/////////////////////////
    public abstract class Animal {
        public abstract void breathe ();
        public abstract void eat ();
        public void sleep(){
            System.out.println("I am asleep");
        }
        public void die (){
            System.out.println("I am dead");
        }
        public abstract void reproduce ();{
            System.out.println("I can reproduce");
        }
    }
}


