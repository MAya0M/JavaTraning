public class Main {
    public static void main(String[] args) {

        Cat cat =new Cat("silly",12);
        Turtle turtle = new Turtle("turi",20);
        Mammal am = new Mammal("stupid",11);
        Reptile rep = new Reptile("rory",23);
        Animal[] manyPets={cat,turtle,am,rep};




        //will not work
        Cat cati = (Cat)new Mammal("loren",13);
        cati.giveBirth();

        // will work
        manyPets[0]=(Cat)manyPets[0];
        ((Cat) manyPets[0]).giveBirth();
         am.giveBirth();


       if (manyPets[0] instanceof Cat) {
           Cat catFromMammal = (Cat) manyPets[0];
           catFromMammal.giveBirth();
       }else {
            System.out.println("The object is not a Cat.");
        }



    }
}