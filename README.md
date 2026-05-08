# Java-project
## Overview
This project is a Java coded application that is developed by me. The application demostrates a stock management systen for Car Parts and Accessories shop. It allows users to stock items, add/update prices and view item details
## Project Structure
├── Assignment/
│   ├── StockItem.java
│   ├── NavSys.java
│   ├── CarBattery.java
│   ├── CarTyres.java
│   ├── WindscreenWipers.java
│   ├── StockItemGUI.java
│   ├── TestNavSys.java
│   └── TestPolymorphism.java
├── Diagrams for assignment/
│   ├── UML_class_diagram.pdf
│   ├── NavSys_table.pdf
│   └── Updated_test_cases_with_NavSys.pdf
└── README.md
## Class Descriptions
- StockItem --> The base class for all stock items in the shop and stores the stock code, quantity and price.
- NavSys --> A subclass of StockItem representing GeoVision Sat Nav navigation systems
- CarBattery --> A subclass of StockItem representing car batteries, has two additional private attributes voltage and capacity
- CarTyres --> A subclass of StockItem representing car tyres, has two additional private attributes tyreSize and tyreType
- WindscreenWipers --> A subclass of StockItem representing windscreen wipers, has two additional private attributes bladeLength and compatiblity
## How to use the GUI
1. Enter a stock code in the Stock Code field e.g. W101
2. Enter the quantity e.g. 10
3. Enter the price without VAT e.g. 99.99
4. Select the item type from the dropdown
5. Click Create Item
6. The item details will appear in the output area
