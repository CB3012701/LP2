/**
 * @Érica Barbosa Pereira Lobo
 */

public class TestStaff {
    public static void main(String[] args) {
        Staff classStaff = new Staff("Érica", "Avenida Brasilia", "IFSP", 0);

        System.out.println(classStaff.toString());

        classStaff.setSchool("Cubatao");
        classStaff.setPay(1000);

        System.out.println(classStaff.toString());
        System.out.println(classStaff.getSchool());

    }
}
