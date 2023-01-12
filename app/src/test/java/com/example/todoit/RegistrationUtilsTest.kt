package com.example.todoit

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class RegistrationUtilsTest {

    @Test
    fun `user is empty_returns false`() {
        val result = RegistrationUtils.validateRegistrationInput("","sagar12345","sagar12345")
        assertThat(result).isFalse()
    }
    @Test
    fun `repeated username_returns false`() {
        val result = RegistrationUtils.validateRegistrationInput("Sagar","sagar12345","sagar12345")
        assertThat(result).isFalse()
    }
    @Test
    fun `both password not same_returns false`() {
        val result = RegistrationUtils.validateRegistrationInput("Sagar","sagar12345","sagar123456")
        assertThat(result).isFalse()
    }
    @Test
    fun `small password_returns false`() {
        val result = RegistrationUtils.validateRegistrationInput("Sagar","abc","abc")
        assertThat(result).isFalse()
    }
    @Test
    fun `no digit password_returns false`() {
        val result = RegistrationUtils.validateRegistrationInput("NewUser","qwertyuiop","qwertyuiop")
        assertThat(result).isFalse()
    }
    @Test
    fun `all correct return true`() {
        val result = RegistrationUtils.validateRegistrationInput("NewUser","sagar12345","sagar12345")
        assertThat(result).isTrue()
    }
    @Test
    fun `space username_returns false`() {
        val result = RegistrationUtils.validateRegistrationInput("Sagar Malhotra","qwertyuiop","qwertyuiop")
        assertThat(result).isFalse()
    }
}