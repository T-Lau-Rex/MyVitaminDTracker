package com.example.myvitamindtracker.data.local

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface VitaminDao {

    // Inserta un registro
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(record: VitaminEntity)

    // Elimina un registro
    @Delete
    suspend fun delete(record: VitaminEntity)

    // Muestra la lista con los registros
    @Query("SELECT * FROM vitamin_records ORDER BY timestamp DESC")
    fun getAllRecords(): Flow<List<VitaminEntity>>
}