package program5A;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class program5A {

    // Static inner class that extends JFrame
    static class CountryListDisplay extends JFrame {
        public CountryListDisplay() {
            String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", "France",
                    "Great Britain", "Japan", "Africa", "Greenland", "Singapore"};

            JList<String> countryList = new JList<>(countries);
            countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

            countryList.addListSelectionListener(e -> {
                if (!e.getValueIsAdjusting()) {
                    java.util.List<String> selected = countryList.getSelectedValuesList();
                    System.out.println("Selected countries: " + selected);
                }
            });

            add(new JScrollPane(countryList));
            setTitle("Country List");
            setSize(300, 200);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new CountryListDisplay(); // Call constructor
    }
}
