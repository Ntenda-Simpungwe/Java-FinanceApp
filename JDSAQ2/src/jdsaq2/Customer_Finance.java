/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdsaq2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author brand
 */
import javax.swing.JOptionPane;

class Customer {

//variables for storing customer data



int contactNumber;
String customerName;
double productPrice;
double numberOfMonths;
double monthlyRepaymentAmount;

//getter and setter

public String getCustomerName() {

return customerName;

}

public void setCustomerName() {

this.customerName = JOptionPane.showInputDialog("please enter customer name: ");

}

public int getContactNumber() {

return contactNumber;

}

public void setContactNumber() {

this.contactNumber = Integer.parseInt(JOptionPane.showInputDialog("please enter contact number: "));

}

public double getProductPrice() {

return productPrice;

}

public void setProductPrice() {

this.productPrice = Double.parseDouble(JOptionPane.showInputDialog("please enter product price: "));

}

public double getNumberOfMonths() {

return numberOfMonths;

}

public void setNumberOfMonths() {

this.numberOfMonths = Double.parseDouble(JOptionPane.showInputDialog("please enter number of months: "));

}

public void calcRepayment()

{



monthlyRepaymentAmount=productPrice/numberOfMonths;

}

}

class Finance_Period extends Customer {



@Override

public void calcRepayment() {

double interest,amount;

if(numberOfMonths<=3)

{

monthlyRepaymentAmount=productPrice/numberOfMonths;

}

else

{

interest = productPrice*0.25;

amount = productPrice + interest;

monthlyRepaymentAmount = amount/numberOfMonths;

}

}

}

public class Customer_Finance {

   
    public static void main(String[] args) {
        
try{        
Customer a = new Customer();

System.out.println("Enter details for a period less than 3 months");

a.setCustomerName();
a.setContactNumber();
a.setProductPrice();
a.setNumberOfMonths();

a.calcRepayment();

String display=String.format("Customer Name:%s \n Contact Number: %d \n Product Price: %f \n Repayment Months: %f\n Monthly Repayment %f\n Total : %f\n",a.customerName,a.contactNumber,a.productPrice,a.numberOfMonths,a.monthlyRepaymentAmount,a.monthlyRepaymentAmount*a.numberOfMonths);

JOptionPane.showMessageDialog(null, display);



Finance_Period b = new Finance_Period();

System.out.println("Enter details for a period of over 3 months");

b.setCustomerName();
b.setContactNumber();
b.setProductPrice();
b.setNumberOfMonths();

b.calcRepayment();

display=String.format("Customer Name:%s \n Contact Number: %d \n Product Price: %f \n Repayment Months: %f\n Monthly Repayment %f\n Total: %f\n",b.customerName,b.contactNumber,b.productPrice,b.numberOfMonths,b.monthlyRepaymentAmount,b.monthlyRepaymentAmount*b.numberOfMonths);

JOptionPane.showMessageDialog(null, display);
}
catch(Exception e)
{
    System.out.println("Invalid input");
}

    }
    
}
