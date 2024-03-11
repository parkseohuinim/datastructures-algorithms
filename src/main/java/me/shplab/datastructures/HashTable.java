package me.shplab.datastructures;

import java.util.Objects;

public class HashTable {
    public Slot[] hashTable;

    public HashTable(Integer size) {
        this.hashTable = new Slot[size];
    }

    public static class Slot {
        String key;
        String value;

        Slot(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public int hash(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    public void saveData(String key, String value) {
        int address = this.hash(key);

        if (this.hashTable[address] != null) {
            if (Objects.equals(this.hashTable[address].key, key)) {
                this.hashTable[address].value = value;
            } else {
                int curAddress = address + 1;
                while (this.hashTable[curAddress] != null) {
                    if (Objects.equals(this.hashTable[curAddress].key, key)) {
                        this.hashTable[curAddress].value = value;
                        return;
                    } else {
                        curAddress++;
                        if (curAddress >= this.hashTable.length) {
                            return;
                        }
                    }
                }
                this.hashTable[curAddress] = new Slot(key, value);
            }
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
    }

    public String getData(String key) {
        int address = this.hash(key);
        if (this.hashTable[address] != null) {
            if (Objects.equals(this.hashTable[address].key, key)) {
                return this.hashTable[address].value;
            } else {
                int currAddress = address + 1;
                while (this.hashTable[currAddress] != null) {
                    if (Objects.equals(this.hashTable[currAddress].key, key)) {
                        return this.hashTable[currAddress].value;
                    } else {
                        currAddress++;
                        if (currAddress >= this.hashTable.length) {
                            return null;
                        }
                    }
                }
                return null;
            }
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(20);

        hashTable.saveData("Dohyun", "2313");
        hashTable.saveData("Seohui", "1986");
        hashTable.saveData("Sooyeon", "1234");

        System.out.println(hashTable.getData("Dohyun"));
        System.out.println(hashTable.getData("Seohui"));
        System.out.println(hashTable.getData("Sooyeon"));
    }
}
