package Task_1;

public class ExcellentPupil extends Pupil {
    @Override
    public void study(){
        System.out.println("ExcellentPupil: 'I'm studying excellently.'");
    }
    @Override
    public void read(){
        System.out.println("ExcellentPupil: 'I'm reading excellently.'");
    }
    @Override
    public void write(){
        System.out.println("ExcellentPupil: 'I'm writing excellently.'");
    }

    @Override
    public void relax() {
        System.out.println("ExcellentPupil: 'I'm relaxing excellently.'");
    }
}
