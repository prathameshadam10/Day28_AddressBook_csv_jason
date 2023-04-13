package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    private String AddressBookName;

    public String getAddressBookName() {
        return AddressBookName;
    }

    public void setAddressBookName(String addressBookName) {
        AddressBookName = addressBookName;
    }

    Scanner sc = new Scanner(System.in);
    ArrayList<Contact> contactArrayList = new ArrayList<>();

    public ArrayList<Contact> getContactArrayList() {
        return contactArrayList;
    }

    public void setContactArrayList(ArrayList<Contact> contactArrayList) {
        this.contactArrayList = contactArrayList;
    }

    public void addContact(){
        Contact person = new Contact();
        System.out.println("Enter your First Name");
        person.setFirstName(sc.nextLine());


        System.out.println("Enter your Last Name");
        person.setLastName(sc.nextLine());


        System.out.println("Enter Your Address");
        person.setAddress(sc.nextLine());


        System.out.println("Enter your City");
        person.setCity(sc.nextLine());


        System.out.println("Enter your state");
        person.setState(sc.nextLine());


        System.out.println("Enter your Zip code");
        person.setZip(sc.nextLine());


        System.out.println("Enter your Contact Number");
        person.setPhoneNumber(sc.nextLine());


        System.out.println("Enter your Email ID");
        person.setEmail(sc.nextLine());

        contactArrayList.add(person);
        displayContact();
    }

    public void editContact (){


        boolean isContactFound = false;
        System.out.println("Enter ContactDetail to edit");
        String contactDetail = sc.next();
        for(Contact cont : contactArrayList){
            if (contactDetail.equalsIgnoreCase(cont.getFirstName())){
                isContactFound = true;
                System.out.println("Enter First Name ");
                cont.setFirstName(sc.next());
                System.out.println("Enter Last Name ");
                cont.setLastName(sc.next());
                System.out.println("Enter address ");
                cont.setAddress(sc.next());
                System.out.println("Enter City");
                cont.setCity(sc.next());
                System.out.println("Enter State");
                cont.setState(sc.next());
                System.out.println("Enter Email");
                cont.setEmail(sc.next());
                System.out.println("Enter Zip Code ");
                cont.setZip(sc.next());
                System.out.println("Enter Phone Number ");
                cont.setPhoneNumber(sc.next());
                break;
            }
        }
        if(isContactFound){
            System.out.println("Contact Updated Successfully..");
        }
        else {
            System.out.println("Contact not found");
        }
    }
    public void deleteContact(){
        boolean isContactFound = false;
        System.out.println("enter name to delete contact");
        String name = sc.nextLine();
        for(Contact contact : contactArrayList){
            if (contact.getFirstName().equalsIgnoreCase(name)){
                System.out.println("contact found :");
                isContactFound = true;
                System.out.println(contact);
                System.out.println("Confirm to delete (y/n)");
                if(sc.next().equalsIgnoreCase("y")){
                    contactArrayList.remove(contact);
                    System.out.println("contact delete");
                }
                break;
            }
        }
        if (!isContactFound){
            System.out.println("opps... contact not found");
        }
    }
    void displayContact(){

        System.out.println(contactArrayList);
    }

//    void addMultipleContact(){
//        System.out.println("Enter the number of person whose details you want" +
//                             "to add to address book");
//        int no_of_person = sc.nextInt();
//        for(int i=1; i<=no_of_person; i++){
////            call addition method for so many times
//            addContact();
//        }
//    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "AddressBookName='" + AddressBookName + '\'' +
                '}';
    }
}


