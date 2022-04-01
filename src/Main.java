public class Main {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "111", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "222", "FZK");
        Teacher t3 = new Teacher("Külyutmaz", "333", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        Course fizik = new Course("Fizik", "102", "FZK");
        Course biyo = new Course("Biyoloji", "103", "BIO");

        Course tarihSoz = new Course("Tarih Sözel Sınav", "101", "TRH");
        Course fizikSoz = new Course("Fizik Sözel Sınav", "102", "FZK");
        Course biyoSoz = new Course("Biyoloji Sözel Sınav", "103", "BIO");

        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        biyo.addTeacher(t3);
        tarihSoz.addTeacher(t1);
        fizikSoz.addTeacher(t2);
        biyoSoz.addTeacher(t3);



        Student s1 = new Student("inek Şaban", "123", "4", tarih,fizik,biyo,tarihSoz,fizikSoz,biyoSoz);
        s1.addBulkExamNote(100,100,100,100,50,60);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "321", "4", tarih,fizik,biyo,tarihSoz,fizikSoz,biyoSoz);
        s2.addBulkExamNote(50,30,70,100,45,96);
        s2.isPass();

        //  Student s1 = new Student("inek Şaban", "123", "4", tarih);
        //  Student s1 = new Student("inek Şaban", "123", "4", tarih);
    }
}

//https://app.patika.dev/onurarslanturk
//www.patika.dev