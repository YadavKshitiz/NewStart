package com.example.newstart.ui.navigation

const val Detail_Argument_Key = "id"
const val Detail_Argument_Key1 = "name"

const val Authentication_Route = "auth"
const val Home_Route = "home"
const val Root_Route = "root"


//sealed class Screen(val route: String) {
//    object Home : Screen(route = "home_screen")
//    object Detail : Screen(route = "detail_screen/{$Detail_Argument_Key}/{$Detail_Argument_Key1}") {
////        fun passId(id:Int):String {
//////        return "detail_screen/$id"
////        return this.route.replace(oldValue = "{$Detail_Argument_Key}", newValue = id.toString())
////        }
//
//        fun passName(id: Int, name: String): String {
//            return "detail_screen/$id/$name"
//        }
//    }
//}



// Optional Arguments
sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Detail : Screen(route = "detail_screen?id={id}") {
        fun passId(id:Int=0):String{
            return "detail_screen?id=$id"
        }
    }

    object Login : Screen(route = "login_screen")
    object SignUp : Screen(route = "signup_screen")
}
