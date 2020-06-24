package com.iain.task7;

public class Project {

    private String number;
    private String name;
    private String buildingType;
    private String address;
    private String erfNumber;
    private double totalFee;
    private double totalAmount;
    private String deadline;
    private Contractor contractor;
    private Architect architect;
    private Customer customer;

    public Project(String number, String name, String buildingType, String address, String erfNumber, double totalFee,
            double totalAmount, String deadline, Contractor contractor, Architect architect, Customer customer) {
        this.number = number;
        this.name = name;
        this.buildingType = buildingType;
        this.address = address;
        this.erfNumber = erfNumber;
        this.totalFee = totalFee;
        this.totalAmount = totalAmount;
        this.deadline = deadline;
        this.contractor = contractor;
        this.architect = architect;
        this.customer = customer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getErfNumber() {
        return erfNumber;
    }

    public void setErfNumber(String erfNumber) {
        this.erfNumber = erfNumber;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }

    public Architect getArchitect() {
        return architect;
    }

    public void setArchitect(Architect architect) {
        this.architect = architect;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double invoicePrint() {
		double toPay = totalFee - totalAmount;
        
        if (toPay == 0){
            System.out.println("No invoice neccesary");
        }
        else {
            


        }
        return toPay;
    }

    @Override
    public String toString() {
        return "Project [address=" + address + ", architect=" + architect + ", buildingType=" + buildingType
                + ", contractor=" + contractor + ", customer=" + customer + ", deadline=" + deadline + ", erfNumber="
                + erfNumber + ", name=" + name + ", number=" + number + ", totalAmount=" + totalAmount + ", totalFee="
                + totalFee + "]";
    }

	public void setTotalAmount(String newAmount) {
	}

	public void setContractor(String[] changeContracter) {
		// TODO Auto-generated method stub
		
	}

    

   

}