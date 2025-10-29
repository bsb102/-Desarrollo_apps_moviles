package com.example.calendario.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.calendario.data.models.User

@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: User): Long

    @Query("SELECT * FROM users WHERE username = :username AND password = :password LIMIT 1")
    suspend fun login(username: String, password: String): User?

    @Query("SELECT * FROM users WHERE username = :username LIMIT 1")
    suspend fun getUserByUsername(username: String): User?
}