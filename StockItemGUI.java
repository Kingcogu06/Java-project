package Assignment;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StockItemGUI {

    private ArrayList<StockItem> items = new ArrayList<>();
    private JFrame frame;
    private JTextArea displayArea;
    private JComboBox<String> itemSelector;

    public StockItemGUI() {
        buildGUI();
    }

    private void buildGUI() {
        frame = new JFrame( "Car Parts and Accessories - Stock Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(new BorderLayout());

        JPanel createPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        createPanel.setBorder(
            BorderFactory.createTitledBorder("Create New Stock Item"));

        JTextField codeField = new JTextField();
        JTextField quantityField = new JTextField();
        JTextField priceField = new JTextField();

        createPanel.add(new JLabel("Stock Code:"));
        createPanel.add(codeField);
        createPanel.add(new JLabel("Quantity:"));
        createPanel.add(quantityField);
        createPanel.add(new JLabel("Price (Without VAT):"));
        createPanel.add(priceField);
        createPanel.add(new JLabel(""));

        JButton createBtn = new JButton("Create Item");
        createPanel.add(createBtn);

        JPanel operationsPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        operationsPanel.setBorder(
            BorderFactory.createTitledBorder("Operations on Existing Item"));

        itemSelector = new JComboBox<>();
        JTextField amountField = new JTextField();

        operationsPanel.add(new JLabel("Select Item:"));
        operationsPanel.add(itemSelector);
        operationsPanel.add(new JLabel("Amount / New Price:"));
        operationsPanel.add(amountField);

        JButton addBtn = new JButton("Add Stock");
        JButton sellBtn = new JButton("Sell Stock");
        JButton priceBtn = new JButton("Change Price");
        JButton displayBtn = new JButton("Display Details");

        operationsPanel.add(addBtn);
        operationsPanel.add(sellBtn);
        operationsPanel.add(priceBtn);
        operationsPanel.add(displayBtn);

        displayArea = new JTextArea(10, 40);
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Output"));

        JPanel topSection = new JPanel(new GridLayout(2, 1));
        topSection.add(createPanel);
        topSection.add(operationsPanel);

        frame.add(topSection, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        createBtn.addActionListener(e -> {
            try {
                String code = codeField.getText().trim();
                int qty = Integer.parseInt(quantityField.getText().trim());
                double pr = Double.parseDouble(priceField.getText().trim());
                if (code.isEmpty()) {
                    displayArea.setText("Error: Stock code cannot be empty");
                    return;
                }
                StockItem item = new StockItem(code, qty, pr);
                items.add(item);
                itemSelector.addItem(code);
                displayArea.setText("Item created!\n\n" + item.toString());
                codeField.setText("");
                quantityField.setText("");
                priceField.setText("");
            } catch (NumberFormatException ex) {
                displayArea.setText("Error: Enter valid numbers");
            }
        });

        addBtn.addActionListener(e -> {
            StockItem selected = getSelectedItem();
            if (selected == null) return;
            try {
                int amount = Integer.parseInt(amountField.getText().trim());
                selected.addStock(amount);
                displayArea.setText("After adding stock:\n\n"
                    + selected.toString());
            } catch (NumberFormatException ex) {
                displayArea.setText("Error: Enter a valid number");
            }
        });

        sellBtn.addActionListener(e -> {
            StockItem selected = getSelectedItem();
            if (selected == null) return;
            try {
                int amount = Integer.parseInt(amountField.getText().trim());
                boolean success = selected.sellStock(amount);
                if (success) {
                    displayArea.setText("Sale successful!\n\n"
                        + selected.toString());
                } else {
                    displayArea.setText("Error: Not enough stock\n\n"
                        + selected.toString());
                }
            } catch (NumberFormatException ex) {
                displayArea.setText("Error: Enter a valid number");
            }
        });

        priceBtn.addActionListener(e -> {
            StockItem selected = getSelectedItem();
            if (selected == null) return;
            try {
                double newPrice = Double.parseDouble(
                    amountField.getText().trim());
                selected.setPrice(newPrice);
                displayArea.setText("Price updated!\n\n"
                    + selected.toString());
            } catch (NumberFormatException ex) {
                displayArea.setText("Error: Enter a valid price");
            }
        });

        displayBtn.addActionListener(e -> {
            StockItem selected = getSelectedItem();
            if (selected == null) return;
            displayArea.setText(selected.toString());
        });

        frame.setVisible(true);
    }

    private StockItem getSelectedItem() {
        int index = itemSelector.getSelectedIndex();
        if (index == -1) {
            displayArea.setText("Error: No item selected");
            return null;
        }
        return items.get(index);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StockItemGUI());
    }
}