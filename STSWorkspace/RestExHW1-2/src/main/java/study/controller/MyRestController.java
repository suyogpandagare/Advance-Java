package study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.rest.Book;

@RestController
@RequestMapping(path = "/book")
public class MyRestController {

	@Autowired
	private JdbcTemplate template; 

	//1-done
	@GetMapping("/getAll")
	public List<Book> getAllBooks()
	{
		List<Book> list = template.query("select * from book", (rs,rownum)->{ return new Book(rs.getString(1),rs.getString(2),rs.getInt(3));});
		return list;
	}

	//2-done
	@GetMapping("/get/{bookName}")
	public List<Book> getBooks(@PathVariable ("bookName") String bName)
	{
		List<Book> list = template.query("select * from book where bookName = '"+bName+"'", (rs,rownum)->{return new Book(rs.getString(1),rs.getString(2),rs.getInt(3));});
		return list;
	}

	//3-done
	@GetMapping("/allAuthors")
	public List<String> getAllAuthors()
	{
		List<String> list = template.query("select author from book", (rs,rownum)->{return (rs.getString(1));});
		return list;
	}

	//4-done
	@PostMapping("/add")
	public String insertBook(@RequestBody Book b)
	{
		template.update("insert into book values(?,?,?)",b.getBookName(),b.getAuthor(),b.getCost());
		return "Book Added Successfully";
	}
	
	//5-done
	@PutMapping("/changename/{oldbookname}/{newbookname}")
	public String editbookName(@PathVariable ("oldbookname") String obname,@PathVariable ("newbookname") String nbname)
	{
		template.update("update book set bookName = '"+nbname+"' where bookName = '"+obname+"'");

		return "updated successfully";
	}
	
	//6-done
	@PutMapping("/changecost/{bookName}/{bookCost}")
	public String updateBookCost(@PathVariable ("bookName") String bname,@PathVariable ("bookCost") int bcost)
	{
		template.update("update book set cost = '"+bcost+"' where bookName = '"+bname+"'");

		return "updated successfully";
	}
	
	//7-done
	@PutMapping("/deletebyname/{bookName}")
	public String deleteByName(@PathVariable ("bookName") String bname)
	{
		template.update("delete from book where bookName = '"+bname+"'");

		return "deleted successfully";
	}
	

}
