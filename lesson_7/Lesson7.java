public class Lesson7 {
    public static void main(String[] args) {
        //Loai 1
        Peson objPeson = new Peson();

        //Cach 1
        SubAbsPerson absPerson = new SubAbsPerson();
        System.out.println(absPerson.talk());
        System.out.println(absPerson.talk1(""));
        System.out.println(absPerson.talk2());


        //Class nặc danh
        AbsPerson objNew = new AbsPerson() {
            @Override
            public String talk() {
                return null;
            }

            @Override
            public String talk1(String st1) {
                return null;
            }

            @Override
            public String talk2() {
                return null;
            }

            @Override
            public String talk3() {
                return null;
            }
        };

        objNew.talk1("");
    }
}
