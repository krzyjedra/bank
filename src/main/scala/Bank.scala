class Bank {
  def open = println("New bank has been founded")

  val accounts = Seq.empty[Account]

  def transfer(firstacc: Account, secondacc: Account, amount: Int) = {
    if (amount <= firstacc.balance) firstacc.balance - amount & secondacc.balance + amount
    else println("Current balance is not sufficient to transfer such amount")
  }
}

case class Account(balance: Int, accnr: Int) {

  def deposit(amount: Int) = balance + amount

  def withdraw(amount: Int) = {
    if (balance >= amount) balance - amount
    else println("Current balance is not sufficient to withdraw such amount")
  }

  def statement = println(balance)

  def close = {
    withdraw(balance)
//    println("Your account has been closed")
  }
}

object Main extends App {
  val mbank = new Bank
  mbank.open
  val account1 = Account(1000, 22042022)
  val operationDepo = account1.deposit(500)
  val account2 = Account(1200, 23042022)
  val operationWithd = account2.withdraw(3000)
  mbank.transfer(account1, account2, 500)
  account2.statement
  account2.close
}