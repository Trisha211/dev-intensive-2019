package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?) :Pair<String?, String?> {
        val parts : List<String>? = fullName?.split(" ")
        var firstName =  parts?.getOrNull(0)
        var lastName = parts?.getOrNull(1)
        if(fullName?.isBlank() == true ) {
            firstName = null
            lastName = null
        }
        return Pair(firstName, lastName)
    }

    fun transliteration(payload: String, divider: String = " "): String {
        TODO()
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        var firstInitial:String?
        var lastInitial:String?
        var initial:String? = null

        if((firstName?.isBlank() == true || firstName == null) && (lastName?.isBlank() != true && lastName != null)) {
            lastInitial = "${lastName?.get(0)}"
            initial = "${lastInitial?.toUpperCase()}"
        }
        if ((firstName?.isBlank() != true && firstName != null) && (lastName?.isBlank() == true || lastName == null)) {
            firstInitial = "${firstName?.get(0)}"
            initial = "${firstInitial?.toUpperCase()}"
        }

        if ((firstName?.isBlank() != true && firstName != null) && (lastName?.isBlank() != true && lastName != null)) {
            firstInitial = "${firstName?.get(0)}"
            lastInitial = "${lastName?.get(0)}"
            initial = "${firstInitial?.toUpperCase()}${lastInitial?.toUpperCase()}"
            initial?.toUpperCase()
        }

        return initial
    }
}