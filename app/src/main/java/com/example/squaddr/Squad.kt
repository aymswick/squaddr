package com.example.squaddr

/**
 * Basic class to hold the members of a squad. Allows adding/removing of members. When a Squad is created,
 * the creator is the sole member.
 */

class Squad (var title: String, var creator: User, var members: MutableSet<User> = mutableSetOf(creator)) {

    fun addUser(vararg users : User) {
        for(user in users) {
            this.members.add(user)
        }

    }

    fun removeUser(user: User) {
        this.members.remove(user)
    }
}

