package com.example.myvitamindtracker.data.local

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "vitamin_records", indices = [Index(value = ["date"], unique = true)])
data class VitaminEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val timestamp: Long,
    val date: String // YYYY-MM-DD format. To avoid duplicates records
)