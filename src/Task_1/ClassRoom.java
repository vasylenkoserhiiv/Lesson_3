package Task_1;
/*
Створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil.
У тілі класу створіть методи void study(), void read(), void write(), void relax().
Створіть 3 похідні класу ExcellentPupil, GoodPupil, BadPupil від класу базового класу Pupil і
перевизначте кожен із методів, залежно від успішності учня. Конструктор класу ClassRoom приймає
аргументи типу Pupil, клас має складатися із 4 учнів. Передбачте можливість, що користувач може
передати 2 або 3 аргументи. Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom
вміють навчатися, читати, писати, відпочивати.
 */
public class ClassRoom {
    private Pupil pupil_1;
    private Pupil pupil_2;
    private Pupil pupil_3;
    private Pupil pupil_4;

    public ClassRoom(){
    }

    public ClassRoom(Pupil pupil_1, Pupil pupil_2, Pupil pupil_3, Pupil pupil_4){
        this.pupil_1 = pupil_1;
        this.pupil_2 = pupil_2;
        this.pupil_3 = pupil_3;
        this.pupil_4 = pupil_4;
    }

    public ClassRoom(Pupil pupil_1, Pupil pupil_2, Pupil pupil_3){
        this.pupil_1 = pupil_1;
        this.pupil_2 = pupil_2;
        this.pupil_3 = pupil_3;
    }

    public void study(){
        pupil_1.study();
        pupil_2.study();
        pupil_3.study();
        if (pupil_4 != null) {
            pupil_4.study();
        }
    }
    public void read(){
        pupil_1.read();
        pupil_2.read();
        pupil_3.read();
        if (pupil_4 != null) {
            pupil_4.read();
        }
    }
    public void write(){
        pupil_1.write();
        pupil_2.write();
        pupil_3.write();
        if (pupil_4 != null) {
            pupil_4.write();        }
    }
    public void relax(){
        pupil_1.relax();
        pupil_2.relax();
        pupil_3.relax();
        if (pupil_4 != null) {
            pupil_4.relax();
        }
    }

}
