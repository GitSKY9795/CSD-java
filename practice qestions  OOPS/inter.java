public class inter{
    public static void main(String[] args) {
       Monkey monk= new Monkey();
       monk.eats(); 
       monk.drinks();
       
    }
}

interface Animal{
    void eats();
}
interface human {
    void drinks();
void sleep();
void drives();
    
}
class Monkey implements Animal, human{
    @Override
    public void eats() {
        System.out.println("Bandar ky jane adrak ka swad..");
    }

    @Override
    public void drinks() {
        // TODO Auto-generated method stub
       System.out.println("drinks");
        // throw new UnsupportedOperationException("Unimplemented method 'drinks'");
    }

    @Override
    public void sleep() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sleep'");
    }

    @Override
    public void drives() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'drives'");
    }

}