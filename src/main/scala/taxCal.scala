import scala.io.StdIn._
​
object TaxCalculator extends App {
  println("Please Enter your income: ")
  val income = readInt()
  val incomeCap1 = 10000
  val incomeCap2 = 30000
  val incomeCap3 = 100000
  // if income >= incomeCap1
  //  val taxIncome =  income - incomeCap1
  //  println(taxIncome)
  //  val result1 = taxIncome * 0.1
  //  println(result1)

  if (income < incomeCap1) {
    println("You have not been taxed £" + income)
  } else if (income >= incomeCap1 & income <= incomeCap2) {
    val taxIncome =  income - incomeCap1
    val result1 = taxIncome * 0.1
    println("You have been taxed £" + result1)
  } else if (income >= incomeCap2 & income <= incomeCap3) {
    val taxIncome = income - incomeCap2
    val result2 = taxIncome * 0.35
    println("You have been taxed £" + result2)
  }
  else if (income >=incomeCap3){
    val taxIncome =  income - incomeCap3
    val result3 = taxIncome * 0.75
    println("You have been taxed £" + result3)
  } else
    println("Work harder you have not been taxed")

}

