package Ecommerce;

import PoJo.Book;
import PoJo.Books;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class Rest6 {

    @Test
    public void getbooksPojo()
    {
        RestAssured.baseURI="https://demoqa.com";

             Book book=given().when().get("/BookStore/v1/Books").then().assertThat().statusCode(200).extract().
                response().as(Book.class);

        List<Books> books =book.getBooks();

              int size=books.size();

              for(int i=0;i<size;i++)
              {
                 String author=books.get(i).getAuthor();
                 System.out.println(author);
              }

              System.out.println( " Using Streams ");

              List<String> names=books.stream().filter(book1->book1.getAuthor().contains("Addy"))
                      .map(Books::getAuthor).collect(Collectors.toList());

              names.forEach(System.out::println);

        System.out.println( " Using Streams without filter ");
              books.stream().map(Books::getPages).filter(page->page>300).forEach(System.out::println);
    }
}
