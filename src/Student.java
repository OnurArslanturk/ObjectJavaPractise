public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course cs1;
    Course cs2;
    Course cs3;

    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3, Course cs1, Course cs2, Course cs3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.cs1 = cs1;
        this.cs2 = cs2;
        this.cs3 = cs3;
        this.avarage = 0.0;
        this.isPass = false;

    }

    void isPass(){
        System.out.println("===========================================================");
        this.avarage = ((((this.c1.note + this.c2.note + this.c3.note)/3.0)*0.8)+(this.cs1.sNote*0.2));

        if (this.avarage > 55) {
            System.out.println("Sınıfı başarılı şekilde geçtiniz");
            this.isPass = true;
        }
        else {
            System.out.println("Maalesef sınıfta kaldınız.");
            this.isPass = false;
        }
        printNote();
    }

    void addBulkExamNote(int note1, int note2, int note3, int noteS1, int noteS2, int noteS3){
        if(note1>= 0 && note1 <=100)this.c1.note = note1;
        if(note2>= 0 && note2 <=100)this.c2.note = note2;
        if(note3>= 0 && note3 <=100)this.c3.note = note3;
        if(noteS1>= 0 && noteS1 <=100)this.cs1.sNote = noteS1;
        if(noteS2>= 0 && noteS2 <=100)this.cs2.sNote = noteS2;
        if(noteS3>= 0 && noteS3 <=100)this.cs3.sNote = noteS3;

    }

    void printNote(){

        System.out.println(this.c1.name + " Notu \t\t: " + this.c1.note);
        System.out.println(this.c2.name + " Notu \t\t: " + this.c2.note);
        System.out.println(this.c3.name + " Notu \t: " + this.c3.note);
        System.out.println("Ortalamanız \t: "+ this.avarage);
    }
}

//https://app.patika.dev/onurarslanturk
//www.patika.dev