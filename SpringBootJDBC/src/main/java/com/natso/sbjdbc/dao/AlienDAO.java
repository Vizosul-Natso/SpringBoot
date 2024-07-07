package com.natso.sbjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.*;

import com.natso.sbjdbc.model.Alien;

@Repository
public class AlienDAO {
	
	private JdbcTemplate template;
	
	
	public JdbcTemplate getTemplate() {
		return template;
	}
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void save(Alien alien) {
		
		String sql = "insert into alien (id, name, tech) values (?,?,?)";
		
		int rows = template.update(sql, alien.getId(),alien.getName(),alien.getTech());
		System.out.println("no of rows affected "+rows);
		
	}
	
	public List<Alien> findAll(){
		
		String sql = "select * from alien";
			
		org.springframework.jdbc.core.RowMapper<Alien> mapper = new org.springframework.jdbc.core.RowMapper<Alien>() {

			@Override
			public Alien mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Alien a = new Alien();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setTech(rs.getString(3));
				
				return a;
			}
		};
		
		List<Alien> aliens = template.query(sql, mapper);
			
		return aliens;
	}

}
