// @GENERATOR:play-routes-compiler
// @SOURCE:/home/admin1/Documents/play framework/login/conf/routes
// @DATE:Tue May 21 18:55:53 IST 2019


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
