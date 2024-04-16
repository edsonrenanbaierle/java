/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import enums.WorkerLevel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author User
 */
public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Departament departament;
    private ArrayList<HourContract> arrayContracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContract cotract) {
        this.arrayContracts.add(cotract);
    }

    public void removeContract(HourContract contract) {
        this.arrayContracts.remove(contract);
    }

    public Double income(Integer year, Integer month) {
        Double total = this.baseSalary;

        for (HourContract contract : arrayContracts) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(contract.getDate());

            int yearContract = calendar.get(Calendar.YEAR);
            int monthContract = calendar.get(Calendar.MONTH) + 1; // Adiciona 1 ao mês para representação convencional

            if (yearContract == year && monthContract == month) {
                total += contract.totalValue();
            }
        }

        return total;
    }
}
