package SRP;

// создали новый класс, отвечающий за начисление зп
public class Salary {
    private int baseSalary;
    private Employee employee;

    public void salaryService(int baseSalary, Employee employee) {
        this.baseSalary = baseSalary;
        this.employee = employee;
    }
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
}
