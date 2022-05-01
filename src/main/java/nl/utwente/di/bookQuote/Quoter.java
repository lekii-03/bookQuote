package nl.utwente.di.bookQuote;

import java.util.HashMap;

public class Quoter {

        public double getBookPrice(String isbn) {
            HashMap<String, Double> map = new HashMap<>();
            map.put("1", 10.0);
            map.put("2", 45.0);
            map.put("3", 20.0);
            map.put("4", 35.0);
            map.put("5", 50.0);

            if (map.containsKey(isbn))
                return map.get(isbn);
            return 0.0;

        }
    }

