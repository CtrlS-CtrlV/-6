public class UniversityDepartment {
    private String departmentName;

    public UniversityDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    // Внутрішній клас
    public class Professor {
        private String name;

        public Professor(String name) {
            this.name = name;
        }

        public void introduce() {
            // Доступ до приват поля зовнішнього класу
            System.out.println("Викладач " + name + " працює на кафедрі: " + departmentName);
        }
    }

    public static class DepartmentUtils {
        public static String generateCode(String name) {
            // Немає доступу до this.departmentName, тільки передані параметри
            if (name == null || name.length() < 3) return "UNK-00";
            return name.toUpperCase().substring(0, 3) + "-" + (System.currentTimeMillis() % 1000);
        }
    }
}
