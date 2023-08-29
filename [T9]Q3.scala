class Account(initialBalance: Double) {
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

    def transfer(amount: Double, toAccount: Account): Unit = {
        require(amount > 0, "Transfer amount should be positive")
        require(amount <= balance, "Insufficient balance for transfer")
        
        withdraw(amount)
        toAccount.deposit(amount)
    }

    def getBalance: Double = balance
}

object Account {
    def main(args: Array[String]): Unit = {
        val account1 = new Account(1000)
        val account2 = new Account(500)

        println(s"Initial balance in Account 1: ${account1.getBalance}")
        println(s"Initial balance in Account 2: ${account2.getBalance}")

        account1.deposit(200)
        account2.withdraw(100)

        println(s"Balance in Account 1 after deposit: ${account1.getBalance}")
        println(s"Balance in Account 2 after withdrawal: ${account2.getBalance}")

        account1.transfer(300, account2)

        println(s"Balance in Account 1 after transfer: ${account1.getBalance}")
        println(s"Balance in Account 2 after transfer: ${account2.getBalance}")
    }
}
