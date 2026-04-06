package com.test.dao;



import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.test.model.Book;
import com.test.model.BookMapper;

/*Isolation:SERIALIZABLE
 * A constant indicating that dirty reads, non-repeatable reads, and phantom reads 
 * are prevented. This level includes the prohibitions in REPEATABLE_READ and 
 * further prohibits the situation where one transaction reads all rows that 
 * satisfy a WHERE condition, a second transaction inserts a row that satisfies 
 * that WHERE condition, and the first transaction re-reads for the same condition, 
 * retrieving the additional "phantom" row in the second read.
 * 
 * propagation:REQUIRED
 * Support a current transaction, create a new one if none exists. 
 * Analogous to EJB transaction attribute of the same name.
 * This is the default setting of a transaction annotation.
 */

@Component
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE)
public class BookDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public BookDao(DataSource dataSource)
	{
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private final String insert_sql = "insert into books(b_id, b_name, b_author, b_price)values(?,?,?,?)";
	
	private final String update_sql = "update books set b_name = ?, b_author = ?, b_price = ? where b_id = ? ";
	
	private final String delete_sql = "delete from books where b_id = ?";
	
	private final String select_sql = "select * from books";
	
	public boolean saveBooks(Book obj)
	{
		return jdbcTemplate.update(insert_sql, obj.getB_id(), obj.getB_name(), obj.getB_author(), obj.getB_price())>0;
	}
	
	public boolean updateBooks(Book obj)
	{
		return jdbcTemplate.update(update_sql, obj.getB_name(), obj.getB_author(), obj.getB_price(), obj.getB_id())>0; 
	}
	
	public boolean deleteBook(Book obj)
	{
		return jdbcTemplate.update(delete_sql, obj.getB_id())>0;
	}
	
	public List<Book> listAllBooks()
	{
		return jdbcTemplate.query(select_sql, new BookMapper());
	}
			
}
