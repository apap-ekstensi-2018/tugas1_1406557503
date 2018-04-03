package com.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.model.ProdiModel;

@Mapper
public interface ProdiMapper {
	
		@Select("select nama_prodi from program_studi where id = #{id_prodi}")
	    ProdiModel selectProdiNama (@Param("id_prodi") Integer id_prodi);
}
