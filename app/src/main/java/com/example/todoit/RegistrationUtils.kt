package com.example.todoit

object RegistrationUtils {

    private val existingUsers = listOf("Sagar","Akash")
    /**
     * the input is not valid if...
     * ...no space in username
     * ...the username/password is empty
     * ...the username is already taken
     * ...the confirmed password is not same as first
     * ...the password contains less than eight chars
     * ...the password contains no digit TODO
     */
    fun validateRegistrationInput(
        userName : String,
        password: String,
        confirmPassword: String
    ): Boolean{
        if(userName.isEmpty() || userName.contains(' ') || existingUsers.contains(userName))return false
        if(password.isEmpty() || password.length<8 || !password.contains(regex =  "[0-9]".toRegex()) || password!=confirmPassword)return false
        return true
    }
}