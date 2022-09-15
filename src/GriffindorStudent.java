import java.sql.SQLOutput;

public class GriffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;

    public GriffindorStudent(String fullname, int magicalPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(fullname, magicalPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void printCompareGriffindorStudents(GriffindorStudent[] arr) {
        int subjectA = 0;
        int subjectB = 0;
        GriffindorStudent bestSubject;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getFullName() +  ": честь = " + arr[i].getHonor() + "; благородство = " + arr[i].getNobility() + "; Храбрость = " + arr[i].getBravery() + "магическая мощь = " + arr[i].getMagicalPower() + "; макс. дистанция трансгрессии = " + arr[i].getTransgressionDistance());
            if (i % 2 == 0 || i == 0) {
                subjectA = arr[i].getBravery() + arr[i].getHonor() + arr[i].getNobility() + arr[i].getMagicalPower() + arr[i].getTransgressionDistance();
                System.out.println("Общая мощь: " + subjectA);
            } else {
                subjectB = arr[i].getBravery() + arr[i].getHonor() + arr[i].getNobility() + arr[i].getMagicalPower() + arr[i].getTransgressionDistance();
                System.out.println("Общая мощь: " + subjectB);
            }
            if (subjectA >= subjectB) {
                bestSubject = arr[i];
            } else {
                bestSubject = arr[i];
            }
            if (i + 1 == arr.length) {
                System.out.println(bestSubject.getFullName() + " Лучший студент Грифиндора!");
            }
        }
    }


}



