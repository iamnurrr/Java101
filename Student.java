public class Student {

    //Nitelikler: name,stuNo,classes,course1,course2,course3,avarage,isPass
    //    Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
    String classes;
    String name;
    int stuNo;
    Course mat;
    Course physic;
    Course chemistry;
    double avarage;
    boolean isPass;
    Student(String name, int stuNo, String classes, Course mat, Course physic, Course chemistry) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.chemistry = chemistry;
        this.physic = physic;
        this.isPass = false;
        calcAvarage();


    }

    public void addExamNote(int mat, int physic, int chemistry) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (physic >= 0 && physic <= 100) {
            this.physic.note = physic;
        }
        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }
    }

    public void calcAvarage() {
        this.avarage = (this.physic.note + this.chemistry.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }
    public void isPass() {
        if (this.mat.note == 0 || this.physic.note == 0 || this.chemistry.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");

        }
        else {
            this.isPass=isCheckPass();
            printNote();
            System.out.println("Ortalama: "+ avarage);
            if(this.isPass){
                System.out.println("Sınıfı Geçti");
            }
                else{
                System.out.println("Sınıfta Kaldı");
            }
        }
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.physic.note);
        System.out.println("Kimya Notu : " + this.chemistry.note);
    }
}