package com.iain.task7;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // System.out.println(
        // ");
        ArrayList<Project> projects = new ArrayList<Project>();

        while (true) {
            String choice = JOptionPane.showInputDialog(null,
                    "Enter the number:\n" + "1. Add project\n" + "2. Change due date\n" + "3. Make payment\n"
                            + "4. Update contractor details\n" + "5. Finalise project\n" + "6. Exit");

            switch (choice) {
                case "1":

                    String number = JOptionPane.showInputDialog(null, "Enter the project number: ");
                    String name = JOptionPane.showInputDialog(null, "Enter the project name: ");
                    String buildingType = JOptionPane.showInputDialog(null, "Enter the building type: ");
                    String address = JOptionPane.showInputDialog(null, "Enter the project address: ");
                    String erfNumber = JOptionPane.showInputDialog(null, "Enter the erf number: ");

                    double totalFee = 0.0;
                    try {
                        totalFee = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the total fee: "));
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Stop tripping!");

                    }
                    double totalAmount = Double
                            .parseDouble(JOptionPane.showInputDialog(null, "Enter the total Amount: "));
                    String deadline = JOptionPane.showInputDialog(null, "Enter the project number: ");

                    String[] inputs = getInputs();
                    Contractor contractor = new Contractor(inputs[0], inputs[1], inputs[2], inputs[3]);

                    inputs = getInputs();
                    Architect architect = new Architect(inputs[0], inputs[1], inputs[2], inputs[3]);

                    inputs = getInputs();
                    Customer customer = new Customer(inputs[0], inputs[1], inputs[2], inputs[3]);

                    Project project = new Project(number, name, buildingType, address, erfNumber, totalFee, totalAmount,
                            deadline, contractor, architect, customer);

                    projects.add(project);

                    break;

                case "2":
                    
                    int index = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the index: "));
                    Project chosenProject = projects.get(index);
                    String newDate = JOptionPane.showInputDialog(null, "Enter the new date: ");
                    chosenProject.setDeadline(newDate);
                    break;

                case "3":

                    int index1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the index: "));
                    Project chosenProject1 = projects.get(index1);
                    Double newAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the amount paid: "));
                    chosenProject1.setTotalAmount(newAmount);
                    break;

                case "4":
                    int index2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the index: "));
                    Project chosenProject2 = projects.get(index2);
                    String[] changeContracter = getInputs();
                    chosenProject2.setContractor(changeContracter);

            }

            System.out.println(projects);

        }

    }

    static String[] getInputs() {
        String name = JOptionPane.showInputDialog(null, "Enter the person's name: ");
        String address = JOptionPane.showInputDialog(null, "Enter the person's adress: ");
        String email = JOptionPane.showInputDialog(null, "Enter the person's email adress: ");
        String telephone = JOptionPane.showInputDialog(null, "Enter the person's telephone number: ");

        String[] inputs = { name, address, email, telephone };
        return inputs;
    }

}