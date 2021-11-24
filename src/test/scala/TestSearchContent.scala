import org.scalatest.flatspec.AnyFlatSpec

class TestSearchContent extends AnyFlatSpec {
  // Test Case for valid path
  val testObj = new SearchContent("./src")
  "If path is valid, it" should "return the path of sub directories" in{
    assert(testObj.content== List("()"))
  }
  // Test Case for invalid path
  val testObj2 = new SearchContent("./sr")
  "If path given is not vaild, it " should "return"in{
    assert(testObj2.content==List("This path is invalid"))
  }
  // Test Case for no path
  val testObj3= new SearchContent("")
  "If path field is empty" should "return"in{
    assert(testObj3.content==List("This path is invalid"))
  }
}
