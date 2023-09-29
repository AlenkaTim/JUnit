package ru.netology;

public class Main {
    static PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {
        phoneBook.addGroup("Семья");
        phoneBook.addGroup("Друзья");
        phoneBook.addGroup("РЖД");
        phoneBook.addGroup("Фриланс");
        phoneBook.addContact(new String[]{"Семья"}, new Contact("Мама", "123123"));
        phoneBook.addContact(new String[]{"Семья"}, new Contact("Брат", "235689"));

        phoneBook.addContact(new String[]{"Друзья"}, new Contact("Танька", "666666"));
        phoneBook.addContact(new String[]{"Друзья"}, new Contact("Маша", "777777"));

        phoneBook.addContact(new String[]{"РЖД"}, new Contact("ЭЧ", "147258"));
        phoneBook.addContact(new String[]{"РЖД"}, new Contact("Начальник", "963852"));
        phoneBook.addContact(new String[]{"Фриланс", "Друзья"}, new Contact("Настя", "112233"));


        System.out.println("Список контактов: \n");
        phoneBook.printPhoneBook();
        System.out.println("\n Поиск по группе: \n");


        phoneBook.searchGroup("Семья");
        phoneBook.searchGroup("РЖД");
        phoneBook.searchGroup("Друзья");
        phoneBook.searchGroup("Работа");



        // Поиск по номеру телефона
        System.out.println("Поиск \"Танька, Маша, ЭЧ\" по номеру телефона/имени: \n");

        System.out.println(phoneBook.numberSearch("777777")); // находит контакт

        System.out.println(phoneBook.numberSearch("477874")); //не существует контакта

        Contact contact = phoneBook.numberSearch("154651");

        if (contact != null) {
            contact.setName("ДД");
            System.out.println("Имя изменено на " + contact);
        } else {
            System.out.println("Такого контакта нет, внести изменения невозможно ");
        }

        System.out.println("\nОбновленная телефонная книга: \n");
        phoneBook.printPhoneBook();

        System.out.println("\nПрограмма завершена ");
    }
}