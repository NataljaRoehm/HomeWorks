package BudgetTracker;

class Expense {
  private double amount;
  private String category;
  private String date;

  public Expense(double amount, String category, String date) {
    this.amount = amount;
    this.category = category;
    this.date = date;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public void displayInfo() {
    System.out.println("Сумма в € : " + amount);
    System.out.println("Категория: " + category);
    System.out.println("Дата: " + date);
  }
}
