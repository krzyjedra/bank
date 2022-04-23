import org.scalatest._
import flatspec._
import matchers._

class AccountSpec extends AnyFlatSpec with should.Matchers {
  "Account" should "return current balance after deposit" in {
    val balance = 1000
    val amount = 500
    val account1 = Account(balance, 22042022)
    val actual = account1.deposit(amount)
    val expected = balance + amount
    actual shouldBe expected
  }
}
