package com.example.myvitamindtracker.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vitamin_records")
data class VitaminEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val timestamp: Long
)