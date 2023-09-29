package ru.netology;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<Contact>> phoneBook = new HashMap<>();
    private List<Contact> listContactOnGroup = new ArrayList<>();

    public boolean addGroup(String group) {

        if (phoneBook.containsKey(group)) {
            return false;
        } else {
            phoneBook.put(group, new ArrayList<>());
            return true;
        }
    }

    public boolean addContact(String[] group, Contact contact) {
        for (String groupContact : group) {
            if (!phoneBook.containsKey(groupContact)) {
                break;
            } else {
                listContactOnGroup = phoneBook.get(groupContact);
                listContactOnGroup.add(contact);
            }
        }
        return true;
    }

    public void printPhoneBook() {
        for (Map.Entry<String, List<Contact>> groupAndContact : phoneBook.entrySet()) {
            String key = groupAndContact.getKey();
            String value = groupAndContact.getValue().toString();
            System.out.println(key + " : " + value);
        }
    }

    public void searchGroup(String nameGroup) {
        if (phoneBook.containsKey(nameGroup)) {
            System.out.println(phoneBook.get(nameGroup));
        } else {
            System.out.println("Группы нет\n");
        }
    }

    public Contact numberSearch(String number) {
        for (Map.Entry<String, List<Contact>> kv : phoneBook.entrySet()) {
            for (Contact contact : kv.getValue()) {
                if (number.contains(contact.number)) {
                    return contact;
                }
            }
        }
        System.out.println("Такого контакта не существует");
        return null;
    }
}

