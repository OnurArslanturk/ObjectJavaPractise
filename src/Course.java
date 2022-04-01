public class Course {
    Teacher teach;
    String name;
    String code;
    String prefix;
    int note=0;
    int sNote=0;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int sNote = 0;

    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teach = teacher;
            // printTeacherInfo();
        }
        else System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor.");
    }
    void printTeacherInfo(){
        this.teach.print();

    }
}

//https://app.patika.dev/onurarslanturk
//www.patika.dev