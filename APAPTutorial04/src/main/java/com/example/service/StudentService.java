package com.example.service;

import java.util.List;

import com.example.model.FakultasModel;
import com.example.model.ProdiModel;
import com.example.model.StudentModel;

public interface StudentService
{
StudentModel selectStudent (String npm);
    
    ProdiModel selectProdi (Integer id_prodi);
    
    ProdiModel selectProdiNama (Integer id_prodi); 
    
    FakultasModel selectFakultas (Integer id_fakultas);
    
   // String selectNpm (String npm);

    List<StudentModel> selectAllStudents ();

    void addStudent (StudentModel student);

    void deleteStudent (String npm);
    
    void updateStudent (StudentModel student);
    
    
}
