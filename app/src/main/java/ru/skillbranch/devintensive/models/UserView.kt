package ru.skillbranch.devintensive.models

class UserView(
    val id: String,
    val fullName: String,
    val nickName: String,
    var avatar: String? = null,
    var status: String? = "offline",
    val initials: String?
) {
    fun printMe(){
        println("""
            val id: $id:
            val fullName: $fullName:
            val nickName: $nickName:
            var avatar: $avatar:
            var status: $status:
            val initials: $initials:
        """.trimIndent())
    }
}