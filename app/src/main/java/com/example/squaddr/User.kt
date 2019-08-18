package com.example.squaddr

/**
 * The User data class is a low-level class used only for storing account/user details.
 * Since users can by members of many squads under many personas
 */

data class User constructor(var username: String = "DefaultUsername", var email: String = "DefaultEmail@mail.server")