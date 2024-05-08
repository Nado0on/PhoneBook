import java.util.*;
//name : phoneNumber1, phoneNumber1
//name: phoneNumber

public class PhoneBook {

    //name : phoneNumber or PhoneNumber1 or phoneNumber2
    // String, ArrayList of strings, Map of some kind
    // key is String and values is arrayList of String
    private Map<String, List<String>> phoneRecord;

    public PhoneBook() {
        this(new HashMap<>());
    }

    public PhoneBook(Map<String, List<String>> phoneRecord) {
        this.phoneRecord = phoneRecord;
    }

// create a method to add a number to the phonebook

    public void add(String name, String phoneNumber) {
        phoneRecord.put(name, numbers);
        List<String> numbers = new ArrayList<>();
        numbers.add(phoneNumber);

    }

    // create a method to addALL Numbers to a phoneRecord
    public void addAll(String name, String... phoneNumbers) {
        // put the record in the map by key and values
        //  Map<String, Integer> map = new HashMap<>();
        List<String> numbers = phoneRecord.getOrDefault(name, new ArrayList<>());
        for (String phoneNumber : phoneNumbers) {
            numbers.add(phoneNumber);
        }
        phoneRecord.put(name, numbers);
    }

    //method to remove a person
    public void remove(String name) {
        // remove from the map
        phoneRecord.remove(name);
    }

    //HasEntry - to check if entry exist
    public Boolean hasEntry(String name) {
        //check if name exist in record and return true
        return phoneRecord.containsKey(name);
    }

    //lookUp (name) - return phone number(s)
    public List<String> lookup(String name) {
        //return a list of phone numbers that belong to that name
        return phoneRecord.getOrDefault(name, new ArrayList<>());

    }

    // reverse loop (phoneNumber) - return phone name
    public String reverseLookup(String phoneNumber) {
        //takes a phone number and returns the name attached to the number
        List<String> listIterator = phoneRecord.listIterator(phoneRecord.size());
//                while(listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
        return null;
    }

    // Get all our contacts names in the phoneBook
    public List<String> getAllContactNames() {
        // need a list or a container to store the names
        List<String> contacts = new ArrayList<>();
        //need to iterate through the map//
        for (String name : phoneRecord.keySet()) {
            contacts.add(name);
        }
        // add each name to list or container
        //return the container
        return contacts;

    }

}
