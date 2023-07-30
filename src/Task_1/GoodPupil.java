package Task_1;

public class GoodPupil extends Pupil {
    @Override
    public void study(){
        System.out.println("GoodPupil: 'I'm studying good.'");
    }
    @Override
    public void read(){
        System.out.println("GoodPupil: 'I'm reading good.'");
    }
    @Override
    public void write(){
        System.out.println("GoodPupil: 'I'm writing good.'");
    }

    @Override
    public void relax() {
        System.out.println("GoodPupil: 'I'm relaxing good.'");
    }
}
