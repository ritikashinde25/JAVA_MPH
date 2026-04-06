package com.test;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;


@Entity
@Table(name = "movies")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn( name = "movie_type", discriminatorType = DiscriminatorType.STRING )
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int Id;
	
	private String m_name;
	
	private String m_location;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_location() {
		return m_location;
	}

	public void setM_location(String m_location) {
		this.m_location = m_location;
	}

	
	
	
	
}
