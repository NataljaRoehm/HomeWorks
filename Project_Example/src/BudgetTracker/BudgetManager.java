package BudgetTracker;

import java.util.Scanner;

class BudgetManager {
  private Budget budget;
  private Scanner scanner;

  public BudgetManager() {
    budget = new Budget();
    scanner = new Scanner(System.in);
  }

  public void showMenu() {
    System.out.println("1. Добавить расход ");
    System.out.println("2. Удалить расход ");
    System.out.println("3. Получить статистику за период ");
    System.out.println("4. Получить статистику по категориям ");
    System.out.println("5. Сохранить расходы в файл ");
    System.out.println("6. Загрузить расходы из файла ");
    System.out.println("7. Показать все расходы ");
    System.out.println("8. Выход ");
    System.out.print("Введите ваш выбор: ");
  }

  public void chooseOption() {
    int choice = scanner.nextInt();
    scanner.nextLine(); // Consume newline character
    switch (choice) {
      case 1:
        addExpense();
        break;
      case 2:
        removeExpense();
        break;
      case 3:
        getPeriodStatistics();
        break;
      case 4:
        getCategoryStatistics();
        break;
      case 5:
        saveExpensesToFile();
        break;
      case 6:
        loadExpensesFromFile();
        break;
      case 7:
        displayAllExpenses();
        break;
      case 8:
        exitProgram();
        break;
      default:
        System.out.println("Неверный ввод" + choice);
    }
  }

  public void addExpense() {
    System.out.print("Введите сумму: €");
    double amount = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("Введите категорию: ");
    String category = scanner.nextLine();
    System.out.print("Введите дату: ");
    String date = scanner.nextLine();
    Expense expense = new Expense(amount, category, date);
    budget.addExpense(expense);
    System.out.println("Расход успешно добавлен");
  }

  public void removeExpense() {
    System.out.print("Введите индекс расхода для удаления: ");
    int index = scanner.nextInt();
    scanner.nextLine();
    budget.removeExpense(index);
  }

  public void getPeriodStatistics() {
    System.out.print("Введите начальную дату: ");
    String startDate = scanner.nextLine();
    System.out.print("Введите конечную дату: ");
    String endDate = scanner.nextLine();
    budget.getPeriodStatistics(startDate, endDate);
  }

  public void getCategoryStatistics() {
    System.out.print("Введите категорию: ");
    String category = scanner.nextLine();
    budget.getCategoryStatistics(category);
  }

  public void saveExpensesToFile() {
    System.out.print("Введите имя файла: ");
    String fileName = scanner.nextLine();
    budget.saveExpensesToFile(fileName);
  }

  public void loadExpensesFromFile() {
    System.out.print("Введите имя файла: ");
    String fileName = scanner.nextLine();
    budget.loadExpensesFromFile(fileName);
  }

  public void displayAllExpenses() {
    budget.displayAllExpenses();
  }

  public void exitProgram() {
    budget.saveExpensesToFile("res/expenses.txt");
    System.out.println("Выход из программы");
    System.exit(0);
  }

  public void run() {
    budget.loadExpensesFromFile("res/expenses.txt");
    while (true) {
      showMenu();
      chooseOption();
    }
  }
}