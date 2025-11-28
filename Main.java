public class Main {
    public static void main(String[] args) {
        String code = UniversityDepartment.DepartmentUtils.generateCode("Cyber Security");
        System.out.println("Код кафедри: " + code);

        UniversityDepartment myDept = new UniversityDepartment("Кібербезпеки");
        UniversityDepartment.Professor myProf = myDept.new Professor("Петренко В.В.");
        myProf.introduce();

        Staff guard = new Staff() {
            @Override
            public void work() {
                System.out.println("Охоронець: Вхід за перепустками (Анонімний клас).");
            }
        };
        guard.work();
    }
}
