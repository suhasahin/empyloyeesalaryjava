public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double bonus;
    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax() {
        double tax = 0;
        if (salary > 1000) {
            tax = salary * 0.03;
        }
        return tax;
    }

    public double bonus()
    {
        if (workHours > 40)
        {
            return (workHours - 40) * 30;
        }
        else
        {
            return 0;
        }
    }

    public double raiseSalary() {
        if ((hireYear - 2021) < 10 && (hireYear - 2021) > 0){
            return (salary * 0.05);
        }
        else if ((hireYear - 2021) > 9 && (hireYear - 2021) < 20){
            return (salary * 0.1);
        }else{
            return (salary * 0.15);
        }


    }


    void printInfo() {
        System.out.println("Adı\t\t\t\t\t: " + name);
        System.out.println("Maaş\t\t\t\t: " + salary);
        System.out.println("Çalışma saati\t\t: " + workHours);
        System.out.println("İşe başlangıç yılı\t: " + hireYear);
        System.out.println("Çalışma yılı\t\t: " + (2021 - hireYear));
        System.out.println("Vergi\t\t\t\t: " +  tax());
        System.out.println("Bonus\t\t\t\t: " + bonus());
        System.out.println("Maaş artışı\t\t\t: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar \nile birlikte maaş\t: " + (salary + bonus() - tax()));
        System.out.println("Toplam maaş\t\t\t: " + (raiseSalary()+salary));
    }
}