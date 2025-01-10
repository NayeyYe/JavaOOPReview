package QuesFifteen.ProgramThree;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    // 添加联系人
    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println("联系人添加成功: " + name + " - " + phoneNumber);
    }

    // 删除联系人
    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("联系人删除成功: " + name);
        } else {
            System.out.println("联系人不存在: " + name);
        }
    }

    // 查找联系人
    public void findContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("联系人信息: " + name + " - " + contacts.get(name));
        } else {
            System.out.println("联系人不存在: " + name);
        }
    }

    // 显示所有联系人
    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("电话簿为空。");
        } else {
            System.out.println("电话簿中的联系人:");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

}
