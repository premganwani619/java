import java.util.*;

public class FindItineraryFromTickets {
    public static String findStartFromTickets(HashMap<String, String> tickets) {
        HashMap<String, String> reverseHashMap = new HashMap<>();

        for (String keys : tickets.keySet()) {
            reverseHashMap.put(tickets.get(keys), keys);
        }
        for (String keys : tickets.keySet()) {
            if (!reverseHashMap.containsKey(keys)) {
                return keys;
            }
        }
        return null;
    }

    public static void FinditineraryFromTickets(HashMap<String, String> tickets, String start) {
        while (tickets.containsKey(start)) {
            System.out.print(start + "->");
            start = tickets.get(start);
        }
        System.out.print(start);
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        String start = findStartFromTickets(tickets);
        FinditineraryFromTickets(tickets, start);

    }
}
