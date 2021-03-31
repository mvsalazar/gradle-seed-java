// @GENERATOR:play-routes-compiler
// @SOURCE:/home/msalazar/Documents/Code/gradle-seed-java/conf/routes
// @DATE:Tue Mar 30 17:00:21 PDT 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
