public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher (String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
    void print(){
        System.out.println("Adı \t\t:" + this.name);
        System.out.println("Telefonu \t:" + this.mpno);
        System.out.println("Bölümü \t\t:" + this.branch);
    }

}

//https://app.patika.dev/onurarslanturk
//www.patika.dev