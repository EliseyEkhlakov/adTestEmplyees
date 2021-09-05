package com.adOrly.testemplyees;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import adapter.EmployeeAdapter;
import pojo.Employee;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewEmplyees;
    private EmployeeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewEmplyees = findViewById(R.id.recyclerViewEmployees);
        adapter = new EmployeeAdapter();
        recyclerViewEmplyees.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewEmplyees.setAdapter(adapter);
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee1.setName("Иван");
        employee2.setName("Иван2");
        employee1.setlName("Иванов");
        employee2.setlName("Колыванов");
        employees.add(employee1);
        employees.add(employee2);
        adapter.setEmployees(employees);
    }
}