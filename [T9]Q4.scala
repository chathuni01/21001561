class Accounts(val initialBalance: Double) {
    private var balance: Double = initialBalance

    def deposit(amount: Double): Unit = {
        require(amount > 0, "Deposit amount should be positive")
        balance += amount
    }

    def withdraw(amount: Double): Unit = {
        require(amount > 0, "Withdrawal amount should be positive")
        require(amount <= balance, "Insufficient balance")
        balance -= amount
    }

    def applyInterest(): Unit = {
        if(balance > 0) {
            balance += balance * 0.05
        }
        else {
            balance += balance * 0.1
        }
    }

    def getBalance: Double = balance

    override def toString: String = {
        s"Account(name=${this.getClass.getSimpleName}, balance=$balance)".stripPrefix("Account(")
    }
}

class Bank(accounts: List[Accounts]) {
    def negativeBalanceAccounts: List[Accounts] = {
        accounts.filter(_.getBalance < 0)
    }

    def totalBalance: Double = {
        accounts.map(_.getBalance).sum
    }

    def applyInterestToAllAccounts(): Unit = {
        accounts.foreach(_.applyInterest())
    }
}

object Bank {
    def main(args: Array[String]): Unit = {
        val account1 = new Accounts(100)
        val account2 = new Accounts(-200)
        val account3 = new Accounts(500)

        val bank = new Bank(List(account1, account2, account3))
    
        println(s"List of accounts with negative balances: ${bank.negativeBalanceAccounts.map(_.toString)}")
        println(s"Total balance of all accounts: ${bank.totalBalance}")
    
        bank.applyInterestToAllAccounts()
    
        val negativeBalanceAccounts = bank.negativeBalanceAccounts
        println("Balances after applying interest:")
        for (account <- negativeBalanceAccounts) {
            println(s"Account: ${account.getBalance}")
        }
    }
}
