# Java-project
## Overview
This project is a Java coded application that is developed by me. The application demonstrates a stock management systen for Car Parts and Accessories shop. It allows users to stock items, add/update prices and view item details
## Requirements
- Java Development Kit (JDK) 17 or later
- Any Java IDE such as VS Code, IntelliJ, Eclipse or BlueJ
- No external libraries required — Java Swing is built into Java

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

**Creating a Stock Item**
1. Enter a stock code in the Stock Code field e.g. W101
2. Enter the quantity e.g. 10
3. Enter the price without VAT e.g. 99.99
4. Select the item type from the dropdown
5. Click Create Item
6. The item details will appear in the output area

**Adding Stock**
1. Select the item from the dropdown
2. Enter the amount to add in the Amount field
3. Click Add Stock
4. The updated quantity will be shown in the output area
5. Adding less than 1 unit or exceeding 100 total units will show an error

**Selling Stock**
1. Select the item from the dropdown
2. Enter the amount to sell in the Amount field
3. Click Sell Stock
4. If successful the reduced quantity will be shown
5. If there is not enough stock an error message will appear

**Changing Price**
1. Select the item from the dropdown
2. Enter the new price without VAT in the Amount field
3. Click Change Price
4. The updated price with and without VAT will be shown

**Displaying Item Details**
1. Select the item from the dropdown
2. Click Display Details
3. The full item information will appear in the output area

## VAT Calculation

All prices are stored without VAT. The VAT rate is 17.5%.

Price with VAT = Price without VAT x 1.175

For example 99.99 without VAT = 117.48825 with VAT

## Setup Instructions 
1. Gain access to the Github repository
2. Go to the Assignment folder
3. Compile all Java files
4. Run the GUI application
5. Run the NavSys console test
6. Run the Polymorphism test

