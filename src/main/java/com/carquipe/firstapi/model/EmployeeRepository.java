package com.carquipe.firstapi.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    /* This interface packs supports:
    * - Creating new instances
    * - Updating existing ones
    * - Deleting
    * - Finding (one, all, by simple or complex properties
    */
}