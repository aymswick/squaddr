package com.example.squaddr

import androidx.test.runner.AndroidJUnit4
import junit.framework.Assert.assertFalse
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class SquadTest {

    @Test
    fun createSquad() {
        val testUser1 = User("bob123", "john@sample.com")
        val testUser2 = User("sarah5", "sarah@test.net")
        val testUser3 = User("red099", "red@stiolkj.biz")

        val testSquad = Squad("Hungry Ducks", testUser1)
        testSquad.addUser(testUser2)
        assert(testSquad.creator == testUser1)
        assert(testSquad.members.contains(testUser2))
        assertFalse(testSquad.members.contains(testUser3))
    }
}