fun main (args:Array<String>) {
  println(getlength('This is a string!'))
}
fun getlength(str:String) :Int{

  if(str == null){
    return 0
  }
  else{
    return  str.length
  }
}

part2//