package BudgetTracker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Budget {
  private List<Expense> expenses;

  public Budget() {
    expenses = new ArrayList<>();
  }

  public void addExpense(Expense expense) {
    expenses.add(expense);
  }

  public void removeExpense(int index) {
    if (index >= 0 && index < expenses.size()) {
      expenses.remove(index);
      System.out.println("Расход успешно удален");
    } else {
      System.out.println("Неверный индекс расхода");
    }
  }

  public void getPeriodStatistics(String startDate, String endDate) {
    double totalExpenses = 0;
    for (Expense expense : expenses) {
      if (expense.getDate().compareTo(startDate) >= 0 && expense.getDate().compareTo(endDate) <= 0) {
        totalExpenses += expense.getAmount();
        expense.displayInfo();
      }
    }
    System.out.println("Общие расходы за указанный период: €" + totalExpenses);
  }

  public void getCategoryStatistics(String category) {
    double totalExpenses = 0;
    for (Expense expense : expenses) {
      if (expense.getCategory().equals(category)) {
        totalExpenses += expense.getAmount();
        expense.displayInfo();
      }
    }
    System.out.println("Общие расходы за указанный период: €" + totalExpenses);
  }

  public void saveExpensesToFile(String fileName) {
    try {
      FileWriter writer = new FileWriter(fileName);
      for (Expense expense : expenses) {
        writer.write(expense.getAmount() + "," + expense.getCategory() + "," + expense.getDate() + "\n");
      }
      writer.close();
      System.out.println("Расходы успешно сохранены в файл");
    } catch (IOException e) {
      System.out.println("Ошибка при сохранении расходов в файл");
    }
  }

  public void loadExpensesFromFile(String fileName) {
    try {
      File file = new File(fileName);
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] parts = line.split(",");
        if (parts.length == 3) {
          double amount = Double.parseDouble(parts[0]);
          String category = parts[1];
          String date = parts[2];
          Expense expense = new Expense(amount, category, date);
          expenses.add(expense);
        }
      }
      scanner.close();
      System.out.println("Расходы успешно загружены из файла.");
    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден.");
    }
  }

  public void displayAllExpenses() {
    for (Expense expense : expenses) {
      expense.displayInfo();
      System.out.println();
    }
  }
}