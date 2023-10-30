package com.example.odev_3.domain.repository

import com.example.odev_3.domain.models.Employee

interface ServiceRepository {
    fun getEmployees(callback: (List<Employee>) -> Unit)
}