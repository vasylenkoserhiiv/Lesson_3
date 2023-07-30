package Task_1;

public class BadPupil extends Pupil{
    @Override
    public void study(){
        System.out.println("BadPupil: 'I'm studying bad.'");
    }
    @Override
    public void read(){
        System.out.println("BadPupil: 'I'm reading bad.'");
    }
    @Override
    public void write(){
        System.out.println("BadPupil: 'I'm writing bad.'");
    }

    @Override
    public void relax() {
        System.out.println("BadPupil: 'I'm relaxing bad.'");
    }
}
