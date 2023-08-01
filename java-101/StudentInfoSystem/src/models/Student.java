package models;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    public Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addVerbalExamNote(int mat, int matPercent, int fizik, int fizikPercent, int kimya, int kimyaPercent) {
        if (mat >= 0 && mat <= 100) {
            this.mat.verbalNote = mat;
            this.mat.verbalNotePercent = matPercent;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.verbalNote = fizik;
            this.fizik.verbalNotePercent = fizikPercent;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.verbalNote = kimya;
            this.kimya.verbalNotePercent = kimyaPercent;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note * (100 - this.fizik.verbalNotePercent) + this.fizik.verbalNote * this.fizik.verbalNotePercent) / 100 +
                (this.kimya.note * (100 - this.kimya.verbalNotePercent) + this.kimya.verbalNote * this.kimya.verbalNotePercent) / 100 +
                (this.mat.note * (100 - this.mat.verbalNotePercent) + this.mat.verbalNote * this.mat.verbalNotePercent) / 100) / 3;

    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}
