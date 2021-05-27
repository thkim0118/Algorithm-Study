package thkim.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapLevel2 {

    public boolean solution___(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        HashMap<String, String> hashMap = new HashMap<>();

        for (String phoneNum : phone_book) {
            hashMap.put(phoneNum, phoneNum);

            for (int i = 0; i < phoneNum.length(); i++) {
                String mini = phoneNum.substring(0, i);

                if (hashMap.get(mini) != null) {
                    answer = false;
                    break;
                }
            }

            if (!answer) break;
        }
        return answer;
    }

    public boolean solution__(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }

        return answer;
    }

    public boolean solution_(String[] phone_book) {
        boolean answer = true;

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                String curNum = phone_book[i];
                String nextNum = phone_book[j];

                if (nextNum.startsWith(curNum)) return false;
            }
        }

        return answer;
    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        ConcurrentHashMap<String, Integer> hashMap = new ConcurrentHashMap<>();

        hashMap.put(phone_book[0], 0);

        for (int i = 1; i < phone_book.length; i++) {

            for (String key : hashMap.keySet()) {
                if (phone_book[i].equals(key)) continue;

                if (phone_book[i].startsWith(key)) {
                    return false;
                } else {
                    hashMap.put(phone_book[i], 0);
                }
            }
        }

        return answer;
    }
}
