package mylibling


object LiblingWithDependencies {

  def libling = "My favorite library"

  val transitiveFish = cellar.skeleton.fish

  def printStuff = {
    println(libling)
    println(transitiveFish)
  }
}