/*5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.*/
package program5C;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class countrycapital extends JFrame {

    public program5C() {
        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", "France",
                "Great Britain", "Japan", "Africa", "Greenland", "Singapore"};

        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Varies by country"); // Africa is a continent
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                for (String country : countryList.getSelectedValuesList()) {
                    System.out.println("Capital of " + country + ": " + capitals.get(country));
                }
            }
        });

        add(new JScrollPane(countryList));
        setTitle("Country Capitals");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new program5C();
    }
}

