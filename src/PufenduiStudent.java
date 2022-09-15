public class PufenduiStudent extends HogwartsStudent {
    private int laborious;
    private int loyalty;
    private int honesty;

    public PufenduiStudent(String fullname, int magicalPower, int transgressionDistance, int laborious, int loyalty, int honesty) {
        super(fullname, magicalPower, transgressionDistance);
        this.laborious = laborious;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getLaborious() {
        return laborious;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setLaborious(int laborious) {
        this.laborious = laborious;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public void printComparePufenduiStudents(PufenduiStudent[] arr) {
        int subjectA = 0;
        int subjectB = 0;
        PufenduiStudent bestSubject;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getFullName() +  ": трудолюбие = " + arr[i].getLaborious() + "; верность = " + arr[i].getLoyalty() + "; честность = " + arr[i].getHonesty() + "; магическая мощь = " + arr[i].getMagicalPower() + "; макс. дистанция трансгрессии = " + arr[i].getTransgressionDistance());
            if (i % 2 == 0 || i == 0) {
                subjectA = arr[i].getLaborious() + arr[i].getLoyalty() + arr[i].getHonesty() + arr[i].getMagicalPower() + arr[i].getTransgressionDistance();
                System.out.println("Общая мощь: " + subjectA);
            } else {
                subjectB = arr[i].getLaborious() + arr[i].getLoyalty() + arr[i].getHonesty() + arr[i].getMagicalPower() + arr[i].getTransgressionDistance();
                System.out.println("Общая мощь: " + subjectB);
            }
            if (subjectA >= subjectB) {
                bestSubject = arr[i];
            } else {
                bestSubject = arr[i];
            }
            if (i + 1 == arr.length) {
                System.out.println(bestSubject.getFullName() + " Лучший студент Пуффендуя!");
            }
        }
    }
}
