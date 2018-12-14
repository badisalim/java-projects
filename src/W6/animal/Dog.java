package lecture.week6.animal;

public class Dog extends Animal implements Talkative{


    public Dog(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println(getName() + " barks");
    }


}
