package ru.skillbranch.devintensive.extensions

import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.models.UserView
import ru.skillbranch.devintensive.utils.Utils
import java.util.*

fun User.toUserView() : UserView{
    val nickName = Utils.transliteration("$firstName $lastName")
    val initials = Utils.toInitials(firstName, lastName!!)
    val status = if(lastVisit == null) "Еще ни разу не был" else if(isOnline) "online" else "Был ${lastVisit!!.humanizeDiff()}"
    return UserView(
        id,
        fullName = "$firstName $lastName",
        nickName = nickName,
        initials = initials,
        avatar = avatar,
        status = status)
}

fun truncate(stroka: String?, numberOfSymbols: Int = 16) : String? {
    var newStroka = stroka?.trimEnd()
    var i: Int = newStroka!!.length
    if(i > numberOfSymbols && !newStroka[numberOfSymbols - 1].equals(" ")) {
        newStroka = "${stroka?.substring(0, numberOfSymbols)}"
        newStroka = newStroka?.trimEnd()
        newStroka= "$newStroka..."
    }

    return newStroka
}

