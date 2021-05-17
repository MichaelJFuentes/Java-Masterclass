package Arrays.Challenge;

import java.util.ArrayList;

public class Phone {
    private ArrayList<Contact> contactArrayList;

    public Phone() {
        this.contactArrayList = new ArrayList<Contact>();
    }

    // method to check if contact is present
    public boolean isContact(String name) {
        return getIndex(name) != -1;
    }
    // method to get index of name
    private int getIndex(String name) {
        for (int i = 0; i < contactArrayList.size(); i++) {
            Contact contact = this.contactArrayList.get(i);
            if (name.equals(contact.getName())) {
                return i;
            }
        }
        return -1;
    }
    // method to add
    public boolean addContact(Contact contact) {
        if (!isContact(contact.getName())) {
            contactArrayList.add(contact);
            return true;
        }
        return false;
    }

    public boolean addContact(String name, int number) {
        if (isContact(name)) {
            System.out.println("name already exist");
            return false;
        }
        contactArrayList.add(new Contact(name, number));
        System.out.println("New contact created");
        return true;

    }
    // method to remove contact
    public boolean removeContact(Contact contact) {
        if (!isContact(contact.getName())) {
            return false;
        }
        contactArrayList.remove(getIndex(contact.getName()));
        return true;
    }
    public boolean removeContact(String name) {
        int index = getIndex(name);
        return removeContact(contactArrayList.get(index));
    }

    // method to modify contact
    public boolean modifyContact(Contact old, Contact newContact) {
        if (!isContact(old.getName())) {
            return false;
        }
        int oldIndex = getIndex(old.getName());
        contactArrayList.set(oldIndex,newContact);
        return true;
    }

    public boolean modifyContact(String oldName, Contact newContact) {
        return modifyContact(contactArrayList.get(getIndex(oldName)), newContact);
    }

    // method to print contacts
    public void printContacts() {
        for (int i = 0; i < contactArrayList.size(); i++) {
            System.out.println( (i + 1) + "-  Name: " + contactArrayList.get(i).getName() + " --> " + contactArrayList.get(i).getNumber());
        }
    }

    // method to query contacts
    public int queryContacts(String name) {
        if (!isContact(name)) {
            return -1;
        }
        return contactArrayList.get(getIndex(name)).getNumber();
    }
}
