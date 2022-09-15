public class KogtevranStudent extends HogwartsStudent {
    private int intellect;
    private int wisdom;
    private int wit;
    private int creativity;


    public KogtevranStudent(String fullname, int magicalPower, int transgressionDistance, int intellect, int wisdom, int wit, int creativity) {
        super(fullname, magicalPower, transgressionDistance);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }
    public int getCreativity() {
        return creativity;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }
    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public void printCompareKogtevranStudents(KogtevranStudent[] arr) {
        int subjectA = 0;
        int subjectB = 0;
        KogtevranStudent bestSubject;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getFullName() +  ": ум = " + arr[i].getIntellect() + "; мудрость = " + arr[i].getWisdom() + "; остроумие = " + arr[i].getWit() + "; креативность = " + arr[i].getCreativity() + "; магическая мощь = " + arr[i].getMagicalPower() + "; макс. дистанция трансгрессии = " + arr[i].getTransgressionDistance());
            if (i % 2 == 0 || i == 0) {
                subjectA = arr[i].getIntellect() + arr[i].getWisdom() + arr[i].getWit() + arr[i].getCreativity() + arr[i].getMagicalPower() + arr[i].getTransgressionDistance();
                System.out.println("Общая мощь: " + subjectA);
            } else {
                subjectB = arr[i].getIntellect() + arr[i].getWisdom() + arr[i].getWit() + arr[i].getCreativity() + arr[i].getMagicalPower() + arr[i].getTransgressionDistance();
                System.out.println("Общая мощь: " + subjectB);
            }
            if (subjectA >= subjectB) {
                bestSubject = arr[i];
            } else {
                bestSubject = arr[i];
            }
            if (i + 1 == arr.length) {
                System.out.println(bestSubject.getFullName() + " Лучший студент Когтеврана!");
            }
        }
    }
}
//...
