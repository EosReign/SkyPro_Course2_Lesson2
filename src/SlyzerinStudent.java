public class SlyzerinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int inventiveness;
    private int lustForPower;

    public SlyzerinStudent(String fullname, int magicalPower, int transgressionDistance, int cunning, int determination, int ambition, int inventiveness, int lustForPower) {
        super(fullname, magicalPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.inventiveness = inventiveness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getInventiveness() {
        return inventiveness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setInventiveness(int inventiveness) {
        this.inventiveness = inventiveness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void printCompareSlyzerinStudents(SlyzerinStudent[] arr) {
        int subjectA = 0;
        int subjectB = 0;
        SlyzerinStudent bestSubject;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getFullName() +  ": хитрость = " + arr[i].getCunning() + "; решительность = " + arr[i].getDetermination() + "; амбициозность = " + arr[i].getAmbition() + "; находчивость = " + arr[i].getInventiveness() + "; жажда власти = " + arr[i].getLustForPower() + "; магическая мощь = " + arr[i].getMagicalPower() + "; макс. дистанция трансгрессии = " + arr[i].getTransgressionDistance());
            if (i % 2 == 0 || i == 0) {
                subjectA = arr[i].getCunning() + arr[i].getDetermination() + arr[i].getAmbition() + arr[i].getInventiveness() + arr[i].getLustForPower() + arr[i].getMagicalPower() + arr[i].getTransgressionDistance();
                System.out.println("Общая мощь: " + subjectA);
            } else {
                subjectB = arr[i].getCunning() + arr[i].getDetermination() + arr[i].getAmbition() + arr[i].getInventiveness() + arr[i].getLustForPower() + arr[i].getMagicalPower() + arr[i].getTransgressionDistance();
                System.out.println("Общая мощь: " + subjectB);
            }
            if (subjectA >= subjectB) {
                bestSubject = arr[i];
            } else {
                bestSubject = arr[i];
            }
            if (i + 1 == arr.length) {
                System.out.println(bestSubject.getFullName() + " Лучший студент Слизерина!");
            }
        }
    }
}
