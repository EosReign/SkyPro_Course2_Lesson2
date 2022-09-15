public class Main {
    public static int mathRandom() {
        double a = Math.random() * 100;
        a = Math.round(a);
        int b = (int) a;
        return b;
    }
    public static void main(String[] args) {
        //Griffindor
        GriffindorStudent[] arrGrif = new GriffindorStudent[3];
        GriffindorStudent HarryPotter = new GriffindorStudent("Harry Potter", mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom());
        GriffindorStudent RonUisly = new GriffindorStudent("Ron Uisly", mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom());
        GriffindorStudent GermionaGraynger = new GriffindorStudent("Germiona Graynger", mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom());
        arrGrif[0] = HarryPotter;
        arrGrif[1] = RonUisly;
        arrGrif[2] = GermionaGraynger;
        //Pufendui
        PufenduiStudent[] arrPuf = new PufenduiStudent[3];
        PufenduiStudent ZahariaSmith = new PufenduiStudent("Zaharia Smith", mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom());
        PufenduiStudent SedrickDiggory = new PufenduiStudent("Sedrick Diggory", mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom());
        PufenduiStudent JustinFinchFletchly = new PufenduiStudent("Justin Finch-Fletchly", mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom());
        arrPuf[0] = ZahariaSmith;
        arrPuf[1] = SedrickDiggory;
        arrPuf[2] = JustinFinchFletchly;
        //Kogtevran
        KogtevranStudent[] arrKogt = new KogtevranStudent[3];
        KogtevranStudent ChzhouChang = new KogtevranStudent("Chzhou Chang", mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom());
        KogtevranStudent PadmaPatil = new KogtevranStudent("Padma Patil", mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom());
        KogtevranStudent MarkusBelby = new KogtevranStudent("Markus Belby", mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom());
        arrKogt[0] = ChzhouChang;
        arrKogt[1] = PadmaPatil;
        arrKogt[2] = MarkusBelby;
        //Slyzerin
        SlyzerinStudent[] arrSlyz = new SlyzerinStudent[3];
        SlyzerinStudent DrakoMalfoi = new SlyzerinStudent("Drako Malfoi", mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom());
        SlyzerinStudent GrackhemMontegnu = new SlyzerinStudent("Grackhem Montegnu", mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom());
        SlyzerinStudent GregoriyGoil = new SlyzerinStudent("GregoriyGoil", mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom(), mathRandom());
        arrSlyz[0] = DrakoMalfoi;
        arrSlyz[1] = GrackhemMontegnu;
        arrSlyz[2] = GregoriyGoil;
        /* ehhh dont work. IDK why not working this method in Main. sheesh..
        printComparePufenduiStudents(arrPuf);
        printCompareHogwartsStudents(arrKogt[0], arrSlyz[2]);
        ...
         */
    }
}
