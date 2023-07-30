package Task_1;

public class Main {
    public static void main(String[] args) {
        Pupil pupil_1 = new ExcellentPupil();
        Pupil pupil_2 = new GoodPupil();
        Pupil pupil_3 = new BadPupil();
        Pupil pupil_4 = new BadPupil();

        ClassRoom classRoom = new ClassRoom(pupil_1, pupil_2, pupil_3, pupil_4);
        classRoom.study();
        classRoom.read();
        classRoom.write();
        classRoom.relax();
    }
}
