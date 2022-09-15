public class HogwartsStudent {
    private int magicalPower;
    private int transgressionDistance;
    private String fullName;

    public HogwartsStudent(String fullname, int magicalPower, int transgressionDistance) {
        this.magicalPower = magicalPower;
        this.transgressionDistance = transgressionDistance;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
    public int getMagicalPower() {
        return magicalPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setMagicalPower(int magicalPower) {
        this.magicalPower = magicalPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
    public void setFullName() {
        this.fullName = fullName;
    }
    public void printCompareHogwartsStudents(HogwartsStudent student1, HogwartsStudent student2) {
        if (student1.getMagicalPower() + student1.getTransgressionDistance() > student2.getMagicalPower() + student2.getTransgressionDistance()) {
            System.out.println(student1.getFullName() + " имеет бОльший магический потенциал, чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " имеет бОльший магический потенциал, чем " + student1.getFullName());
        }
    }
}
//...
