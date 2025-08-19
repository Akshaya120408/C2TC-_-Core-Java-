package Daythree.scannerdemo;

public class TaxCalculation {
	public void calculateTax(Person person) {
        int exemptionLimit;

        // Different exemption limit based on gender and age
        if (person.getAge() > 65) {
            exemptionLimit = 240000; // Senior citizens
        } else if (person.getGender().equalsIgnoreCase("female")) {
            exemptionLimit = 180000; // Females
        } else {
            exemptionLimit = 160000; // Males
        }

        int income = person.getIncome();

        if (income <= exemptionLimit) {
            person.setTax(0);
            System.out.println("No tax: Income within exemption limit");
        } 
        else if (income <= 500000) {
            person.setTax((income - exemptionLimit) * 10 / 100);
        } 
        else if (income <= 800000) {
            // First slab: 10% for income between exemptionLimit and 5,00,000
            int firstSlabTax = (500000 - exemptionLimit) * 10 / 100;
            // Second slab: 20% for income above 5,00,000
            int secondSlabTax = (income - 500000) * 20 / 100;
            person.setTax(firstSlabTax + secondSlabTax);
        } 
        else {
            // First slab: 10% up to 5,00,000
            int firstSlabTax = (500000 - exemptionLimit) * 10 / 100;
            // Second slab: 20% between 5,00,000 and 8,00,000
            int secondSlabTax = (800000 - 500000) * 20 / 100;
            // Third slab: 30% above 8,00,000
            int thirdSlabTax = (income - 800000) * 30 / 100;
            person.setTax(firstSlabTax + secondSlabTax + thirdSlabTax);
        }
    }
}
