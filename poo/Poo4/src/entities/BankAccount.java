/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author User
 */
public class BankAccount {
    private Integer accountNumber;
    private String name;
    private Double AmountInTheAccount;

    public BankAccount(Integer accountNumber, String name, Double depositInitial) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.AmountInTheAccount = 0.0;
        deposit(depositInitial);
    }
    
    public BankAccount(Integer accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.AmountInTheAccount = 0.0;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmountInTheAccount() {
        return AmountInTheAccount;
    }

    public void deposit(Double valueDeposit){
        this.AmountInTheAccount += valueDeposit;
    }
    
    public void withdraw(Double valueWithdraw){
        this.AmountInTheAccount -= (valueWithdraw + util.UtilityBank.bankFee);
    }
    
    @Override
    public String toString(){
        return "Account " + getAccountNumber() + ", Holder: " +
               getName() + ", Balance: $" + getAmountInTheAccount();
    }
    
}
